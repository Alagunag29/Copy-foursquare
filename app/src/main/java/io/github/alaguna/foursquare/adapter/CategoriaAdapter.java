package io.github.alaguna.foursquare.adapter;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import io.github.alaguna.foursquare.R;
import io.github.alaguna.foursquare.model.Categoria;

/**
 * Created by Alaguna on 23/11/2016.
 */

public class CategoriaAdapter extends ArrayAdapter  {

    public CategoriaAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    public View getView(int position, View convertView,
                        ViewGroup parent){
        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = convertView;

        if( null == convertView){
            v = inflater.inflate(R.layout.item_places, parent, false);
        }


        Categoria item = (Categoria) getItem(position);
        TextView nameSite = (TextView)v.findViewById(R.id.nameSite);
       // TextView namePlate = (TextView)v.findViewById(R.id.namePlate);
        TextView city = (TextView)v.findViewById(R.id.city);
       // TextView descripcion = (TextView)v.findViewById(R.id.descripcion);
        //TextView nameOwner = (TextView)v.findViewById(R.id.nameOwner);

         nameSite.setText(item.getNombre());
        //city.setText(item.getSiti(position).getUbicacion().getCiudad());

        return v;
    }
}
