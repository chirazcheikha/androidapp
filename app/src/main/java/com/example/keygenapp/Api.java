package com.example.keygenapp;
import retrofit2.http.GET;
import java.util.List;
import retrofit2.Call;

public interface  Api {
    String BASE_URL = "https://keygenapp.pythonanywhere.com/api/keys/";
    @GET("?format=json")
    Call<List<Results>> getkeys();
}
