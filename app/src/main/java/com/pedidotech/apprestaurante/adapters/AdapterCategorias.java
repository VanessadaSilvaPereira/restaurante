package com.pedidotech.apprestaurante.adapters;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pedidotech.apprestaurante.model.Categoria;
import java.util.List;

public class AdapterCategorias extends BaseAdapter {
    private LayoutInflater inflater;
    private List<Categoria> listaCategorias;
    private Context contexto;

    public AdapterCategorias(Context contexto, List<Categoria> lista) {
        Log.i("net", "Teste 03");
        this.listaCategorias = lista;
        this.inflater = LayoutInflater.from(contexto);
        this.contexto = contexto;
        Log.i("net", "Teste 04");
    }

    @Override
    public int getCount() {
        Log.i("net", "Teste 05");
        return listaCategorias.size();
    }

    @Override
    public Object getItem(int i) {
        return listaCategorias.get(i).toString();
    }

    @Override
    public long getItemId(int i) {
        return listaCategorias.get(i).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}

