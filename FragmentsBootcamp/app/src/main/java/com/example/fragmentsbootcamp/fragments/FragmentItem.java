package com.example.fragmentsbootcamp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentsbootcamp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentItem#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentItem extends Fragment {

    public FragmentItem(){

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
        View view = inflater.inflate(R.layout.fragment_item, container, false);

        view.setOnClickListener(v -> {
            FragmentDetail frgDtl = (FragmentDetail) getParentFragmentManager().
                    findFragmentById(R.id.frg_detail);
            if (frgDtl != null){
                frgDtl.updateMessage("Mensaje desde fragmento 1");
            }
        });


        return view;
    }
}