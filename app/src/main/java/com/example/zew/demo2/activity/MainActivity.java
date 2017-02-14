package com.example.zew.demo2.activity;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.zew.demo2.Listener.MyOnLoadMoreListener;
import com.example.zew.demo2.R;
import com.example.zew.demo2.entity.Category;
import com.example.zew.demo2.entity.Foot;
import com.example.zew.demo2.entity.Head;
import com.example.zew.demo2.entity.Songs;
import com.example.zew.demo2.provider.CategoryViewProvider;
import com.example.zew.demo2.provider.FootViewProvider;
import com.example.zew.demo2.provider.HeadViewProvider;
import com.example.zew.demo2.provider.SongsViewProvider;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnJump;
    int i=0;
    private RecyclerView rcy;
    private Items items;
    private MultiTypeAdapter multiTypeAdapter;
    private SwipeRefreshLayout swiplayout;
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btnJump = (Button) findViewById(R.id.btn_jump);
        rcy = (RecyclerView) findViewById(R.id.rcy);
        swiplayout = (SwipeRefreshLayout) findViewById(R.id.refresh);
        ll = (LinearLayout) findViewById(R.id.ll_more);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return (items.get(position) instanceof Songs) ? 1 : 2;
            }
        });
        rcy.setLayoutManager(layoutManager);
        items = new Items();
        multiTypeAdapter = new MultiTypeAdapter(items);
        multiTypeAdapter.register(Category.class,new CategoryViewProvider(this));
        multiTypeAdapter.register(Songs.class,new SongsViewProvider(this));
        multiTypeAdapter.register(Foot.class,new FootViewProvider(this));
        multiTypeAdapter.register(Head.class,new HeadViewProvider(this));
//        btnJump.setOnClickListener(this);
        swiplayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                items.add(0,new Head("头布局",R.mipmap.ic_launcher));
                multiTypeAdapter.notifyDataSetChanged();
                swiplayout.setRefreshing(false);
            }
        });

        for (int i = 0; i < 20; i++) {
            items.add(new Category("songs"));
            items.add(new Category("songs"));
            items.add(new Songs("小艾大人", R.mipmap.ic_launcher));
            items.add(new Songs("许岑", R.mipmap.ic_launcher));
        }

        rcy.addOnScrollListener(new MyOnLoadMoreListener(this,items,multiTypeAdapter,ll));
        rcy.setAdapter(multiTypeAdapter);


    }

    @Override
    public void onClick(View view) {


//        Boolean.valueOf(true);
//        Integer.valueOf(1);
//        BigInteger.probablePrime();
//        Class.forName().newInstance();
//        Intent intent =new Intent(this,SecondAct.class) ;
//        intent.putExtra("code",i++);
//        startActivity(intent);
    }


}
