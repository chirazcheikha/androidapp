package com.example.keygenapp;
import com.google.gson.annotations.SerializedName;



public class Results {

    @SerializedName("key_name")
    private String key_name;


    public Results(String key_name) {
        this.key_name = key_name;
    }

    public String getName() {
        return key_name;
    }
}