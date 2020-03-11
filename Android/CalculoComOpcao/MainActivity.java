package com.example.calculoopcao;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;

import android.widget.RadioButton;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private EditText num1, num2;
    private Button btn1;
    private RadioButton fatorial, fibonacci, potencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder mensagem = new AlertDialog.Builder(MainActivity.this);

        num1 = findViewById(R.id.edtTxt1);
        num2 = findViewById(R.id.edtTxt2);
        btn1 = findViewById(R.id.btn1);
        fatorial = findViewById(R.id.rBtn1);
        fibonacci = findViewById(R.id.rBtn2);
        potencia = findViewById(R.id.rBtn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1=0, val2=0;
                try {
                     val1 = Integer.parseInt(num1.getText().toString());
                     val2 = Integer.parseInt(num2.getText().toString());
                }
                catch(NumberFormatException err){
                    if(val1 == 0 && val2 == 0) {
                        mensagem.setMessage("Aviso, há valores faltando!");
                        mensagem.show();
                    }
                }

                int resultado = 1, i = 0;
                  if (fatorial.isChecked()) {
                      mensagem.setTitle("Opção escolhida: Fatorial");
                      if(Fatorial(val1) == 0 && val1 != 0){
                         mensagem.setMessage("Valor alto demais (Out of range)");
                      }else {
                          resultado = Fatorial(val1);
                          mensagem.setMessage(String.valueOf(resultado));
                      }
                  }
                  else if (fibonacci.isChecked()) {
                      String result = "";
                      mensagem.setTitle("Opção escolhida: Fibonacci");
                      for(i=0; resultado<=val1||i<=val1;){
                          i = resultado+i;
                          resultado = i+resultado;
                          if(resultado<=val1) {
                              result += String.valueOf(i+" ,"+resultado + ", ");
                          }
                      }
                      mensagem.setMessage(result);
                  }
                  else if (potencia.isChecked()) {
                      mensagem.setTitle("Opção escolhida: Potência");
                      resultado = (int) Math.pow(val1, val2);
                      mensagem.setMessage(String.valueOf(resultado));

                  }

                mensagem.show();
            }
        });


    }
    private int Fatorial(int numero){
        int resultado = 0;
        int i = numero-1;
        if(numero>26){
            return 0;
        }
        while (i>0) {
            numero = numero*i;
            i--;
        }
        resultado = numero;
        return resultado;
    }
//Função da potência com falha desconhecida
    //private int Potencia(int base, int expoente) {
     //   int resultado = 0;
     //   if(expoente==0) {
    //        return 0;
     //   }
      //      for (int i = 1;i<=expoente;i++) {
    //            resultado *= base;
     //       }

    //    return resultado;
  //  }
}
