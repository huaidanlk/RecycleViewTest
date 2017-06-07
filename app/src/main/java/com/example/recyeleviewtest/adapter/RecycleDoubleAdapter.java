package com.example.recyeleviewtest.adapter;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyeleviewtest.R;

import java.util.ArrayList;

/**
 * Created by 坏蛋 on 2017/6/1.
 */

public class RecycleDoubleAdapter extends RecyclerView.Adapter<RecycleDoubleAdapter.ViewHolder>{
    Activity activity;
    ArrayList<Integer> list;
    public RecycleDoubleAdapter(Activity activity,ArrayList<Integer> list) {
        this.list=list;
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.activity_recycle_view_double_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false){
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        holder.recyclerView.setLayoutManager(layoutManager);
        RecycleDoubleItemItemAdapter  recycleDoubleItemItemAdapter= new RecycleDoubleItemItemAdapter(list);
        holder.recyclerView.setAdapter(recycleDoubleItemItemAdapter);
        //child recyclerView 会影响parent recyclerView 的 nested事件
        holder.recyclerView.setNestedScrollingEnabled(false);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        public ViewHolder(View itemView) {
            super(itemView);
            recyclerView= (RecyclerView) itemView.findViewById(R.id.rv_double_item);
        }
    }
}
