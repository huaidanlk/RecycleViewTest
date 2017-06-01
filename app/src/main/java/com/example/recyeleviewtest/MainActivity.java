package com.example.recyeleviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends TranslucentBarBaseActivity {
    private  RecyclerView mRecyclerView;
    private FruitAdapter fruitAdapter;
    private List<Fruit> mFruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        startActivity(new Intent(this,DrawerlayoutActivity.class));
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }
    private void initView() {
        mRecyclerView= (RecyclerView) findViewById(R.id.rv_test1);
//        垂直布局
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        水平布局
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

//        网格布局
//        GridLayoutManager layoutManager=new GridLayoutManager(this,4);
//            瀑布流布局
//        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(layoutManager);
        initData();//初始化recyclerView数据

        fruitAdapter=new FruitAdapter(mFruitList);
        mRecyclerView.setAdapter(fruitAdapter);
    }

    private void initData() {
        for(int i=0;i<3;i++){
            mFruitList.add(new Fruit(getRandomLengthName("啊啊"),R.drawable.essential_icons_cancel));
            mFruitList.add(new Fruit(getRandomLengthName("啊啊"),R.drawable.essential_icons_cancel));
            mFruitList.add(new Fruit(getRandomLengthName("啊啊"),R.drawable.essential_icons_clock));
            mFruitList.add(new Fruit(getRandomLengthName("啊啊"),R.drawable.essential_icons_comment));
            mFruitList.add(new Fruit(getRandomLengthName("啊啊"),R.drawable.essential_icons_comment_lines));
        }
    }
    private String getRandomLengthName(String name){
        Random random=new Random();
        int length=random.nextInt(20)+1;
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<length;i++){
            builder.append(name);
        }
        return builder.toString();
    }
}
