package io.github.alaguna.foursquare.view.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import io.github.alaguna.foursquare.ContainerActivity;
import io.github.alaguna.foursquare.R;
import io.github.alaguna.foursquare.model.Categoria;
import io.github.alaguna.foursquare.view.ListPlacesActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Button buttonBreakfast, buttonLunch, buttonDinner, buttonCoffe, buttonNight, buttonThingsToDo;
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        buttonBreakfast = (Button) view.findViewById(R.id.buttonBreakfast);
        buttonLunch = (Button) view.findViewById(R.id.buttonLunch);
        buttonDinner = (Button) view.findViewById(R.id.buttonDinner);
        buttonCoffe = (Button) view.findViewById(R.id.buttonCoffe);
        buttonNight = (Button) view.findViewById(R.id.buttonNight);
        buttonThingsToDo = (Button) view.findViewById(R.id.buttonThingsToDo);

        buttonBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContainerActivity.categorias != null){
                    lanzarIntentActivity(0);
                }
            }
        });

        buttonLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContainerActivity.categorias != null){
                    lanzarIntentActivity(1);
                }
            }
        });

        buttonDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContainerActivity.categorias != null){
                    lanzarIntentActivity(2);
                }
            }
        });

        buttonCoffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContainerActivity.categorias != null){
                    lanzarIntentActivity(3);
                }
            }
        });

        buttonNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContainerActivity.categorias != null){
                    lanzarIntentActivity(4);
                }
            }
        });

        buttonThingsToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContainerActivity.categorias != null){
                    lanzarIntentActivity(5);
                }
            }
        });

        return view;
    }

    public void lanzarIntentActivity(int i){
        Categoria categoria = ContainerActivity.categorias.get(i);
        Intent intent = new Intent( getActivity(), ListPlacesActivity.class);
        intent.putExtra("categoria", categoria);
        startActivity(intent);
    }

}
