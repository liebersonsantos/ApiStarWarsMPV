package com.liebersonsantos.apistarwarsmpv.contract;

import com.liebersonsantos.apistarwarsmpv.model.SwApiResponse;

import io.reactivex.Single;

public class Contract {

    public interface Model{
        Single<SwApiResponse> getData();

    }

    public interface View{


    }

    public interface Presenter{
        void getDataSwAPi();

    }
}
