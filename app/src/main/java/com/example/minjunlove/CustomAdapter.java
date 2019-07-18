package com.example.minjunlove;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.minjunlove.model.Article;

import java.util.List;

public class CustomAdapter extends BaseAdapter {
    List<Article> items;

    public  CustomAdapter(List<Article> items){
        this.items = items;
    }
    @Override
    public int getCount(){
        return items.size();
    }

    @Override
    public Object getItem(int positon){
        return items.get(positon);
    }

    @Override
    public long getItemId(int postion){
        return 0;
    }

    @Override
    public View getView(int positon, View converView, ViewGroup parent){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);

        TextView list_item=v.findViewById(R.id.list_view);
        list_item.setText(items.get(positon).getTitle());

        return v;
    }
}
