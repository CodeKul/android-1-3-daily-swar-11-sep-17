package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    public static final String RES_TWO = "resTwo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Intent parentIntent = getIntent();
        Bundle bundle = parentIntent.getExtras();
        String desc = bundle.getString(MainActivity.KEY_DESC);

        ((TextView) findViewById(R.id.txtDesc)).setText(desc);
    }

    public void onImgBack(View view) {

        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(RES_TWO, "I am from TwoActivity");
        intent.putExtras(bundle);

        setResult(RESULT_OK, intent);
        finish();
    }
}
