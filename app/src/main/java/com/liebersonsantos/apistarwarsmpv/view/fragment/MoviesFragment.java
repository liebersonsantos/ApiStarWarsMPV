package com.liebersonsantos.apistarwarsmpv.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liebersonsantos.apistarwarsmpv.R;
import com.liebersonsantos.apistarwarsmpv.contract.Contract;
import com.liebersonsantos.apistarwarsmpv.presenter.Presenter;

/**
 *
 */
public class MoviesFragment extends Fragment implements Contract.View{

    private Contract.Presenter presenter;

    public MoviesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        presenter = new Presenter(this);

        presenter.getDataSwAPi();

        return inflater.inflate(R.layout.fragment_characters, container, false);

    }

}
