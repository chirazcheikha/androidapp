package com.example.keygenapp;
import retrofit2.http.GET;
import java.util.List;
import retrofit2.Call;


public interface  Api {
    String BASE_URL = "https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Results>> getsuperHeroes();
}
