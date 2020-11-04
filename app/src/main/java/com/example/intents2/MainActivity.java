package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.b1);
        editText = findViewById(R.id.nom);
        editText2 = findViewById(R.id.edat);

        b1.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        String nom = editText.getText().toString();
        int edat = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this,Activity2.class);
        //intent.putExtra("etiquetaNom",nom); //"nom" es l'etiqueta

        Bundle sac = new Bundle();
        sac.putString("etiquetaNom",nom);
        sac.putInt("etiquetaEdat",edat);
        intent.putExtras(sac);
        startActivity(intent);

    }
}