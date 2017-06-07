package com.example.recyeleviewtest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.recyeleviewtest.R;

import java.util.ArrayList;

/**
 * Created by 坏蛋 on 2017/6/5.
 */

public class RecycleDoubleItemItemAdapter extends RecyclerView.Adapter<RecycleDoubleItemItemAdapter.ViewHolder> {
    private ArrayList<Integer> list;

    public RecycleDoubleItemItemAdapter(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_double_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.iv_image.setImageResource(list.get(position));
    }

    @Override
    public int getItemCount() {
        if (list == null)
            return 0;
        else
            return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_image;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_image = (ImageView) itemView.findViewById(R.id.iv_image);
          /*  ViewGroup.LayoutParams layoutParams = iv_image.getLayoutParams();
            layoutParams.width = layoutParams.height = 300;
            iv_image.setLayoutParams(layoutParams);*/
        }
    }

}
