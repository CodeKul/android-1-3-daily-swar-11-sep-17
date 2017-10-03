package com.codekul.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlayAnim(View view) {
        Animation anim = AnimationUtils.loadAnimation(
                this,
                R.anim.drop
        );
        //anim.setInterpolator(new WobblyBounceInterpolator(0.3, 30));
        findViewById(R.id.imgVw).startAnimation(anim);
    }

    private class WobblyBounceInterpolator implements Interpolator {

        private double amplitude;
        private double frequency;

        WobblyBounceInterpolator(double amplitude, double frequency) {
            this.amplitude = amplitude;
            this.frequency = frequency;
        }

        @Override
        public float getInterpolation(float time) {
            return (float) (-1 * Math.pow(Math.E, -time / amplitude) *
                    Math.cos(frequency * time) + 1);
        }
    }
}
