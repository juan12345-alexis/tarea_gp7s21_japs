package com.example.tarea_gp7s21_japs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mayorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mayor);
        TextView txtmayor = findViewById(R.id.txtmayor);
        Button btnmayor = findViewById(R.id.btnmayor);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombre = extras.getString("nombre");
            txtmayor.setText("Bienvenido " + nombre + ". Eres mayor de edad.");
        }
        btnmayor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mayorActivity.this, segundoActivity.class);
                startActivity(intent);
                finish(); // Finaliza esta actividad
            }
        });
    }
}