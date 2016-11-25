package io.github.alaguna.foursquare.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.github.alaguna.foursquare.ContainerActivity;
import io.github.alaguna.foursquare.R;
import io.github.alaguna.foursquare.adapter.CategoriaAdapter;
import io.github.alaguna.foursquare.model.Categoria;
import io.github.alaguna.foursquare.model.Sitio;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private ArrayAdapter adaptador;
    private ListView lista;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_list, container, false);

        List<Sitio> sitios = new ArrayList<>();
        for (Categoria categoria: ContainerActivity.categorias) {
            sitios.addAll(categoria.getSitios());
        }

        lista = (ListView)v.findViewById(R.id.listList);

        adaptador = new CategoriaAdapter(getContext(),0, sitios);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        return v;
    }

}
