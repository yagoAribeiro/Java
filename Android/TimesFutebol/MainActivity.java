package com.example.timesfutebol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;
import android.widget.CheckBox;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CheckBox corinthians, barcelona, santo_andre, inter;
    private Button btnExibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExibir = findViewById(R.id.button);
        corinthians = findViewById(R.id.checkBox);
        barcelona = findViewById(R.id.checkBox2);
        santo_andre = findViewById(R.id.checkBox3);
        inter = findViewById(R.id.checkBox4);





        final AlertDialog.Builder mensagem = new AlertDialog.Builder(MainActivity.this);


        btnExibir.setOnClickListener(new View.OnClickListener() {
            String textLista [] = new String [4];
            String resposta = "";
            public void onClick(View v) {
                if (corinthians.isChecked()) {
                    textLista[0] = "Corinthians";
                }
                if (barcelona.isChecked()) {
                    textLista[1] = "Barcelona";
                }
                if (santo_andre.isChecked()) {
                    textLista[2] = "Santo André";
                }
                if (inter.isChecked()) {
                    textLista[3] = "Inter";
                }
                for (int i = 0; i < 4; i++) {
                    resposta += textLista[i] + ", ";
                }
                        mensagem.setTitle("Times escolhidos: ");
                        mensagem.setMessage(resposta.replace("null",""));
                        mensagem.show();
                        textLista[0] = "";
                        textLista[1] = "";
                        textLista[2] = "";
                        textLista[3] = "";
                        resposta = "";
            }
        });

    }
}
