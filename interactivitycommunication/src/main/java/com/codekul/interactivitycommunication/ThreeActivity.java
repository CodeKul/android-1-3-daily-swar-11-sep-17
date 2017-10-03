package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        Intent parentIntent = getIntent();
        Bundle bundle = parentIntent.getExtras();
        String desc = bundle.getString(MainActivity.KEY_DESC);

        ((TextView)findViewById(R.id.txtDesc)).setText(desc);

    }
}
