package com.example.zew.demo2.provider;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zew.demo2.R;
import com.example.zew.demo2.entity.Head;

import me.drakeet.multitype.ItemViewProvider;

/**
 * Created by zew on 17/2/14.
 */
public class HeadViewProvider extends ItemViewProvider<Head,HeadViewProvider.ViewHolder> {
    private Context context;

    public HeadViewProvider(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_songs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Head head) {
        holder.songs.setText(head.song);
        holder.iv.setImageResource(head.icon);
    }

    static class  ViewHolder extends RecyclerView.ViewHolder{
        private TextView songs;
        private ImageView iv;
        public ViewHolder(View itemView) {
            super(itemView);
            this.songs= (TextView) itemView.findViewById(R.id.songs_tv);
            this.iv= (ImageView) itemView.findViewById(R.id.songs_iv);
        }
    }
}
