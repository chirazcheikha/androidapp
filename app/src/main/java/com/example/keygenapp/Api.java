package com.example.keygenapp;
import retrofit2.http.GET;
import java.util.List;
import retrofit2.Call;


public interface  Api {
    String BASE_URL = "https://jsonplaceholder.typicode.com/";
    @GET("/todos/")
    Call<List<Results>> getkeys();
}
