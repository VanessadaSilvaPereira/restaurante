package com.pedidotech.apprestaurante;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoTelaPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoTelaPrincipal = (Button) findViewById(R.id.btnTelaPrincipal);

        botaoTelaPrincipal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, menu.class);
                startActivity(it);
            }
        });

    }
}
