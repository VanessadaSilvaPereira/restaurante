package com.pedidotech.apprestaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class config extends AppCompatActivity {
private Button botaoCadatro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        botaoCadatro = (Button) findViewById(R.id.btnCadastrarItem);
        botaoCadatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(config.this, CadastroProduto.class);
                startActivity(it);
            }
        });


    }
}
