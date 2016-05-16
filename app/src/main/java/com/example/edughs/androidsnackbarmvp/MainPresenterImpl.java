package com.example.edughs.androidsnackbarmvp;

import android.view.View;

/**
 * Created by edughs on 1/5/16.
 */

public class MainPresenterImpl implements MainPresenter{

    private MainView mainView;
    private String msg = "Hello world";

    public MainPresenterImpl(MainView mainView) {
        this.mainView = mainView;
    }


    @Override
    public void onButtonClicked(View v) {
        if(mainView != null){
            mainView.showHello(v, msg);
        }
    }
}
