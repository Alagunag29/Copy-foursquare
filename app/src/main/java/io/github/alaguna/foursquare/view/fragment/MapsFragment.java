package io.github.alaguna.foursquare.view.fragment;


import android.app.Fragment;
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
/*
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;*/
import com.google.android.gms.maps.MapFragment;

import io.github.alaguna.foursquare.R;

public class MapsFragment extends android.support.v4.app.Fragment implements OnMapReadyCallback {

    GoogleMap map ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_maps, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*
        MapsFragment mapsFragment = (MapsFragment)getChildFragmentManager().findFragmentById(R.id.map);
        mapsFragment.getMa */

    }



    @Override
    public void onMapReady(GoogleMap googleMap) {

        map=googleMap;

        map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        map.getUiSettings().setZoomControlsEnabled(true);
        LatLng santa = new LatLng(7.93939494, -7.3232423);
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(santa, 12));

        MarkerOptions par = new MarkerOptions().title("paza").position(santa);
        map.addMarker(par);

    }
}
