package com.liebersonsantos.apistarwarsmpv.model.serviceData;

import com.liebersonsantos.apistarwarsmpv.model.SwApiResponse;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface Api {

    @GET("films/")
    Single<SwApiResponse> getDataApi();

}
