package com.pedidotech.apprestaurante.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pedidotech.apprestaurante.model.Produto;
import com.pedidotech.apprestaurante.network.ProdutoNetwork;

import java.util.List;

public class adapterProdutos {
    private LayoutInflater inflater;
    private List<Produto> listaProdutos;
    private Context contexto;


    public AdapterProdutos(Context contexto, List<Produto> lista){
        this.listaProdutos = lista;
        this.inflater = LayoutInflater.from(contexto);
        this.contexto = contexto;
    }


    @Override
    public int getCount() {
        return listaProdutos.size();
    }

    @Override
    public Object getItem(int i) {
        return listaProdutos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listaProdutos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        ItemSuporte suporte;
        final Produto produto = listaProdutos.get( i );
        if ( view == null ){
            view = inflater.inflate(R.layout.layout_lista_pessoas, null);
            suporte = new ItemSuporte();
            suporte.tvNome = (TextView) view.findViewById(R.id.llTvNome);

            suporte.layout = (LinearLayout) view.findViewById(R.id.llLayout);
            suporte.ivFoto = (ImageView) view.findViewById(R.id.ivFoto);




            suporte.ivFoto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    abrirFoto(produto.getFoto());
                }
            });

        }else {
            suporte = (ItemSuporte) view.getTag();
        }

        suporte.tvNome.setText(  produto.getNome() );


        suporte.ivFoto.setImageBitmap(produto.getFoto() );
        if ( i % 2 == 0 )
            suporte.layout.setBackgroundColor
                    ( Color.rgb(255, 255, 255) );
        else
            suporte.layout.setBackgroundColor
                    ( Color.rgb(230, 230, 230) );
        view.setTag(suporte);

        return view;
    }

    private void abrirFoto(String foto){
        Uri local = Uri.parse( ProdutoNetwork.URL_FOTOS + foto);
        Intent intent = new Intent(Intent.ACTION_VIEW, local);
        ContatosActivity ca = (ContatosActivity) contexto;
        ca.startActivity(intent);
    }

    private class ItemSuporte{
        TextView tvNome, tvTelefone, tvCidade;
        LinearLayout layout;
        ImageView ivFoto;

    }
}

