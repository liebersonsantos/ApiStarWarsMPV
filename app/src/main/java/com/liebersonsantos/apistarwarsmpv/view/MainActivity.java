package com.liebersonsantos.apistarwarsmpv.view;

import android.os.Bundle;

import com.liebersonsantos.apistarwarsmpv.R;
import com.liebersonsantos.apistarwarsmpv.SectionsPageAdapter;

import butterknife.ButterKnife;

public class MainActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContainerView(R.layout.activity_main);
        setFragmentsPageAdapter(new SectionsPageAdapter(getSupportFragmentManager()));
        setTabsPage();

    }
}
