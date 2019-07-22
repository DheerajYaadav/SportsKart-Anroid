package com.adg.easykart.com.adg.easykart.client;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String BASE_URL = "localhost:8085/sign-in";
   private static Retrofit retrofit = null;

   public static Retrofit getClient(){

       if(retrofit == null){
           retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

       }
       return retrofit;
   }
}
