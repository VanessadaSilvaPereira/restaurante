package com.pedidotech.apprestaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pratoPrincipal extends AppCompatActivity {
    private Button botaoMeuPedido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prato_principal);

        botaoMeuPedido = (Button) findViewById(R.id.btnMeuPedido);

        botaoMeuPedido.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(pratoPrincipal.this, MeuPedidoActivity.class);
                startActivity(it);
            }
        });

    }
}
