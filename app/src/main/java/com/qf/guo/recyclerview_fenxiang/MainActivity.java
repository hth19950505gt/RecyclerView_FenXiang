package com.qf.guo.recyclerview_fenxiang;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.qf.guo.recyclerview_fenxiang.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");

        setSupportActionBar(toolbar);
        initTab();
    }

    private void initTab() {
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        ViewPager viewpager = (ViewPager) findViewById(R.id.view_pager);
        String[] titles = new String[]{"相册","说说","个性化","@与我相关"};
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager(),titles);

        viewpager.setAdapter(myAdapter);
        tabLayout.setupWithViewPager(viewpager);
    }


}
