package com.example.keygenapp;
import com.google.gson.annotations.SerializedName;



public class Results {

    @SerializedName("title")
    private String superName;


    public Results(String title) {
        this.superName = title;
    }

    public String getName() {
        return superName;
    }

}