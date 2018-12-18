package com.daggr2.demo.newdagger2.test6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.daggr2.demo.newdagger2.R;
import com.daggr2.demo.newdagger2.test6.bean.RetrofitManager;
import com.daggr2.demo.newdagger2.test6.component.DaggerFatherRetrofitComponent;


import javax.inject.Inject;

public class Test6Activity extends AppCompatActivity {
    @Inject
    RetrofitManager retrofitManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerFatherRetrofitComponent.builder().build().getSonRetrofitComponent().buildSonRetrofitComponent().inject(this);

    }
}
