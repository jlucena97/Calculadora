package com.ejercicio.jlm.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView texto;
    TextView texto1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cero = (Button) findViewById(R.id.cero);
        Button uno = (Button) findViewById(R.id.uno);
        Button dos = (Button) findViewById(R.id.dos);
        Button tres = (Button) findViewById(R.id.tres);
        Button cuatro = (Button) findViewById(R.id.cuatro);
        Button cinco = (Button) findViewById(R.id.cinco);
        Button seis = (Button) findViewById(R.id.seis);
        Button siete = (Button) findViewById(R.id.siete);
        Button ocho = (Button) findViewById(R.id.ocho);
        Button nueve = (Button) findViewById(R.id.nueve);
        Button punto = (Button) findViewById(R.id.punto);
        //Operaciones
        Button multiplicar = (Button) findViewById(R.id.multiplicar);
        Button dividir = (Button) findViewById(R.id.dividir);
        Button sumar = (Button) findViewById(R.id.suma);
        Button restar = (Button) findViewById(R.id.menos);
        Button igual = (Button) findViewById(R.id.igual);
        Button reset = (Button) findViewById(R.id.reset);


        cero.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        punto.setOnClickListener(this);
        //Operaciones
        multiplicar.setOnClickListener(this);
        dividir.setOnClickListener(this);
        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        reset.setOnClickListener(this);
        igual.setOnClickListener(this);
    }
    double num1,num2,res;
    String operador;

    public void onClick(View v){
        texto = (TextView) findViewById(R.id.edit1);
        texto1 = (TextView) findViewById(R.id.edit2);
        switch (v.getId()){
            case R.id.uno:
                texto.setText(texto.getText()+"1");
            break;
            case R.id.dos:
                texto.setText(texto.getText()+"2");
                break;
            case R.id.tres:
                texto.setText(texto.getText()+"3");
                break;
            case R.id.cuatro:
                texto.setText(texto.getText()+"4");
                break;
            case R.id.cinco:
                texto.setText(texto.getText()+"5");
                break;
            case R.id.seis:
                texto.setText(texto.getText()+"6");
                break;
            case R.id.siete:
                texto.setText(texto.getText()+"7");
                break;
            case R.id.ocho:
                texto.setText(texto.getText()+"8");
                break;
            case R.id.nueve:
                texto.setText(texto.getText()+"9");
                break;
            case R.id.cero:
                texto.setText(texto.getText()+"0");
                break;
            case R.id.punto:
                texto.setText(texto.getText()+".");
                break;
            //Operaciones
            case R.id.suma:
                operador = "+";
                texto1.setText(operador);
                int sum = R.id.suma;
                sacarNumero(v);
                break;
            case R.id.menos:
                operador = "-";
                texto1.setText(operador);
                sacarNumero(v);
                break;
            case R.id.multiplicar:
                operador = "*";
                texto1.setText(operador);
                sacarNumero(v);
                break;
            case R.id.dividir:
                operador = "/";
                texto1.setText(operador);
                sacarNumero(v);
                break;
            case R.id.reset:
                texto.setText(" ");
                texto1.setText(" ");
                num1=0.0;
                num2=0.0;
                operador="";
                break;
            case R.id.igual:
                texto1.setText("=");
                operacion(v);
                break;

        }
    }
    public void sacarNumero(View op){
        if(texto.getText().toString() == ""){
            texto.setText("0");
        }
        num1 = Double.parseDouble(texto.getText().toString());
        texto.setText("");
    }
    public void operacion(View i){

        num2 = Double.parseDouble(texto.getText().toString());

        if(operador.equals("+")){
            res = num1 + num2;
        }else if(operador.equals("-")){
            res = num1 - num2;
        }else if(operador.equals("*")){
            res = num1 * num2;
        }else  if(operador.equals("/")){
            res = num1 / num2;
        }
        texto.setText(""+res);
    }
}
