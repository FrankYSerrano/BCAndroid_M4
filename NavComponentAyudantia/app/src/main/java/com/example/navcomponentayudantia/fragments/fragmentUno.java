package com.example.navcomponentayudantia.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navcomponentayudantia.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmentUno#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmentUno extends Fragment {

    public fragmentUno() {
        // Required empty public constructor
    }

    public static fragmentUno newInstance(String param1, String param2) {
        fragmentUno fragment = new fragmentUno();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_uno, container, false);
    }
}