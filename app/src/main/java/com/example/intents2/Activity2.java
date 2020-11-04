package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textView = findViewById(R.id.salutacio);

        //String nom = getIntent().getStringExtra("etiquetaNom");
        Bundle sacRecuperat = getIntent().getExtras();

        String nom = sacRecuperat.getString("etiquetaNom");
        int edat = sacRecuperat.getInt("etiquetaEdat");

        textView.setText("Hola "+ nom+" tens "+edat+" anys.");
    }
}