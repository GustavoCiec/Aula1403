package com.example.aula1403;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Calculadora extends AppCompatActivity {
    private EditText nmr1;
    private EditText nmr2;
    private EditText tvresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        nmr1=findViewById(R.id.nmr1);
        nmr2=findViewById(R.id.nmr2);
        tvresultado=findViewById(R.id.tvresultado);

    }
    public void somar(View view){
        int valor1=Integer.parseInt(nmr1.getText().toString());
        int valor2=Integer.parseInt(nmr2.getText().toString());
        tvresultado.setText(String.valueOf(valor1+valor2));
    }

    public void subtrair(View view){
        int valor1=Integer.parseInt(nmr1.getText().toString());
        int valor2=Integer.parseInt(nmr2.getText().toString());
        tvresultado.setText(String.valueOf(valor1-valor2));
    }

    public void multiplicar(View view){
        int valor1=Integer.parseInt(nmr1.getText().toString());
        int valor2=Integer.parseInt(nmr2.getText().toString());
        tvresultado.setText(String.valueOf(valor1*valor2));
    }
    public void dividir(View view){
        int valor1=Integer.parseInt(nmr1.getText().toString());
        int valor2=Integer.parseInt(nmr2.getText().toString());
        tvresultado.setText(String.valueOf(valor1/valor2));
    }
}