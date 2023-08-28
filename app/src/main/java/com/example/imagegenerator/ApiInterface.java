package com.example.imagegenerator;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {
    String API_KEY = "hz5pFRDVSvmRSGXUaJD2Z4SOG09GheMEbfUQGncWLuY";

    @Headers("Authorization: Client-ID " + API_KEY)
    @GET("/photos")
    Call<List<ImageModel>> getImages(
            @Query("page") int page,
            @Query("per_page") int per_page
    );

    @Headers("Authorization: Client-ID " + API_KEY)
    @GET("/search/photos")
    Call<SearchModel> searchImages(
            @Query("query") String query
    );
}
