package com.liebersonsantos.apistarwarsmpv.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.liebersonsantos.apistarwarsmpv.R;

import io.reactivex.disposables.CompositeDisposable;

public class BaseActivity extends AppCompatActivity {

    private FragmentStatePagerAdapter fragmentStatePagerAdapter;
    private FrameLayout frameLayout;
    protected CompositeDisposable disposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        frameLayout = findViewById(R.id.container);

    }

    public void setTabsPage() {
        ViewPager mViewPager = findViewById(R.id.container_viewpager);
        TabLayout tabLayout = findViewById(R.id.tabs);

        if (mViewPager != null) {
            mViewPager.setAdapter(fragmentStatePagerAdapter);
            mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        }
        if (tabLayout != null) {
            tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
            tabLayout.setVisibility(View.VISIBLE);
        }

    }

    public void setContainerView(int layout) {
        View view = getLayoutInflater().inflate(layout, null);
        frameLayout.addView(view);

    }

    public void setFragmentsPageAdapter(FragmentStatePagerAdapter adapter) {
        this.fragmentStatePagerAdapter = adapter;
    }

    @Override
    protected void onDestroy() {
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDestroy();
    }
}