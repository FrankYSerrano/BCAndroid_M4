package com.example.navigationcomponentbootcamp;

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

public class InicioFragment extends Fragment {

    public InicioFragment() {
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

        Button btnFragment1 = view.findViewById(R.id.but1);
        Button btnFragment2 = view.findViewById(R.id.but2);

        btnFragment1.setOnClickListener(v->{
            Navigation.findNavController(v).navigate(R.id.fragmentoUno);
        });
        btnFragment2.setOnClickListener(v->{
            navController.navigate(R.id.fragmentoDos);
        });


    }
}