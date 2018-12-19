package com.daggr2.demo.newdagger2.test7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.daggr2.demo.newdagger2.R;
import com.daggr2.demo.newdagger2.test7.bean.Mice;
import com.daggr2.demo.newdagger2.test7.bean.Noodle;
import com.daggr2.demo.newdagger2.test7.component.DaggerFatherLunchComponent;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;
import dagger.Provides;

public class Test7Activity extends AppCompatActivity {

    @Inject
    Lazy<Mice> miceLazy;
    @Inject
    Provider<Noodle> noodleProvider;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerFatherLunchComponent.builder().toMice("100").buildFatherLunchComponent().getSonLunchComponent().toNoodle("100").buildSonLunchComponent().inject(this);
        miceLazy.get();
        noodleProvider.get();
    }
}
