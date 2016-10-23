package com.qf.guo.recyclerview_fenxiang.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.guo.recyclerview_fenxiang.R;
import com.qf.guo.recyclerview_fenxiang.adapter.MyRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/10 0010.
 */
public class MyRecyclerViewFragment extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String title = getArguments().getString("title");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(title+"*************"+i);
        }
        View view = inflater.inflate(R.layout.fragment_layout, null);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        //设置布局管理器
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        MyRecyclerAdapter adapter = new MyRecyclerAdapter(getContext(),list);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
