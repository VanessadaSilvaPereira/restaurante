package com.pedidotech.apprestaurante;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import com.pedidotech.apprestaurante.adapters.AdapterCategorias;
import com.pedidotech.apprestaurante.model.Categoria;
import com.pedidotech.apprestaurante.network.CategoriaNetwork;

import java.util.List;

public class menu extends AppCompatActivity{

    private Button botaoConfig;
    private ListView lvCategorias;

    // pesquisar o que substituiu o PeogressDialog
    private ProgressDialog load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lvCategorias = (ListView) findViewById(R.id.lvCategorias);


        botaoConfig = (Button) findViewById(R.id.btnConfig);
        botaoConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(menu.this);
                alertDialogBuilder.setTitle("Digite a senha de Administrador");
                final EditText input = new EditText(menu.this);
                alertDialogBuilder.setView(input);
                alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener(){

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

        GetJSON download = new GetJSON();
        download.execute();
    }
    class GetJSON extends AsyncTask<Void, Void, List<Categoria> > {
        @Override
        public void onPreExecute() {
            load = ProgressDialog.show(menu.this,
                    "Por favor aguarde",
                    "Carregando as categorias do servidor...");
        }
        @Override
        protected List<Categoria> doInBackground(Void... voids) {
            return CategoriaNetwork.getCategorias();
        }
        @Override
        protected void onPostExecute(List<Categoria> categorias) {
            carregarCategorias(categorias);
            load.dismiss();
        }
    }
    public void carregarCategorias(List<Categoria> listaCategorias) {
        AdapterCategorias adapter = new AdapterCategorias(this, listaCategorias);
        lvCategorias.setAdapter(adapter);
    }
}
