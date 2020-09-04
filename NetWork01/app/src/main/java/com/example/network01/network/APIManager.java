package com.example.network01.network;

import com.example.network01.model.Item;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIManager {
    String SERVER_URL = "https://api-demo-anhth.herokuapp.com/";
    @GET("data.json")
    Call<Item> getItemData();
    @GET("datas.json")
    Call<Item> getListData();

}
