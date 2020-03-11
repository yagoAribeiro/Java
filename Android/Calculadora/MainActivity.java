package com.example.calculadoraaritmetica;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText edNum01, edNum02;
    private Button btSomar, btSubtrair, btMultiplicar, btDividir;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder answer = new AlertDialog.Builder(MainActivity.this);


        edNum01 = (EditText) findViewById(R.id.editTextVal1);
        edNum02 = (EditText) findViewById(R.id.editTextVal2);
        btSomar = (Button) findViewById(R.id.btnSomar);
        btSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btMultiplicar = (Button) findViewById(R.id.btnMulti);
        btDividir = (Button) findViewById(R.id.btnDiv);
        result = (TextView) findViewById(R.id.txtResultado);

        btSomar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float num1 = Float.parseFloat(edNum01.getText().toString());
                float num2 = Float.parseFloat(edNum02.getText().toString());
                float resultado = num1 + num2;
                String textoResultado = ("Último resultado: "+resultado);
                result.setText(textoResultado);
                answer.setMessage(""+resultado);
                answer.show();
            }
        });
        btSubtrair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float num1 = Float.parseFloat(edNum01.getText().toString());
                float num2 = Float.parseFloat(edNum02.getText().toString());
                float resultado = num1 - num2;
                String textoResultado = ("Último resultado: "+resultado);
                result.setText(textoResultado);
                answer.setMessage(""+resultado);
                answer.show();
            }
        });
        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float num1 = Float.parseFloat(edNum01.getText().toString());
                float num2 = Float.parseFloat(edNum02.getText().toString());
                float resultado = num1 * num2;
                String textoResultado = ("Último resultado: "+resultado);
                result.setText(textoResultado);
                answer.setMessage(""+resultado);
                answer.show();
            }
        });
        btDividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float num1 = Float.parseFloat(edNum01.getText().toString());
                float num2 = Float.parseFloat(edNum02.getText().toString());
                float resultado = num1 / num2;
                String textoResultado = ("Último resultado: "+resultado);
                if(num2==0){
                    result.setText("Último resultado: N/A");
                    answer.setMessage("Impossível dividir por zero!");
                    answer.show();
                }else {
                    result.setText(textoResultado);
                    answer.setMessage("" + resultado);
                    answer.show();
                }

            }
        });

    }
}
