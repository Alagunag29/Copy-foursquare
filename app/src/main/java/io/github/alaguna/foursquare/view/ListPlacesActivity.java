package io.github.alaguna.foursquare.view;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

import io.github.alaguna.foursquare.ContainerActivity;
import io.github.alaguna.foursquare.R;
import io.github.alaguna.foursquare.adapter.CategoriaAdapter;
import io.github.alaguna.foursquare.adapter.JsonTask;
import io.github.alaguna.foursquare.model.Categoria;


public class ListPlacesActivity extends AppCompatActivity {

    private ArrayAdapter adaptador;
    private ListView lista;
    private Categoria categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_places);
        showToolbar( getResources().getString(R.string.title_toolbar_list_search), true);

        lista = (ListView)findViewById(R.id.list_places);

        categoria = (Categoria) getIntent().getSerializableExtra("categoria");

        adaptador = new CategoriaAdapter(this,0, categoria.getSitios());
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }


    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

}
