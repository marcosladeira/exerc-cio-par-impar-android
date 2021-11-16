package com.example.ex3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void metodoClick(View view,int TextView, int EditText) {
        TextView texto = (TextView) findViewById(R.id.texto);
        EditText campo = (EditText) findViewById(R.id.campo);

        if(EditText % 2 ==0){
            System.out.println("o número" + texto.getText() + "é par");

        }else {
            System.out.println("o número" + texto.getText() + "é ímpar");

        }

    }


        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    }
