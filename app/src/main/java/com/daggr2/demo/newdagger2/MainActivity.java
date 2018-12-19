package com.daggr2.demo.newdagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//https://www.jianshu.com/p/2ec39d8b7e98
import com.daggr2.demo.newdagger2.test6.Test6Activity;


public class MainActivity extends AppCompatActivity {
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
    }


    public void test1(View view) {
        startActivity(new Intent(this, Test6Activity.class));
    }
}
