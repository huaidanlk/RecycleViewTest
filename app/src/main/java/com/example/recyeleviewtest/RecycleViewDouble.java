package com.example.recyeleviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyeleviewtest.adapter.RecycleDoubleAdapter;

import java.util.ArrayList;

public class RecycleViewDouble extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Integer> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_double);
        initView();
    }

    private void initView() {
        if(list==null){
            list=new ArrayList<>();
            list.add(R.drawable.essential_icons_cancel);
            list.add(R.drawable.essential_icons_clock);
            list.add(R.drawable.essential_icons_comment);
            list.add(R.drawable.essential_icons_cancel);
            list.add(R.drawable.essential_icons_comment_lines);
            list.add(R.drawable.home18);
        }


        recyclerView= (RecyclerView) findViewById(R.id.rv_double);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        RecycleDoubleAdapter adapter= new RecycleDoubleAdapter(this,list);
//        RecycleDoubleItemItemAdapter adapter= new RecycleDoubleItemItemAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
