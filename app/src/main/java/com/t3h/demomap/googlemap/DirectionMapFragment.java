package com.t3h.demomap.googlemap;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.PolyUtil;
import com.t3h.demomap.Api;
import com.t3h.demomap.DirectionResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Admins on 6/17/2018.
 */

public class DirectionMapFragment extends SupportMapFragment implements OnMapReadyCallback {
    private GoogleMap googleMap;
    private Api api;
    private Polyline polyline;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getMapAsync(this);
        initApi();
    }

    public void search(String origin, String destination) {
        Call<DirectionResponse> call = api.getDirection(
                origin, destination, "AIzaSyDKH6N_vRmoLKpQ5iRsPNY0aTyE05iZPm8", "transit");
        call.enqueue(new Callback<DirectionResponse>() {
            @Override
            public void onResponse(Call<DirectionResponse> call, Response<DirectionResponse> response) {
                DirectionResponse re = response.body();
                initDirect(re);
            }

            @Override
            public void onFailure(Call<DirectionResponse> call, Throwable t) {

            }
        });
    }

    private void initDirect(DirectionResponse re) {
        if (re == null || re.getRoutes() == null || re.getRoutes().size() == 0 || re.getRoutes().get(0) == null
                || re.getRoutes().get(0).getLegs().size() == 0 ||
                re.getRoutes().get(0).getLegs().get(0).getSteps().size() == 0 ||
                re.getRoutes().get(0).getLegs().get(0).getSteps() == null
                ) {
            Toast.makeText(getContext(), "Can not search ?", Toast.LENGTH_LONG).show();
        } else {

            List<LatLng> latLngs = new ArrayList<>();
            for (DirectionResponse.RoutesBean.LegsBean.StepsBeanX step : re.getRoutes().get(0).getLegs().get(0).getSteps()) {
                //DirectionResponse.RoutesBean.LegsBean
                LatLng start = new LatLng(step.getStart_location().getLat(), step.getStart_location().getLng());
                LatLng end = new LatLng(step.getEnd_location().getLat(), step.getEnd_location().getLng());
                latLngs.add(start);
                latLngs.add(end);
            }
            if (polyline == null) {

                PolylineOptions polylineOptions = new PolylineOptions();
                polylineOptions.width(10);
                polylineOptions.color(Color.GREEN);
                polylineOptions.addAll(latLngs);
                polyline = googleMap.addPolyline(polylineOptions);
            } else {
                polyline.setPoints(latLngs);
            }
            CameraPosition cameraPosition = new CameraPosition(latLngs.get(0), 13, 1, 1);
            CameraUpdate factory = CameraUpdateFactory.newCameraPosition(cameraPosition);
            googleMap.moveCamera(factory);
            List<LatLng> latLogsOverView = PolyUtil.decode(re.getRoutes()
                    .get(0).getOverview_polyline()
                    .getPoints());
        }

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
    }

    private void initApi() {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://maps.googleapis.com")
                .addConverterFactory(GsonConverterFactory.create());
        api = builder.build().create(Api.class);
    }


}
