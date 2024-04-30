package com.example.alkewallet1.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alkewallet1.R;

public class aw05_homepage extends Fragment {

    public aw05_homepage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    private FragmentManager getSupportFragmentManager() {
        return null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_aw05_homepage, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        /**
         * Navegación hacia signup_login
         */
        TextView textView_start = view.findViewById(R.id.textView_start);
        textView_start.setOnClickListener(v -> {
            navController.navigate(R.id.aw04_login);
        });

        /**
         * Navegación hacia profile
         */
        ImageView imageView_profile = view.findViewById(R.id.imageView_profile);
        imageView_profile.setOnClickListener(v->{
            navController.navigate(R.id.aw08_profile);
        });

        /**
         * Navegación hacia request
         */
        Button button_request = view.findViewById(R.id.button_request);
        button_request.setOnClickListener(v->{
            navController.navigate(R.id.aw06_request);
        });

        /**
         * Navegación hacia send
         */
        Button button_send = view.findViewById(R.id.button_send);
        button_send.setOnClickListener(v->{
            navController.navigate(R.id.aw07_send);
        });

    }
}