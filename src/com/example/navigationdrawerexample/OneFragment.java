package com.example.navigationdrawerexample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawernavigationexample.R;


public class OneFragment extends Fragment {

    public static Fragment newInstance(Context context) {
        OneFragment f = new OneFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);

        return rootView;
    }

}
