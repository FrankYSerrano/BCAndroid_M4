package com.example.alkewallet1.fragments;

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
import android.widget.ImageView;

import com.example.alkewallet1.R;
public class aw07_send extends Fragment {

    public aw07_send() {
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
        Button button_send = view.findViewById(R.id.button_send);
        button_send.setOnClickListener(v->{
            navController.navigate(R.id.aw05_homepage);
        });

    }
}