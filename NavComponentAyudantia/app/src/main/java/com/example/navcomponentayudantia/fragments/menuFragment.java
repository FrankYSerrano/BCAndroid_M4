package com.example.navcomponentayudantia.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navcomponentayudantia.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link menuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class menuFragment extends Fragment {

    public menuFragment() {
        // Required empty public constructor
    }

    public static menuFragment newInstance(String param1, String param2) {
        menuFragment fragment = new menuFragment();
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
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }
}