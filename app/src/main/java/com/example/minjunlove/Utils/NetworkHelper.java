package com.example.minjunlove.Utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkHelper {

    private static Retrofit retrofit = null;

    public static RetrofitInterface getInstence(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl("http://conduit.productionready.io").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(RetrofitInterface.class);
    }

}
