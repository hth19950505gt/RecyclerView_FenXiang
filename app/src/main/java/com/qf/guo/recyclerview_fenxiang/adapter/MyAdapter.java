package com.qf.guo.recyclerview_fenxiang.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qf.guo.recyclerview_fenxiang.Fragment.MyRecyclerViewFragment;

/**
 * Created by Administrator on 2016/10/10 0010.
 */
public class MyAdapter extends FragmentPagerAdapter{
    private  String[] titles;
    public MyAdapter(FragmentManager fragmentManager, String[] titles) {
        super(fragmentManager);
        this.titles = titles;
    }
    @Override
    public Fragment getItem(int position) {
        MyRecyclerViewFragment myFragment = new MyRecyclerViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",titles[position]);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
