package com.demo.it.paintdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/**
*这是一个画板页面*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     
    }

    public void clear_paint(View view) {
        ((PathView)findViewById(R.id.path_view)).ClearPaint();
    }
}
