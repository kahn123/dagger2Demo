package com.daggr2.demo.newdagger2.test1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.daggr2.demo.newdagger2.R;
import com.daggr2.demo.newdagger2.test1.bean.AppleTest1;
import com.daggr2.demo.newdagger2.test1.bean.OrangeTest1;
import com.daggr2.demo.newdagger2.test1.component.AComponentTest1;
import com.daggr2.demo.newdagger2.test1.component.BComponentTest1;
import com.daggr2.demo.newdagger2.test1.component.DaggerAComponentTest1;
import com.daggr2.demo.newdagger2.test1.component.DaggerBComponentTest1;
import com.daggr2.demo.newdagger2.test1.module.AModuleTest1;


import javax.inject.Inject;

public class Test1Activity extends AppCompatActivity {
    private static final String TAG = Test1Activity.class.getSimpleName();
    @Inject
    AppleTest1 apple;
    @Inject
    OrangeTest1 orange;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AComponentTest1 aComponentTest1 = DaggerAComponentTest1.builder().aModuleTest1(new AModuleTest1("大苹果",100)).build();
        BComponentTest1 bComponentTest1 = DaggerBComponentTest1.builder().aComponentTest1(aComponentTest1).build();
        bComponentTest1.inject(this);
        Log.d(TAG+"====>>>>",apple.eat());
        Log.d(TAG+"====>>>>",orange.eat());
    }
}
