package io.github.alaguna.foursquare.adapter;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import io.github.alaguna.foursquare.model.Categoria;

/**
 * Created by Alaguna on 23/11/2016.
 */

public class GsonCategoriaParser {
    public List<Categoria> leerJson(InputStream in) throws IOException {
        Gson gs = new Gson();
        JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
        List<Categoria> categoria = new ArrayList<Categoria>();
        Categoria c = null;
        reader.beginArray();
        while(reader.hasNext()){
            c = gs.fromJson(reader,Categoria.class);
            categoria.add(c);
        }
        reader.endArray();
        reader.close();
        return categoria;


    }

}
