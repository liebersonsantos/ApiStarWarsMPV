package com.liebersonsantos.apistarwarsmpv;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.liebersonsantos.apistarwarsmpv.view.fragment.CharactersFragment;
import com.liebersonsantos.apistarwarsmpv.view.fragment.MoviesFragment;
import com.liebersonsantos.apistarwarsmpv.view.fragment.PlanetsFragment;
import com.liebersonsantos.apistarwarsmpv.view.fragment.SpeciesFragment;
import com.liebersonsantos.apistarwarsmpv.view.fragment.StarshipsFragment;
import com.liebersonsantos.apistarwarsmpv.view.fragment.VehiclesFragment;

public class SectionsPageAdapter extends FragmentStatePagerAdapter {

    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;

        switch (position) {
            case 0:
                fragment = new MoviesFragment();
                break;
            case 1:
                fragment = new CharactersFragment();
                break;
            case 2:
                fragment = new StarshipsFragment();
                break;
            case 3:
                fragment = new VehiclesFragment();
                break;
            case 4:
                fragment = new SpeciesFragment();
                break;
            case 5:
                fragment = new PlanetsFragment();
                break;
            default:
                fragment = new MoviesFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 6;
    }
}
