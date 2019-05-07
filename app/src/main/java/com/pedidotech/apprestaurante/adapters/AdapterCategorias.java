package com.pedidotech.apprestaurante.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pedidotech.apprestaurante.model.Categoria;
import java.util.List;


public class AdapterCategorias extends BaseAdapter {
    private LayoutInflater inflater;
    private List<Categoria> listaCategorias;
    private Context contexto;

    public AdapterCategorias(Context contexto, List<Categoria> lista) {
        this.listaCategorias = lista;
        this.inflater = LayoutInflater.from(contexto);
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return listaCategorias.size();
    }

    @Override
    public Object getItem(int i) {
        return listaCategorias.get(i);
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
