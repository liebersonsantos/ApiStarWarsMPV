package com.liebersonsantos.apistarwarsmpv.presenter;

import android.util.Log;
import android.view.View;

import com.liebersonsantos.apistarwarsmpv.contract.Contract;
import com.liebersonsantos.apistarwarsmpv.model.Model;
import com.liebersonsantos.apistarwarsmpv.model.SwApiResponse;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class Presenter implements Contract.Presenter{

    private Contract.View view;
    private Contract.Model model;
    private CompositeDisposable disposable = new CompositeDisposable();

    public Presenter(Contract.View view){
        this.view = view;
        this.model = new Model(this);
    }

    @Override
    public void getDataSwAPi() {
        disposable.add(model.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable1) throws Exception {
                        // colocar o loading para a tela
                    }
                })
                .doAfterTerminate(new Action() {
                    @Override
                    public void run() throws Exception {
                        // tirar o loading da tela
                    }
                })
                .doOnError(new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                })
                .subscribe(new Consumer<SwApiResponse>() {
                    @Override
                    public void accept(SwApiResponse swApiResponse) throws Exception {


                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        // mostrar a mensagem pro usuario, de error
                    }
                })
        );

    }
}
