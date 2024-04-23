package com.example.intentsexplicitos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    public static final String ID_MENSAJE = "Mensaje desde 2: ";

    EditText campoEntrada;
    Button bton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        campoEntrada = findViewById(R.id.editText);
        bton2 = findViewById(R.id.button2);

        bton2.setOnClickListener(v -> {
            String mensaje = campoEntrada.getText().toString();
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            intent.putExtra(ID_MENSAJE, mensaje);
            startActivity(intent);
        });
    };
}