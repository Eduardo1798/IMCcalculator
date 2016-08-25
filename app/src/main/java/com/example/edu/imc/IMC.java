package com.example.edu.imc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class IMC extends AppCompatActivity {
    EditText Etext_peso,Etext_altura;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        Etext_peso = (EditText) findViewById(R.id.Etext_peso);
        Etext_altura = (EditText) findViewById(R.id.Etext_altura);
    }

    public void calcularOnclick (View v){
        try {
            double peso = Double.parseDouble(Etext_peso.getText().toString());
            double altura = Double.parseDouble(Etext_altura.getText().toString());
        }catch (Exception e){
            Toast.makeText(this,"Error en el ingreso de datos",Toast.LENGTH_SHORT).show();


            {
                TextView Txresultado;

                Txresultado = (TextView) findViewById(R.id.Tview_resultado);

                Intent i = getIntent();
                double altura = i.getDoubleExtra("altura", 0);
                double peso = i.getDoubleExtra("peso", 0);
                double IMC = (peso / Math.pow("altura", 2));

                Txresultado.setText(String.valueOf(IMC));
            }








        }






    }
}
