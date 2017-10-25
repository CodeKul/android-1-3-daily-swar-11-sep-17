package com.codekul.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonFragment extends Fragment {


    public ButtonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rtVw = inflater.inflate(R.layout.fragment_button, container, false);

        rtVw.findViewById(R.id.btnCycle).setOnClickListener(this::onCycle);
        rtVw.findViewById(R.id.btnPlane).setOnClickListener(this::onPlane);
        rtVw.findViewById(R.id.btnBus).setOnClickListener(this::onBus);
        return rtVw;
    }

    private void onBus(View view) {

        ((MainActivity) getActivity()).loadFrag(
                ImageFragment.getInstance(R.drawable.ic_buses)
        );
    }

    private void onPlane(View view) {
        ImageFragment frag = new ImageFragment();

        Bundle bnd = new Bundle();
        bnd.putInt("img", R.drawable.ic_airplane);
        frag.setArguments(bnd);

        ((MainActivity) getActivity()).loadFrag(frag);
    }

    private void onCycle(View view) {
        ImageFragment frag = new ImageFragment();

        Bundle bnd = new Bundle();
        bnd.putInt("img", R.drawable.ic_cycle);
        frag.setArguments(bnd);

        ((MainActivity) getActivity()).loadFrag(frag);
    }

}
