package com.daggr2.demo.newdagger2.test5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.daggr2.demo.newdagger2.R;
import com.daggr2.demo.newdagger2.test5.bean.Bike;
import com.daggr2.demo.newdagger2.test5.bean.Car;
import com.daggr2.demo.newdagger2.test5.component.DaggerFatherComponent;

import javax.inject.Inject;

public class Test5Activity extends AppCompatActivity {
    @Inject
    Car car;
    @Inject
    Bike bike;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerFatherComponent.builder().buildFatherComponent().getSonComponent().buildSonComponent().inject(this);
    }
}
