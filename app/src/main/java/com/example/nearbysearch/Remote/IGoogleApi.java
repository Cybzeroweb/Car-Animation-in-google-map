package com.example.nearbysearch.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleApi {
  @GET
    Call<String>getDataFromGoogleApi(@Url String url);
}
public interface Iinterface{
  @GET("/feeds/json/v3/attribute/"+attribute)
  Call<ArrayList<result>>getresult();
}