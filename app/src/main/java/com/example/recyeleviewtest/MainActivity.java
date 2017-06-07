package com.example.recyeleviewtest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends TranslucentBarBaseActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.btn1:
                intent=new Intent(this,RecycleViewActivity.class);
                startActivity(intent);
                break;
            case R.id.btn2:
                intent=new Intent(this,RecycleViewDouble.class);
                startActivity(intent);
                break;
        }
    }
}
