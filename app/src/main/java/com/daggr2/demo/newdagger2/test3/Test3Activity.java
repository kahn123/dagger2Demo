package com.daggr2.demo.newdagger2.test3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.daggr2.demo.newdagger2.R;
import com.daggr2.demo.newdagger2.test3.bean.AppleTest3;
import com.daggr2.demo.newdagger2.test3.bean.OrangeTest3;
import com.daggr2.demo.newdagger2.test3.component.DaggerAComponentTest3;
import com.daggr2.demo.newdagger2.test3.module.AModuleTest3;

import javax.inject.Inject;

public class Test3Activity extends AppCompatActivity {
    public static final String TAG = Test3Activity.class.getSimpleName();
    @Inject
    AppleTest3 apple;

    @Inject
    OrangeTest3 orange;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerAComponentTest3.builder().aModuleTest3(new AModuleTest3("大苹果",100)).build().getComponent3().build().inject(this);
        Log.d(TAG + "====>>>>", apple.eat());
        Log.d(TAG + "====>>>>", orange.eat());
    }

}
