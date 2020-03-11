package com.example.imcjava;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button resultCalc;

    public static String Classificacao(Float valorFloat){
        String classe = null;
        Float resultado = valorFloat;
        if (resultado < 18.5) {
            classe = "Considerado Magro(a)!";
        } else if (resultado >= 18.5 && resultado <= 24.9) {
            classe = "Considerado saudável, na média!";
        } else if (resultado >= 25 && resultado <= 29.9) {
            classe = "Considerado sobrepeso!";
        } else if (resultado >= 30 && resultado <= 39.9) {
            classe = "Considerado obeso!";
        } else if (resultado >= 40) {
            classe = "Obesidade grave!";
        }
          else if (resultado<=0){
            classe = "Número ou valores inválidos ou erro aritimético";
        }
        return classe;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.txtPeso);
        num2 = (EditText) findViewById(R.id.txtAltura);
        resultCalc = (Button) findViewById(R.id.btnCalc);

        resultCalc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                float peso = Float.parseFloat(num1.getText().toString());
                float altura = Float.parseFloat(num2.getText().toString());
                float resultado = peso/(altura*altura);

                AlertDialog.Builder resposta = new AlertDialog.Builder(MainActivity.this);

                resposta.setTitle(Classificacao(resultado));
                resposta.setMessage("O seu IMC é: "+resultado);

                resposta.show();
            }
        });

    }

}
