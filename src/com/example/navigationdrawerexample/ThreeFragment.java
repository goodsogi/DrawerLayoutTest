package com.example.navigationdrawerexample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawernavigationexample.R;


public class ThreeFragment extends Fragment {

    public static Fragment newInstance(Context context) {
        ThreeFragment f = new ThreeFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);

        return rootView;
    }

}
