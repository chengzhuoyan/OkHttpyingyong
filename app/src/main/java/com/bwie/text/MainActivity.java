package com.bwie.text;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Request;

public class MainActivity extends AppCompatActivity {
    private String path = "https://news-at.zhihu.com/api/4/news/latest";
    private MyBean bean;
    private RecyclerView recyclrview;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOkHttp();
    }

    private void setOkHttp() {
        OkHttp.getAsync(path, new OkHttp.DataCallBack() {
            @Override
            public void requestFailure(Request request, IOException e) {
            }
            @Override
            public void requestSuccess(String result) throws Exception {
                Gson gson = new Gson();
                bean = gson.fromJson(result, MyBean.class);
                setRecyclerView();
            }
        });
    }
    private void setRecyclerView() {
        recyclrview = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclrview.setLayoutManager(linearLayoutManager);
        myAdapter = new MyAdapter(MainActivity.this, bean);
        recyclrview.setAdapter(myAdapter);
    }

}
