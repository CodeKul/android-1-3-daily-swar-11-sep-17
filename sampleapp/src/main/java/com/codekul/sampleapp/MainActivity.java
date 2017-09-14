package com.codekul.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codekul.applib.TextUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextUtil tx = new TextUtil();
        tx.makeUpper();
    }
}
