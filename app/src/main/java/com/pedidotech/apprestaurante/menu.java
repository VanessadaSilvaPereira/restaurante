package com.pedidotech.apprestaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    private Button botaoBebidas;
    private Button botaoSaladas;
    private Button botaoPratoPrincipal;
    private Button botaoSobremesas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        botaoBebidas = (Button) findViewById(R.id.btnBebidas);

        botaoBebidas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(menu.this, bebidas.class);
                startActivity(it);
            }
        });


        botaoSaladas = (Button) findViewById(R.id.btnSaladas);

        botaoSaladas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(menu.this, saladas.class);
                startActivity(it);
            }
        });

        botaoPratoPrincipal = (Button) findViewById(R.id.btnPratoPrincipal);

        botaoPratoPrincipal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(menu.this, pratoPrincipal.class);
                startActivity(it);
            }
        });

        botaoSobremesas = (Button) findViewById(R.id.btnSobremesas);

        botaoSobremesas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(menu.this, sobremesas.class);
                startActivity(it);
            }
        });
    }
}
