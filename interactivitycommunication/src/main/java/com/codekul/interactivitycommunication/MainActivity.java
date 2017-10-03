package com.codekul.interactivitycommunication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String KEY_DESC = "desc";
    public static final int REQ_ONE = 1234;
    public static final int REQ_TWO = 1235;
    public static final int REQ_THREE = 1236;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOne(View view) {
        Class cls = OneActivity.class;

        Bundle bundle = new Bundle();
        bundle.putString(KEY_DESC, " This is one number, which is starting. There is one only.");

        Intent intent = new Intent(this, cls);
        intent.putExtras(bundle);
        //startActivity(intent);
        startActivityForResult(intent, REQ_ONE);
    }

    public void onTwo(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_DESC, "This is two number, which is even and represents double things");

        Intent intent = new Intent(this, TwoActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, REQ_TWO);
        //startActivity(intent);
    }

    public void onThree(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_DESC, "This is three, which is after two and before four. And it is first odd nums");

        Intent intent = new Intent(this, ThreeActivity.class);
        intent.putExtras(bundle);
        //startActivity(intent);
        startActivityForResult(intent, REQ_THREE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQ_ONE) {
            if(resultCode == RESULT_OK) {

                Bundle bndl = data.getExtras();
                if(bndl != null) {
                    ((Button) findViewById(R.id.btnOne)).setText(bndl.getString(OneActivity.RES_ONE));
                }

            }
        }
        else if(requestCode == REQ_TWO) {
            if(resultCode == RESULT_OK) {
                Bundle bndl = data.getExtras();
                if(bndl != null) {
                    ((Button) findViewById(R.id.btnTwo)).setText(bndl.getString(TwoActivity.RES_TWO));
                }
            }
        }
        else {
            if(resultCode == RESULT_OK) {

            }
        }
    }
}
