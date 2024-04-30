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

public class aw08_profile extends Fragment {

    public aw08_profile() {
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
        return inflater.inflate(R.layout.fragment_aw08_profile, container, false);
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
         * Navegación hacia Información (Mientras al Splash!)
         */
        Button button_information = view.findViewById(R.id.button_information);
        button_information.setOnClickListener(v->{
            navController.navigate(R.id.inicioFragment);
        });

        /**
         * Navegación hacia Cards (Mientras al Splash!)
         */
        Button button_cards = view.findViewById(R.id.button_cards);
        button_cards.setOnClickListener(v->{
            navController.navigate(R.id.inicioFragment);
        });

        /**
         * Navegación hacia Opciones (Mientras al Splash!)
         */
        Button button_options = view.findViewById(R.id.button_options);
        button_options.setOnClickListener(v->{
            navController.navigate(R.id.inicioFragment);
        });

        /**
         * Navegación hacia Help (Mientras al Splash!)
         */
        Button button_help = view.findViewById(R.id.button_help);
        button_help.setOnClickListener(v->{
            navController.navigate(R.id.inicioFragment);
        });

    }
}