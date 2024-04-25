package com.example.navigationcomponentbootcamp.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigationcomponentbootcamp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentoUno#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoUno extends Fragment {


    public FragmentoUno() {
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
        return inflater.inflate(R.layout.fragment_fragmento_uno, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        Button btnFragment1 = view.findViewById(R.id.button);

        btnFragment1.setOnClickListener(v->{
            Navigation.findNavController(v).navigate(R.id.inicioFragment);
        });


    }
}