package com.daggr2.demo.newdagger2.test4;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.daggr2.demo.newdagger2.R;
import com.daggr2.demo.newdagger2.test4.component.DaggerSpComponent;
import com.daggr2.demo.newdagger2.test4.module.SpModule;

import javax.inject.Inject;

public class Test4Activity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        DaggerSpComponent.builder().spModule(new SpModule(getApplication())).build().inject(this);
//        DaggerSpComponent.builder().spModule(new SpModule(getApplication())).build().inject(this);
        DaggerSpComponent.builder().module(new SpModule(getApplication())).build1().inject(this);
    }
}
