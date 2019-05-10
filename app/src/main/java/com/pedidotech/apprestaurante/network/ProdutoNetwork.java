package com.pedidotech.apprestaurante.network;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.pedidotech.apprestaurante.model.Produto;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
public class ProdutoNetwork {

    public static final String URL_FOTOS = "http://adalto.pro.br/agenda_web/m162/fotos/";

    public static List<Produto> getPessoas(){
        String url = "https://pedidotech.000webhostapp.com/consultaProduto.php";
        List<Produto> listaProdutos = new ArrayList<>();
        String json = NetworkUtil.getJSONFromAPI(url);
        try {
            JSONObject object = new JSONObject( json );

            JSONArray arrayProdutos = object.getJSONArray("produtos");
            if ( arrayProdutos.length() > 0 ){

                for (int i = 0; i<arrayProdutos.length(); i++){
                    JSONObject item = arrayProdutos.getJSONObject(i);
                    Produto produto = new Produto();
                    produto.setId( item.getInt("codigo"));
                    produto.setNome( item.getString("nome") );
                    String end = URL_FOTOS + item.getString("foto");

                    produto.setFoto( item.getString("foto" ) );

                    Bitmap foto = baixarFoto(end);
                    produto.setFoto(foto);
                    listaProdutos.add( produto );
                }
            }
        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }
        return listaProdutos;
    }

    private static Bitmap baixarFoto(String url){
        try {
            URL endereco = new URL( url );
            InputStream is = endereco.openStream();
            Bitmap foto = BitmapFactory.decodeStream( is );
            is.close();
            return foto;
        }catch (IOException e){
            return null;
        }
    }
}
