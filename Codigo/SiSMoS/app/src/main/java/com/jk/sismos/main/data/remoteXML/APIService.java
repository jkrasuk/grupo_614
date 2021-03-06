package com.jk.sismos.main.data.remoteXML;

import com.jk.sismos.main.data.model.inpresList.Feed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("rss/ultimos50.xml")
    Call<Feed> getEarthquakeData();
}