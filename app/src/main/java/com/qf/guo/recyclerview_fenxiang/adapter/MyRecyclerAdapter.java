package com.qf.guo.recyclerview_fenxiang.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qf.guo.recyclerview_fenxiang.R;

import java.util.List;

/**
 * Created by asus on 2016/10/10.
 */
//泛型是自定义的ViewHolder的类型:先填泛型再实现方法
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {

    private final Context context;
    private final List<String> list;

    public MyRecyclerAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    //getView():不管子视图是不是来自回收器的，都要调用
    //onCreateViewHolder：只在绘制新的item的时候回调，在这个方法中，创建ViewHolder对象返回即可
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_layout,null);
        MyViewHolder viewHolder = new MyViewHolder(itemView);
        return viewHolder;
    }

    //回调这个方法来绑定数据：
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //绑定数据到相应的子控件
        holder.textView.setText(list.get(position));
    }

    //返回要绘制的子视图的数量
    @Override
    public int getItemCount() {
        return list.size();
    }

    //这个类是自定义的ViewHolder：用于管理每一个item中的子控件，
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        View view;
        //必须实现这个构造方法：参数是子视图对象,当绘制每一个子视图的时候就会把这个对象传递到MyViewHolder的构造方法
        public MyViewHolder(View itemView) {
            super(itemView);
            //从子视图对象中找到子控件
            textView = (TextView) itemView.findViewById(R.id.item_text);
            view = itemView.findViewById(R.id.view);

        }
    }
}
