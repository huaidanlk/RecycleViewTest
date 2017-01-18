package com.example.recyeleviewtest;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ToolbarActivity extends TranslucentBarBaseActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setToolbar();

    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_toolbar;
    }

    private void setToolbar() {
        toolbar= (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setLogo(R.mipmap.ic_toolbar1);
//        toolbar.setTitle("");
//        toolbar.setSubtitle("小仙女");
        setSupportActionBar(toolbar);
        //hide toolbar title  must before setSupportActionBar()
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //        toolbar.setNavigationIcon(R.drawable.essential_icons_cancel);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.toolbar,menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.backup:
//                Toast.makeText(this,"backup",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.delete:
//                Toast.makeText(this,"delete",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.setting:
//                Toast.makeText(this,"setting",Toast.LENGTH_SHORT).show();
//                break;
//
//        }
//        return true;
//    }
}
