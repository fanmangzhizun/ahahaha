package com.zhizun.fanmang.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
        Student c=new Student();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mylistview=(ListView)findViewById(R.id.list_1);
        ArrayAdapter<String> b=new ArrayAdapter<String>(MainActivity.this,R.layout.listline,c.a);
        mylistview.setAdapter(b);
    }
}
