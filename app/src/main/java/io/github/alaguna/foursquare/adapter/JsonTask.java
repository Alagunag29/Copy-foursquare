package io.github.alaguna.foursquare.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import io.github.alaguna.foursquare.ContainerActivity;
import io.github.alaguna.foursquare.model.Categoria;
import io.github.alaguna.foursquare.model.Sitio;

/**
 * Created by Alaguna on 23/11/2016.
 */

public class JsonTask extends AsyncTask<URL, Void, List<Categoria>> {
    private HttpURLConnection connection = null;
    private ArrayAdapter adaptador;
    private Context context;

    public JsonTask(Context context) {
        this.context = context;
    }

    @Override
    protected List<Categoria> doInBackground(URL... urls) {
        List<Categoria> categorias = null;
        try {

            // Establecer la conexión
            connection = (HttpURLConnection)urls[0].openConnection();
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(10000);

            // Obtener el estado del recurso
            int statusCode = connection.getResponseCode();
            if(statusCode == 200) {
                // Parsear el flujo con formato JSON
                InputStream in = new BufferedInputStream(connection.getInputStream());

                GsonCategoriaParser categoriaParse = new GsonCategoriaParser();
                categorias = categoriaParse.leerJson(in);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            connection.disconnect();
        }
        return categorias;
    }


    protected void onPostExecute(List<Categoria> categorias) {
            /*
            Asignar los objetos de Json parseados al adaptador
             */
        if(categorias !=null) {
            ContainerActivity.categorias = categorias;
        } else {
            Toast.makeText(
                    this.context,
                    "Ocurrió un error de Parsing Json",
                    Toast.LENGTH_SHORT)
                    .show();
        }

    }
}
