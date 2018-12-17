package com.daggr2.demo.newdagger2.test2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.daggr2.demo.newdagger2.R;
import com.daggr2.demo.newdagger2.test2.bean.AppleTest2;
import com.daggr2.demo.newdagger2.test2.bean.OrangeTest2;
import com.daggr2.demo.newdagger2.test2.component.DaggerAComponentTest2;
import com.daggr2.demo.newdagger2.test2.module.AModuleTest2;

import javax.inject.Inject;

public class Test2Activity extends AppCompatActivity {
    private static final String TAG = Test2Activity.class.getSimpleName();
    @Inject
    AppleTest2 apple;
    @Inject
    OrangeTest2 orange;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerAComponentTest2.builder().aModuleTest2(new AModuleTest2("大苹果", 100)).build().getBcomponent2().inject(this);
        Log.d(TAG + "====>>>>", apple.eat());
        Log.d(TAG + "====>>>>", orange.eat());
    }
}
