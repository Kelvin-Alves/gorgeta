package com.example.gorjeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
    int max=30, min=0;
    int processo;
    private EditText num;
    private TextView percentual;
    private Button calcular;
    private TextView total;
    private TextView gorjeta;
    private SeekBar barra;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = findViewById(R.id.num);
        percentual= findViewById(R.id.percentual);
        calcular=findViewById(R.id.btCalular);
        total=findViewById(R.id.total);
        gorjeta=findViewById(R.id.gorgeta);



        barra = findViewById(R.id.barra);
        barra.setMax(max);
        barra.setProgress(max);
        barra.setOnSeekBarChangeListener(this);



        percentual.setText(processo+"%");

        calcular.setOnClickListener(this);


    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        processo= progress+min;
        percentual.setText(processo+"%");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onClick(View v) {
           String percentualText = String.valueOf(percentual.getText());
           num=findViewById(R.id.num);
           String valor = String.valueOf(num.getText());


           String teste =percentualText.replace("%","");
           double num2=Double.parseDouble(teste);
            double  num =Double.parseDouble(valor);
            double resultado =(num2*num)/100;
            gorjeta.setText(""+resultado);
            resultado=resultado+num;
            total.setText(""+resultado);







    }
}

