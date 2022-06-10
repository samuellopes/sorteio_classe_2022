package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

        TextView texto = findViewById(R.id.textoExibicao);

        int i = new Random().nextInt(13);

        String[] alunos = {"Breno", "Bruna", "Emilly", "Felipe", "Gracielle", "Guilherme", "Lucas", "Luiz", "Marcus", "Nicole", "Nicoly", "Rogerio", "Ryan", "Victor"};

        texto.setText(""+alunos[i]);
    }
}