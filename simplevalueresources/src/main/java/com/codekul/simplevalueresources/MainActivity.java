package com.codekul.simplevalueresources;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] nums = getResources().getStringArray(R.array.nums);

        int pureWhite =  getResources().getColor(R.color.pureWhite);
        pureWhite = ContextCompat.getColor(this, R.color.pureWhite);

        String str = getResources().getString(R.string.greetings);
    }
}
