package com.pedidotech.apprestaurante;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.List;

public class menu extends AppCompatActivity {
//    private Button botaoBebidas;
//    private Button botaoSaladas;
//    private Button botaoPratoPrincipal;
//    private Button botaoSobremesas;
//    private Button botaoConfig;

    private ListView lvCategorias;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lvCategorias = (ListView) findViewById(R.id.listaCategorias);

        public void carregarPessoas(List <menu> lvCategorias){
            AdapterCategorias = new AdapterCategorias(this, lvCategorias);
            lvCategorias.setAdapter(adapter);
        }

        class GetJSON extends AsyncTask<Void, Void, List<menu> > {
            @Override
            public void onPreExecute() {
                load = ProgressDialog.show(menu.this,
                        "Por favor aguarde",
                        "Carregando as categorias do servidor...");
            }

            @Override
            protected List<menu> doInBackground(Void... voids) {
                return consultaCategoria.getPessoas();
            }

            @Override
            protected void onPostExecute(List<menu> categorias) {
                carregarCategorias(categorias);

                load.dismiss();
            }
        }


//        AdapterCategorias adapter = new AdapterCategorias(this, lista);
//        lvCategorias.setAdapter(adapter);
//
//
//
//    private class GetJSON extends AsyncTask<Void, Void, List<Pessoa> > {
//        @Override
//        protected void onPreExecute() {
//            load = ProgressDialog.show(ContatosActivity.this,
//                    "Por favor aguarde",
//                    "Carregando as pessoas do servidor...");
//        }
//    }
//        botaoBebidas = (Button) findViewById(R.id.btnBebidas);
//
//        botaoBebidas.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent it = new Intent(menu.this, bebidas.class);
//                startActivity(it);
//            }
//        });
//
//
//        botaoSaladas = (Button) findViewById(R.id.btnSaladas);
//
//        botaoSaladas.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent it = new Intent(menu.this, saladas.class);
//                startActivity(it);
//            }
//        });
//
//        botaoPratoPrincipal = (Button) findViewById(R.id.btnPratoPrincipal);
//
//        botaoPratoPrincipal.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent it = new Intent(menu.this, pratoPrincipal.class);
//                startActivity(it);
//            }
//        });
//
//        botaoSobremesas = (Button) findViewById(R.id.btnSobremesas);
//
//        botaoSobremesas.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent it = new Intent(menu.this, sobremesas.class);
//                startActivity(it);
//            }
//        });
//
//        botaoConfig = (Button) findViewById(R.id.btnConfig);
//        botaoConfig.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//
//
//            public void onClick(View v) {
//
//                final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(menu.this);
//                alertDialogBuilder.setTitle("Digite a senha de Administrador");
//
//                final EditText input = new EditText(menu.this);
//                alertDialogBuilder.setView(input);
//
//
//
//                alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//
//
//
//
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//
//
//                        Intent it = new Intent(menu.this, config.class);
//
//                        startActivity(it);
//                    }
//
//
//                });
//
//
//                alertDialogBuilder.setNegativeButton("Cancelar", null);
//
//
//                alertDialogBuilder.show();
//
//
//
//            }
//        });

    }
}
