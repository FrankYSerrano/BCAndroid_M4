package com.example.alkewallet1.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.alkewallet1.R;

public class aw04_login extends Fragment {

    public aw04_login() {
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
        View view = inflater.inflate(R.layout.fragment_aw04_login, container, false);
        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);

        /**
         * Navegación hacia signup
         */
        Button button_signUp = view.findViewById(R.id.button_signup);

        if (button_signUp != null) {
            button_signUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // handle your click here
                    navController.navigate(R.id.aw03_signup);
                }
            });
        } else {
            Log.e("LoginFragment", "Button not found in the layout");
        }
//        button_signUp.setOnClickListener(v->{
//            navController.navigate(R.id.aw03_signup);
//        });

        /**
         * Navegación hacia login
         */
//        TextView textView_login = view.findViewById(R.id.textView_login);

/**
        if (textView_login != null) {
            textView_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // handle your click here
                    navController.navigate(R.id.aw04_login);
                }
            });
        } else {
            Log.e("LoginFragment", "TextView not found in the layout");
        }
*/

        /**
         * Navegación hacia homepage
         */
        Button button_login = view.findViewById(R.id.button_login);
        button_login.setOnClickListener(v -> {
            navController.navigate(R.id.aw05_homepage);
        });

        /**
         * Navegación hacia signup
         */
        Button button_signup = view.findViewById(R.id.button_signup);
        button_signup.setOnClickListener(v->{
            navController.navigate(R.id.aw03_signup);
        });

    }
}