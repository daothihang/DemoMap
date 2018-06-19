package com.t3h.demomap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Admins on 6/17/2018.
 */

public interface Api {
    @GET("/map/api/direction/json")
    Call<DirectionResponse>getDirection(
            @Query(value = "origin")String origin,
            @Query(value = "destination")String destination,
            @Query(value = "key")String key,
            @Query(value = "mode")String mode
    );

}
