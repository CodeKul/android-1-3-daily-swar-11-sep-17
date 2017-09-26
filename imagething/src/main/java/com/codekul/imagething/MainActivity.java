package com.codekul.imagething;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBoy = findViewById(R.id.btnBoy);
        btnBoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView)findViewById(R.id.imgCrd)).setImageResource(R.drawable.ic_boy);
            }
        });

        Button btnBus = findViewById(R.id.btnBus);
        btnBus.setOnClickListener(view -> ((ImageView)findViewById(R.id.imgCrd)).setImageResource(R.drawable.ic_buses));

        Button btnCycle = findViewById(R.id.btnCycle);
        btnCycle.setOnClickListener(this::onCycle);
    }

    private void onCycle(View view) {
        ((ImageView)findViewById(R.id.imgCrd))
                .setImageResource(R.drawable.ic_cycle);
    }


    public void onImgClick(View view) {
        ((ImageView)findViewById(R.id.imgCrd))
                .setImageResource(R.drawable.ic_launcher_background);
    }

    /*private class MyClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {

        }
    }*/
}