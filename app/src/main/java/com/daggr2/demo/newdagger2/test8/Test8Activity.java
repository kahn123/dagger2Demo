package com.daggr2.demo.newdagger2.test8;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.daggr2.demo.newdagger2.R;
import com.daggr2.demo.newdagger2.test8.bean.ApiService;
import com.daggr2.demo.newdagger2.test8.component.DaggerAppComponent;
import com.daggr2.demo.newdagger2.test8.module.AppModule;

import javax.inject.Inject;

public class Test8Activity extends AppCompatActivity {
    @Inject
    ApiService apiService;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//   1.
//        DaggerAppComponent.builder().appModule(new AppModule(getApplication())).build().getSubAppComponent().buildSubAppComponent().inject(this);
        apiService.findStr(null);
//   2.
        App.getInstance().getAppComponent().getSubAppComponent().buildSubAppComponent().inject(this);
        apiService.findStr(null);
    }
}
