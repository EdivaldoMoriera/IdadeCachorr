package com.example.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText caixaTexto;
    private Button botao;
    private TextView idade;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botao = (Button) findViewById(R.id.botaoId);
        idade = (TextView) findViewById(R.id.resultadoId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String textoDigitado =  caixaTexto.getText().toString();
               if(textoDigitado.isEmpty()){
                   idade.setText("Nenhum Numero digitado!!!!!!!!");

               }else {
                   int valorDigitado = Integer.parseInt(textoDigitado);
                   int resultadoFinal = valorDigitado * 7;
                   idade.setText("A idade do cachorro é " + resultadoFinal + "Anos");
               }
            }
        });
    }
}
