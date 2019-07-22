package com.adg.easykart.com.adg.easykart.service;

import com.adg.easykart.requestDTO.AdminrequestDTO;
import com.adg.easykart.requestDTO.SignIn;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
public interface ApiInterface {

    @POST("/api/sign-in")
    Call<SignIn> signIn(@Body AdminrequestDTO user);
}
