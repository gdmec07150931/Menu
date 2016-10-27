package com.a07150931.lxc.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private int mcount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.textView);
        registerForContextMenu(tv1);
    }

//创建选项菜单；
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

    //加载 mymenu.xml  ;
    //    MenuInflater mi = getMenuInflater();
    //    mi.inflate(R.menu.mymenu,menu);

    //  用 java 代码加载菜单;
        menu.add(0,1,0,"菜单2");
        menu.add(0,2,0,R.string.menu1);
        menu.add(0,3,0,R.string.menu2);
        return super.onCreateOptionsMenu(menu);
    }
//选项菜单被选中；
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

//创建上下文菜单；
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

    //长按后弹出的上下文菜单；
        menu.add(0,1,0,"红烧牛肉");
        menu.add(0,2,0,"红烧排骨");
    }

//上下文菜单被选中；

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();

        return super.onContextItemSelected(item);
    }

//每点击一下菜单，自动加多一个菜单项；
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        mcount++;
        menu.add(0,3+mcount,0,"菜单"+mcount);

        return super.onPrepareOptionsMenu(menu);
    }
}



















