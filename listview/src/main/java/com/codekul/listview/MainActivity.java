package com.codekul.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> dataSet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adavnedList();

    }

    public void onAdd(View view) {
        dataSet.add(((EditText) findViewById(R.id.etMob)).getText().toString());
        ArrayAdapter<String> adapter = (ArrayAdapter<String>) ((ListView) findViewById(R.id.lstMbls)).getAdapter();
        adapter.notifyDataSetChanged();
    }

    private void normalList() {
        dataSet.add("Android");
        dataSet.add("Apple");
        dataSet.add("Rim");
        dataSet.add("Symbian");
        dataSet.add("Windows");
        dataSet.add("Htc");
        dataSet.add("Sony");

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_list_item_1,
                        dataSet
                );

        ListView lstMbs = findViewById(R.id.lstMbls);
        lstMbs.setAdapter(adapter);

        lstMbs.setOnItemClickListener(
                (adapterView, view, pos, id) -> ((EditText) findViewById(R.id.etMob)).setText(dataSet.get(pos))
        );

        lstMbs.setOnItemLongClickListener((adapterView, view, pos, id) -> {
            dataSet.remove(pos);
            adapter.notifyDataSetChanged();
            return true;
        });
    }

    private void adavnedList() {

        List<CustItm> dataSetCust = new ArrayList<>();
        dataSetCust.add( new CustItm(R.drawable.ic_launcher_background, "Simple"));
        dataSetCust.add( new CustItm(R.drawable.ic_airplane, "Air Plane"));
        dataSetCust.add( new CustItm(R.drawable.ic_buses, "Bus"));
        dataSetCust.add( new CustItm(R.drawable.ic_clock, "Clock"));

        MyAdapter adapter = new MyAdapter(this, dataSetCust);

        ((ListView)findViewById(R.id.lstMbls)).setAdapter(adapter);
    }

}
