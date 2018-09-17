package com.liebersonsantos.apistarwarsmpv.model;

import com.liebersonsantos.apistarwarsmpv.contract.Contract;
import com.liebersonsantos.apistarwarsmpv.model.serviceData.RestClient;

import io.reactivex.Single;

public class Model implements Contract.Model {

    private Contract.Presenter presenter;

    public Model(Contract.Presenter presenter){
        this.presenter = presenter;
    }

    public Single<SwApiResponse> getData() {
        return RestClient.getInstance().getDataApi();
    }

}
