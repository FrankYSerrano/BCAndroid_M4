package com.example.logcatsandroid;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate", Toast.LENGTH_LONG).show();
/*        Log.i("MainActivityLogFS", "Log de informacion");
        Log.v("MainActivityLogFS", "Log de Verbose");
        Log.d("MainActivityLogFS", "Log de Debug");
        Log.w("MainActivityLogFS", "Log de Warnings");
        Log.e("MainActivityLogFS", "Log de Error"); */
        Log.i("MainActivityLogFS", "Suma: " + sumaDeNumeros(4,6));
        Log.v("MainActivityLogFS", "Division: " + divisionDeNumeros(5, 0));
        Log.v("MainActivityLogFS", "Division: " + divisionDeNumeros(10, 3));
    }
    @Override
    protected void onStart (){
        super.onStart();
        Log.i("MainActivityLogFS", "Inicio de Actividad");
        Toast.makeText(this,"EventoStart", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume (){
        super.onResume();
        Log.i("MainActivityLogFS", "Resumiendo Actividad");
        Toast.makeText(this,"EventoResume", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause (){
        super.onResume();
        Log.i("MainActivityLogFS", "Pausada Actividad");
        Toast.makeText(this,"EventoPausa", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart (){
        super.onResume();
        Log.i("MainActivityLogFS", "Reinicio de Actividad");
        Toast.makeText(this,"EventoReinicio", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy (){
        super.onResume();
        Log.i("MainActivityLogFS", "Fin de Actividad");
        Toast.makeText(this,"EventoDestroy", Toast.LENGTH_LONG).show();
    }
    private int sumaDeNumeros (int a, int b){
        int sumaNumeros = a + b;
        return sumaNumeros;
    }
    private int divisionDeNumeros (int a, int b){
        int divisionNumeros = 0;
        if (b == 0){
            Log.e("MainActivityLogFS", "Dividiendo entre cero!");
        }else{
            divisionNumeros = a / b;
        }
        return divisionNumeros;
    }
}