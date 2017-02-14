package com.example.zew.demo2.Listener;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.zew.demo2.R;
import com.example.zew.demo2.entity.Foot;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

/**
 * Created by zew on 17/2/14.
 */
public class MyOnLoadMoreListener extends OnLoadMoreListener {
    private Activity context;
    private Items items;
    private MultiTypeAdapter multiTypeAdapter;
    private LinearLayout ll;
    public MyOnLoadMoreListener(Context context, Items items, MultiTypeAdapter multiTypeAdapter, LinearLayout ll) {
        this.context = (Activity) context;
        this.items=items;
        this.multiTypeAdapter=multiTypeAdapter;
        this.ll=ll;
    }

    @Override
    public void onLoadMore() {
        ll.setVisibility(View.VISIBLE);
        new Thread(new Runnable() {
            @Override
            public void run() {

                SystemClock.sleep(3000);
                context.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        items.add(new Foot("根布局", R.mipmap.ic_launcher));
                        multiTypeAdapter.notifyDataSetChanged();
                        ll.setVisibility(View.INVISIBLE);
                        Toast.makeText(context, "下拉刷新成功！", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }).start();

    }
}
