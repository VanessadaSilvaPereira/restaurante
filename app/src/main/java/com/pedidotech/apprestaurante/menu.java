package com.pedidotech.apprestaurante;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class menu extends AppCompatActivity {
    private Button botaoBebidas;
    private Button botaoSaladas;
    private Button botaoPratoPrincipal;
    private Button botaoSobremesas;
    private Button botaoConfig;
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

        botaoConfig = (Button) findViewById(R.id.btnConfig);
        botaoConfig.setOnClickListener(new View.OnClickListener() {
            @Override



            public void onClick(View v) {

                final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(menu.this);
                alertDialogBuilder.setTitle("Digite a senha de Administrador");

                final EditText input = new EditText(menu.this);
                alertDialogBuilder.setView(input);



                alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {




                    @Override
                    public void onClick(DialogInterface dialog, int which) {



                        Intent it = new Intent(menu.this, config.class);

                        startActivity(it);
                    }


                });


                alertDialogBuilder.setNegativeButton("Cancelar", null);


                alertDialogBuilder.show();



            }
        });

    }
}
