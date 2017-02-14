package com.example.zew.demo2.provider;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zew.demo2.R;
import com.example.zew.demo2.entity.Category;

import me.drakeet.multitype.ItemViewProvider;

/**
 * Created by zew on 17/2/14.
 */
public class CategoryViewProvider extends ItemViewProvider<Category,CategoryViewProvider.ViewHolder> {
    private Context context;

    public CategoryViewProvider(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_recycle, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, @NonNull Category category) {
        holder.category.setText(category.text);
    }

    static class  ViewHolder extends RecyclerView.ViewHolder{
        private final TextView category;
         ViewHolder(View itemView) {
            super(itemView);
            this.category= (TextView) itemView.findViewById(R.id.tv);
        }

    }
}
