package com.example.intentsexplicitos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    public static final String ID_MENSAJE = "Mensaje desde 2: ";

    TextView resultadoSaludo;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String mensaje_from2 = getIntent().getStringExtra(ID_MENSAJE);

        resultadoSaludo = findViewById(R.id.textView3);
        resultadoSaludo.setText(mensaje_from2);
        btn3=findViewById(R.id.button3);

        btn3.setOnClickListener(v ->{
            finish();
        });

    };

}