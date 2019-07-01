package com.example.nearbysearch;

import com.example.nearbysearch.Remote.IGoogleApi;
import com.example.nearbysearch.Remote.RetrofitClient;

public class Common {
    public static final String baseURL = "http//googleapis.com";
    public static IGoogleApi getGoogleApi ()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
}
