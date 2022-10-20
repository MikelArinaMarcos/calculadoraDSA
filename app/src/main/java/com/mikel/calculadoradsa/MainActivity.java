package com.mikel.calculadoradsa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Definición de las variables que se van a utilizar
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;
    boolean division = false;
    boolean decimal = false;
    boolean radianes = false;
    boolean seno = false;
    boolean coseno = false;
    boolean tangente = false;
    Double[] numero = new Double[20];
    Double dato;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Definición de los botones numéricos

        //0
        Button zeroBtn = (Button) findViewById(R.id.zeroBtn);
        zeroBtn.setOnClickListener(this);
        //1
        Button oneBtn = (Button) findViewById(R.id.oneBtn);
        oneBtn.setOnClickListener(this);
        //2
        Button twoBtn = (Button) findViewById(R.id.twoBtn);
        twoBtn.setOnClickListener(this);
        //3
        Button threeBtn = (Button) findViewById(R.id.threeBtn);
        threeBtn.setOnClickListener(this);
        //4
        Button fourBtn = (Button) findViewById(R.id.fourBtn);
        fourBtn.setOnClickListener(this);
        //5
        Button fiveBtn = (Button) findViewById(R.id.fiveBtn);
        fiveBtn.setOnClickListener(this);
        //6
        Button sixBtn = (Button) findViewById(R.id.sixBtn);
        sixBtn.setOnClickListener(this);
        //7
        Button sevenBtn = (Button) findViewById(R.id.sevenBtn);
        sevenBtn.setOnClickListener(this);
        //8
        Button eightBtn = (Button) findViewById(R.id.eightBtn);
        eightBtn.setOnClickListener(this);
        //9
        Button nineBtn = (Button) findViewById(R.id.nineBtn);
        nineBtn.setOnClickListener(this);

        // Definición de los botones de operaciones

        //Suma
        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        plusBtn.setOnClickListener(this);
        //Resta
        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        minusBtn.setOnClickListener(this);
        //Multiplicación
        Button timesBtn = (Button) findViewById(R.id.timesBtn);
        timesBtn.setOnClickListener(this);
        //División
        Button dividedByBtn = (Button) findViewById(R.id.dividedByBtn);
        dividedByBtn.setOnClickListener(this);
        //Igual
        Button equalBtn = (Button) findViewById(R.id.equalBtn);
        equalBtn.setOnClickListener(this);
        //Borrar
        Button clearBtn = (Button) findViewById(R.id.clearBtn);
        clearBtn.setOnClickListener(this);
        //Coma
        Button dotBtn = (Button) findViewById(R.id.dotBtn);
        dotBtn.setOnClickListener(this);

        // Funciones complejas

        //Seno
        Button sinBtn = (Button) findViewById(R.id.sinBtn);
        sinBtn.setOnClickListener(this);
        //Coseno
        Button cosBtn = (Button) findViewById(R.id.cosBtn);
        cosBtn.setOnClickListener(this);
        //Tangente
        Button tanBtn = (Button) findViewById(R.id.tanBtn);
        tanBtn.setOnClickListener(this);
        //Cambio a radianes
        Button radBtn = (Button) findViewById(R.id.radBtn);
        radBtn.setOnClickListener(this);

    }

    public void onClick(View view) {
        TextView screen = (TextView) findViewById(R.id.screen);
        int selector = view.getId();
        String x = screen.getText().toString();
        try{
            switch(selector){
                case R.id.zeroBtn:
                    screen.setText(x + "0");
                    break;
                case R.id.oneBtn:
                    screen.setText(x + "1");
                    break;
                case R.id.twoBtn:
                    screen.setText(x + "2");
                    break;
                case R.id.threeBtn:
                    screen.setText(x + "3");
                    break;
                case R.id.fourBtn:
                    screen.setText(x + "4");
                    break;
                case R.id.fiveBtn:
                    screen.setText(x + "5");
                    break;
                case R.id.sixBtn:
                    screen.setText(x + "6");
                    break;
                case R.id.sevenBtn:
                    screen.setText(x + "7");
                    break;
                case R.id.eightBtn:
                    screen.setText(x + "8");
                    break;
                case R.id.nineBtn:
                    screen.setText(x + "9");
                    break;

                //Casos de las operaciones
                case R.id.plusBtn:
                    suma = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.minusBtn:
                    resta = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.timesBtn:
                    multiplicacion = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.dividedByBtn:
                    division = true;
                    numero[0] = Double.parseDouble(x);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.clearBtn:
                    screen.setText("");
                    decimal = false;
                    break;

                // Casos operaciones complejas
                case R.id.radBtn:
                    radianes = true;
                    break;
                case R.id.sinBtn:
                    seno = true;
                    screen.setText(x + "");
                    break;
                case R.id.cosBtn:
                    coseno = true;
                    screen.setText(x + "");
                    break;
                case R.id.tanBtn:
                    tangente = true;
                    screen.setText(x + "");
                    break;

                //Caso del igual (resultado)
                case R.id.equalBtn:
                    numero[1] = Double.parseDouble(x);
                    if(suma == true){
                        dato = numero[0] + numero[1];
                        screen.setText(String.valueOf(dato));
                    }
                    else if(resta == true){
                        dato = numero[0] - numero[1];
                        screen.setText(String.valueOf(dato));
                    }
                    else if(multiplicacion == true) {
                        dato = numero[0] * numero[1];
                        screen.setText(String.valueOf(dato));
                    }
                    else if (division == true){
                        dato = numero[0] / numero[1];
                        screen.setText(String.valueOf(dato));
                    }

                    else if (seno == true){
                        if (radianes == true){
                            double radian = Math.toRadians((Double.parseDouble(x)));
                            dato = Math.sin(radian);
                            screen.setText(String.valueOf(dato));
                        }
                        else{
                            double degrees = Math.toDegrees(Double.parseDouble(x));
                            dato = Math.sin(degrees);
                            double result = Math.toDegrees(dato);
                            screen.setText(String.valueOf(result));
                        }
                    }

                    else if (coseno == true){
                        if (radianes == true){
                            double radian = Math.toRadians((Double.parseDouble(x)));
                            dato = Math.cos(radian);
                            screen.setText(String.valueOf(dato));
                        }
                        else{
                            double degrees = Math.toDegrees(Double.parseDouble(x));
                            dato = Math.cos(degrees);
                            double result = Math.toDegrees(dato);
                            screen.setText(String.valueOf(result));
                        }
                    }

                    else if (tangente == true){
                        if (radianes == true){
                            double radian = Math.toRadians((Double.parseDouble(x)));
                            dato = Math.tan(radian);
                            screen.setText(String.valueOf(dato));
                        }
                        else{
                            double degrees = Math.toDegrees(Double.parseDouble(x));
                            dato = Math.tan(degrees);
                            double result = Math.toDegrees(dato);
                            screen.setText(String.valueOf(result));
                        }
                    }

                    decimal = false;
                    suma = false;
                    division = false;
                    multiplicacion = false;
                    resta = false;
                    break;

            }
        } catch (Exception e) {
            screen.setText("Error");
        }
    }
}