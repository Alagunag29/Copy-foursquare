package io.github.alaguna.foursquare;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import io.github.alaguna.foursquare.adapter.JsonTask;
import io.github.alaguna.foursquare.model.Categoria;
import io.github.alaguna.foursquare.view.fragment.ListFragment;
import io.github.alaguna.foursquare.view.fragment.MapsFragment;
import io.github.alaguna.foursquare.view.fragment.SearchFragment;

public class ContainerActivity extends AppCompatActivity {

    ListFragment listFragment;
    MapsFragment mapsFragment;
    SearchFragment searchFragment;
    public static List<Categoria> categorias ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar);
        bottomBar.setDefaultTab(R.id.search);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.search:
                        SearchFragment searchFragment = new SearchFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, searchFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .addToBackStack(null).commit();
                        break;
                    case R.id.list:
                        ListFragment listFragment = new ListFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, listFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                    case R.id.maps:
                        MapsFragment mapsFragment = new MapsFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, mapsFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                }
            }
        });



        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        try {
            if (networkInfo != null && networkInfo.isConnected()) {
                JsonTask jTask = new JsonTask( getBaseContext());

                jTask.execute( new URL("https://www.dropbox.com/s/9k7p8462vy6fuy6/foursquare.json?dl=1"));

            }else{
                Toast.makeText(this, "Error de conexión", Toast.LENGTH_LONG).show();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
