package com.example.verificardados;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.app.AlertDialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText edtNome, edtIdade;
    private Button btnConfirmar;
    private RadioButton rbtnMale, rbtnFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder mensagem = new AlertDialog.Builder(MainActivity.this);


        edtNome = findViewById(R.id.editText);
        edtIdade = findViewById(R.id.editText2);
        btnConfirmar = findViewById(R.id.button);
        rbtnMale = findViewById(R.id.radioButton);
        rbtnFemale = findViewById(R.id.radioButton2);

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String nome = edtNome.getText().toString();
                String sexo;
                String maioridade;
                int idade = Integer.parseInt(edtIdade.getText().toString());
                mensagem.setTitle("Seus dados:");
                if(rbtnMale.isChecked()) {
                   sexo = "Masculino";
                }else{
                    sexo = "Feminino";
                }

                if(idade<18) {
                    maioridade = "Menor de 18";

                }else{
                    maioridade = "Maior de 18";
                }
                mensagem.setMessage("Nome: "+nome.toUpperCase()+" Gênero: "+sexo+", "+maioridade);
                mensagem.show();
            }
        });

    }

}
