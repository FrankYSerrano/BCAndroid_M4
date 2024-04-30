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
import android.widget.ImageView;

import com.example.alkewallet1.R;

public class iniciofragment extends Fragment {

    public iniciofragment() {
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
        return inflater.inflate(R.layout.fragment_inicio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        /**
         * Al hacer click en el Logo el splash te lleva a siguiente pantalla
         * Mientras veo como hacerlo a través de un delay de N segundos
         */
        ImageView imageView_logo = view.findViewById(R.id.ImageView_id_logo);
        imageView_logo.setOnClickListener(v->{
            navController.navigate(R.id.aw02_signup_login);
        });


    }
}