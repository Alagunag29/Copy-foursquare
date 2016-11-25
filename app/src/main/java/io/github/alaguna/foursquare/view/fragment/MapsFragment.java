package io.github.alaguna.foursquare.view.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.MapFragment;

import java.util.ArrayList;
import java.util.List;

import io.github.alaguna.foursquare.ContainerActivity;
import io.github.alaguna.foursquare.R;
import io.github.alaguna.foursquare.model.Categoria;
import io.github.alaguna.foursquare.model.Sitio;

public class MapsFragment extends android.support.v4.app.Fragment implements OnMapReadyCallback {


    GoogleMap maps;

    private SupportMapFragment fragmentMap;
    public MapsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_maps, container, false);
        android.support.v4.app.FragmentManager fragmentManager=getChildFragmentManager();
        fragmentMap=(SupportMapFragment)fragmentManager.findFragmentById(R.id.map);

        if(fragmentMap!=null){
            fragmentMap=SupportMapFragment.newInstance();
            fragmentMap.getMapAsync(this);
            fragmentMap.setRetainInstance(true);
            fragmentManager.beginTransaction().add(R.id.map,fragmentMap).commit();
        }

        return view;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        maps=googleMap;
        LatLng santa = new LatLng(11.2403547,-74.2110227);
        maps.animateCamera(CameraUpdateFactory.newLatLngZoom(santa,11));
        /*
        List<Categoria> categorias = ContainerActivity.categorias;
        if (categorias != null) {
            for (Categoria categoria : categorias) {
                for (Sitio sitio : categoria.getSitios()) {
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.println(sitio.getNombre());
                    System.out.println(sitio.getUbicacion().getLatitud());
                    System.out.println(sitio.getUbicacion().getLongitud());
                    LatLng posicion = new LatLng(sitio.getUbicacion().getLatitud(), sitio.getUbicacion().getLongitud());
                    MarkerOptions par = new MarkerOptions().title(sitio.getNombre()).position(posicion);
                    maps.addMarker(par);
                }
            }
        }*/

    }


}
