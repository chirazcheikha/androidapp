package com.example.keygenapp;
import com.google.gson.annotations.SerializedName;



public class Results {

    @SerializedName("key_name")
    private String superName;


    public Results(String key_name) {
        this.superName = key_name;
    }

    public String getName() {
        return superName;
    }

}