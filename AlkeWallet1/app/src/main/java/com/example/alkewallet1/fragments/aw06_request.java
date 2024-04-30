package com.example.alkewallet1.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.alkewallet1.R;

public class aw06_request extends Fragment {

    public aw06_request() {
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
        return inflater.inflate(R.layout.fragment_aw07_send, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        /**
         * Navegación hacia homepage
         */
        ImageView imageView_back = view.findViewById(R.id.ImageView_back);
        imageView_back.setOnClickListener(v->{
            navController.navigate(R.id.aw05_homepage);
        });

        /**
         * Navegación hacia homepage
         */
        Button button_request = view.findViewById(R.id.button_request);
        button_request.setOnClickListener(v->{
            navController.navigate(R.id.aw05_homepage);
        });

    }
}