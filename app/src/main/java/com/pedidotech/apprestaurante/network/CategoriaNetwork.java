package com.pedidotech.apprestaurante.network;

import com.pedidotech.apprestaurante.model.Categoria;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class CategoriaNetwork {


    public static List<Categoria> getCategorias(){

        String url = "https://pedidotech.000webhostapp.com/consultaCategoria.php";
        List<Categoria> listaCategorias = new ArrayList<>();
        String json = NetworkUtil.getJSONFromAPI(url);
        try {
            JSONObject object = new JSONObject( json );

            JSONArray arrayCategorias = object.getJSONArray("categorias");
            if ( arrayCategorias.length() > 0 ){

                for (int i = 0; i<arrayCategorias.length(); i++){
                    JSONObject item = arrayCategorias.getJSONObject(i);
                    Categoria categoria = new Categoria();
                    categoria.setId( item.getInt("id"));
                    categoria.setNome( item.getString("nome"));

                    listaCategorias.add(categoria);
                }
            }
        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }
        return listaCategorias;
    }


}
