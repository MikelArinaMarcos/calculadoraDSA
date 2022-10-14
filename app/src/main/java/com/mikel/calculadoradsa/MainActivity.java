package com.mikel.calculadoradsa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    boolean suma = false;
    Double[] numero = new Double[20];
    Double dato;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Definición de los botones

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
            }
        } catch (Exception e) {
            screen.setText("Error");
        }
    }


}