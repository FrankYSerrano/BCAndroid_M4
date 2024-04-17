package com.example.beerselect;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.beerselect.mensajes.Mensajes;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView txtComentario;
    Spinner seleccionCantidad;
    Button btn_pedir;
    ImageView imagen_app;

    Mensajes mensaje = new Mensajes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen_app = findViewById(R.id.imagen_app);
        txtComentario = findViewById(R.id.txt_comentario);
        seleccionCantidad = findViewById(R.id.selector_beer);
        btn_pedir = findViewById(R.id.btn_pedir);

        btn_pedir.setOnClickListener(V ->{
            txtComentario.setText("Elegiste: \n");
            String cantSeleccionada = String.valueOf(seleccionCantidad.getSelectedItem());
            StringBuilder typeFormatted = new StringBuilder();
            List<String> cantidadCervezaLista = Mensajes.getAllCantidadCervezas(cantSeleccionada);
            for (String type : cantidadCervezaLista){
                typeFormatted.append(type).append("\n");
            }
            txtComentario.setText(typeFormatted);
        });

    }
}
