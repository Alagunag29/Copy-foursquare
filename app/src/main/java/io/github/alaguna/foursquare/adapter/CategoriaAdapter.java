package io.github.alaguna.foursquare.adapter;

import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import io.github.alaguna.foursquare.R;
import io.github.alaguna.foursquare.model.Categoria;
import io.github.alaguna.foursquare.model.Sitio;
import io.techery.properratingbar.ProperRatingBar;

/**
 * Created by Alaguna on 23/11/2016.
 */

public class CategoriaAdapter extends ArrayAdapter  {

    public CategoriaAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = convertView;

        if( null == convertView){
            v = inflater.inflate(R.layout.item_places, parent, false);
        }


        Sitio item = (Sitio) getItem(position);
        TextView nameSite = (TextView)v.findViewById(R.id.nameSite);
        TextView specialty = (TextView)v.findViewById(R.id.specialty);
        ProperRatingBar rating = (ProperRatingBar) v.findViewById(R.id.rating);
        TextView city = (TextView)v.findViewById(R.id.city);
        TextView descripcion = (TextView)v.findViewById(R.id.description);
        TextView nameOwer = (TextView)v.findViewById(R.id.nameOwner);
        ImageView imagenPlato = (ImageView) v.findViewById(R.id.imagenPlato);
        TextView puntaje = (TextView) v.findViewById(R.id.puntaje);


        nameSite.setText( position+1 + ". " + item.getNombre());
        specialty.setText(item.getEspecialidad());
        city.setText(item.getUbicacion().getCiudad());
        descripcion.setText(item.getDescripcion());
        nameOwer.setText(item.getPropietario());
        System.out.println(item.getFoto());
        System.out.println("------------------------------------------------------------------------------------------------------");
        Glide.with(getContext().getApplicationContext()).load(item.getFoto()).into(imagenPlato);
        rating.setRating(item.getValoracion());
        puntaje.setText( Double.toString(item.getCalificacion().getPuntaje()));



        return v;
    }
}
