package com.example.minjunlove.Utils;

import com.example.minjunlove.model.Articles;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    //성공시 혹은 실패시 가 Interface

    @GET("/api/articles")
    Call<Articles> getArticles();

}
