package com.codekul.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
//import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImageFragment extends Fragment {

    public static final String KEY_IMG = "img";

    public static ImageFragment getInstance(int img) {
        ImageFragment frag = new ImageFragment();

        Bundle bnd = new Bundle();
        bnd.putInt(KEY_IMG, img);
        frag.setArguments(bnd);

        return frag;
    }

    public ImageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rtVw = inflater.inflate(R.layout.fragment_image, container, false);

        Bundle bnd = getArguments();
        if (bnd != null) {

            int img = bnd.getInt("img");

            ((ImageView) rtVw.findViewById(R.id.imgVw)).setImageResource(img);
        }

        return rtVw;
    }
}
