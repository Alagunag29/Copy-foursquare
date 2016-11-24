package io.github.alaguna.foursquare.view.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import io.github.alaguna.foursquare.R;
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

        View view = inflater.inflate(R.layout.fragment_search, container, false);
        Button button = (Button) view.findViewById(R.id.buttonBreakfast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent = new Intent( getActivity(), ListPlacesActivity.class);
                startActivity(intent);

            }
        });

        return view;


    }

}
