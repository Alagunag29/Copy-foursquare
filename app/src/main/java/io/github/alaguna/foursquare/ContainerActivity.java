package io.github.alaguna.foursquare;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import io.github.alaguna.foursquare.view.fragment.ListFragment;
import io.github.alaguna.foursquare.view.fragment.MapsFragment;
import io.github.alaguna.foursquare.view.fragment.SearchFragment;

public class ContainerActivity extends AppCompatActivity {

    ListFragment listFragment;
    MapsFragment mapsFragment;
    SearchFragment searchFragment;

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
    }
}
