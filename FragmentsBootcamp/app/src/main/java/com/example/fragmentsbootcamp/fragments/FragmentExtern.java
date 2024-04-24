package com.example.fragmentsbootcamp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentsbootcamp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentExtern#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentExtern extends Fragment {

    public FragmentExtern() {
        // Required empty public constructor
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
        View view = inflater.inflate(R.layout.fragment_extern, container, false);
        return view;
    }
}