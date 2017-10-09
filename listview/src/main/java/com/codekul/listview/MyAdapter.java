package com.codekul.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aniruddha on 9/10/17.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<CustItm> dataSet;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<CustItm> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int pos) {
        return dataSet.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup viewGroup) {

        View viewRoot = null;
        if(convertView == null) viewRoot = inflater.inflate(R.layout.custom_item, viewGroup, false);
        else viewRoot = convertView;

        ((ImageView) viewRoot.findViewById(R.id.imgVw)).setImageResource(dataSet.get(pos).getImgId());
        ((TextView) viewRoot.findViewById(R.id.txtVw)).setText(dataSet.get(pos).getTxt());

        return viewRoot;
    }
}
