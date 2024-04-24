package com.example.fragmentsbootcamp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentsbootcamp.MainActivity;
import com.example.fragmentsbootcamp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDetail#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDetail extends Fragment {

    TextView textoMensaje;
    public FragmentDetail(){

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
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        textoMensaje = view.findViewById(R.id.txt_frgm2);
        if (textoMensaje != null){
            pressTextMessageListener();
        }
        return view;
    }

    private void pressTextMessageListener(){
        textoMensaje.setOnClickListener(v -> {
            MainActivity mActivity = (MainActivity) getActivity();
            if (mActivity != null && !mActivity.fragmtThreeVisible){
                mActivity.cargarFragmentExtern();
            }
        });
    }

    public void updateMessage(String message) {
        if (textoMensaje != null){
            textoMensaje.setText(message);
        }
    }
}