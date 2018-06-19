package com.t3h.demomap;

import android.*;
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v13.app.FragmentCompat;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Created by Lap trinh on 6/10/2018.
 */

public class DemoMapFragment extends SupportMapFragment
        implements OnMapReadyCallback,
        GoogleMap.OnMyLocationChangeListener,
        FragmentCompat.OnRequestPermissionsResultCallback, GoogleMap.OnInfoWindowClickListener, GoogleMap.InfoWindowAdapter {
    private static final String TAG = DemoMapFragment.class.getSimpleName();
    private GoogleMap googleMap;
    private Marker marker;
    private Geocoder geocoder;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        geocoder = new Geocoder(getContext(), Locale.getDefault());
        init();
    }

    private void init() {
        //load map tren thread khac
        getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;


        //setting google map
        //hien nut zom
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        //hien button location
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);

        //dang ky event change location
        if (checkPermission()) {
            runChangeLocation();
        }

        //hien thi thong bao khi click vao marker
        googleMap.setInfoWindowAdapter(this);

    }

    private void runChangeLocation() {
        googleMap.setMyLocationEnabled(true);
        googleMap.setOnMyLocationChangeListener(this);
    }

    private boolean checkPermission() {
        //check version android
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.LOLLIPOP_MR1) {
            return true;
        }

        //check permision location da dong y chua
        //par1: context
        //part: tem permission muon check
        //neu ==PackageManager.PERMISSION_GRANTED: permission da dong y
        if (
                ActivityCompat.checkSelfPermission(getContext(),
                        Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED
                ) {
            return true;
        } else {
            //hien thi thong nao xin quyen
            showDialogRequestPermissionLocation();
            return false;
        }
    }

    private void showDialogRequestPermissionLocation() {
        //par1: cac permission hoi nguoi dung
        //par2: requestCode: giong requestCode o startActivityForResult
        String[] par = new String[]{Manifest.permission.ACCESS_FINE_LOCATION};
        requestPermissions(par, 100);
        //
    }


    //onRequestPermissionsResult gionng method onActivityResult
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        for (int grantResult : grantResults) {
            if (grantResult == PackageManager.PERMISSION_DENIED) {
                return;
            }
        }
        //cac permission hoi nguoi dung da dong y
        runChangeLocation();
    }

    @Override
    public void onMyLocationChange(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();

        Log.d(TAG, "onMyLocationChange latitude: " + latitude);
        Log.d(TAG, "onMyLocationChange longitude: " + longitude);
        showMyLocation(latitude, longitude);
    }

    private void showMyLocation(double latitude, double longitude) {
        LatLng latLng = new LatLng(latitude, latitude);
        //tao ra marker tai vi tri latLng
        if (marker == null) {
            MarkerOptions options = new MarkerOptions();
            options.position(latLng);
            options.title("My location");
            options.icon(BitmapDescriptorFactory.defaultMarker(
                    BitmapDescriptorFactory.HUE_AZURE));
            marker = googleMap.addMarker(options);

            //cho forcus chay den my location
            CameraPosition cameraPosition =
                    new CameraPosition(latLng, 12, 1, 1);
            googleMap.moveCamera(
                    CameraUpdateFactory.newCameraPosition(cameraPosition));
        } else {
            marker.setPosition(latLng);
        }
        //noi dung nam duoi title
        marker.setSnippet( getAddress(latLng));


    }

    private String getAddress(LatLng latLng) {
        try {
            //par3:  so max result address nhan duoc
            List<Address> addresses =
                    geocoder.getFromLocation(latLng.latitude,
                            latLng.longitude,
                            1);
            if (addresses.size() > 0) {
                int maxLine =
                        addresses.get(0)
                                .getMaxAddressLineIndex();
                String result = addresses.get(0).getAddressLine(0);
                for (int i = 1; i <= maxLine; i++) {
                    result = result + ", " +
                            addresses.get(0).getAddressLine(i);
                }
                return result;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "dd";
    }

    @Override
    public void onInfoWindowClick(Marker marker) {

    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.layout_view_address,
                null);
        TextView tvContent = view.findViewById(R.id.tv_content);
        tvContent.setText(marker.getSnippet());
        ImageView iv = view.findViewById(R.id.tv_img);
        GlideApp.with(getActivity())
                .load("http://linhbui.vn/images/2017/02/chi-em-mac-ao-dai-mang-giay-gi-dep-nhat-ao-dai-mau-hong.jpg")
                .error(R.mipmap.ic_launcher)
                .placeholder(R.mipmap.ic_launcher)
                .into(iv);
        return view;
    }
}
