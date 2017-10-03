package com.codekul.customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        MyView view = new MyView(this);
//        view.setText("CodeKul is great");

        setContentView(R.layout.activity_main);
    }
}
