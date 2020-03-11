package com.example.salarioaumento;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText salario;
    private Button confirmar;
    private RadioButton rbtn1, rbtn2, rbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           salario  = findViewById(R.id.edtSalario);
           confirmar = findViewById(R.id.button);
           rbtn1 = findViewById(R.id.radioButton);
           rbtn2 = findViewById(R.id.radioButton2);
           rbtn3 = findViewById(R.id.radioButton3);

       final AlertDialog.Builder mensagem = new AlertDialog.Builder(MainActivity.this);

        confirmar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                double valorSalario = Double.parseDouble(salario.getText().toString());
                double porcentagem = 0;

                if(rbtn1.isChecked()){
                    //ou 40 dividido por 100
                    porcentagem = 0.40;
                    mensagem.setTitle("Com um aumento de 40%");
                }
                else if(rbtn2.isChecked()){
                    porcentagem = 0.45;
                    mensagem.setTitle("Com um aumento de 45%");
                }
                else if (rbtn3.isChecked()){
                    porcentagem = 0.50;
                    mensagem.setTitle("Com um aumento de 50%");
                }
                valorSalario = valorSalario+(valorSalario*porcentagem);
                mensagem.setMessage("O salário final é: "+valorSalario);
                mensagem.show();
            }
        });

    }

}
