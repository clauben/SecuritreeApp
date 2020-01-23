package com.example.securitree_app3;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RequestInterface {

    @FormUrlEncoded
    @POST("login.php")
    Call<JsonResponse> login(@Field("username") String username, @Field("password") String password);
}