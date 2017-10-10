package com.codekul.alternativeresources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*if (savedInstanceState != null) {
            ((TextView) findViewById(R.id.txtDt))
                    .setText(savedInstanceState.getString("txtDt"));
        }*/
        mt("onCreate");
    }

    @Override
    protected void onDestroy() {

        mt("onDestroy");

        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("txtDt", ((TextView) findViewById(R.id.txtDt)).getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {
            ((TextView) findViewById(R.id.txtDt))
                    .setText(savedInstanceState.getString("txtDt"));
        }
    }

    public void onDt(View view) {
        ((TextView) findViewById(R.id.txtDt))
                .setText(String.valueOf(System.currentTimeMillis()));
    }

    private void mt(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
