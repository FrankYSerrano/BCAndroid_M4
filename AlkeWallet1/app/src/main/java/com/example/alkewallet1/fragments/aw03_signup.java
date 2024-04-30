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
import android.widget.TextView;

import com.example.alkewallet1.R;

public class aw03_signup extends Fragment {

    public aw03_signup() {
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
        return inflater.inflate(R.layout.fragment_aw03_signup, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        /**
         * Navegación hacia signup
         */
        Button button_SignUp = view.findViewById(R.id.button_signup);
        button_SignUp.setOnClickListener(v->{
            navController.navigate(R.id.aw03_signup);
        });

        /**
         * Navegación hacia login
         */
        TextView textView_login = view.findViewById(R.id.textView_login);
        textView_login.setOnClickListener(v -> {
            navController.navigate(R.id.aw04_login);
        });

    }
}