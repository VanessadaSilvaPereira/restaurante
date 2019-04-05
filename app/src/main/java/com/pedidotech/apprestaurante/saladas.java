package com.pedidotech.apprestaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class saladas extends AppCompatActivity {
private Button botaoMeuPedido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saladas);

        botaoMeuPedido = (Button) findViewById(R.id.btnMeuPedido);

        botaoMeuPedido.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(saladas.this, MeuPedidoActivity.class);
                startActivity(it);
            }
        });
    }
}
