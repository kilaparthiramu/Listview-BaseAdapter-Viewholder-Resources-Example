package com.example.rkilaparthi.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rkilaparthi on 9/26/2016.
 */
public class BaseAdapterActivity extends BaseAdapter {

     LayoutInflater inflater;
     Context context;
     ArrayList myList=new ArrayList();

    public BaseAdapterActivity(Context context, ArrayList myList){

        this.context = context;
        this.myList = myList;
        inflater=LayoutInflater.from(this.context);
    }
    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public ListData getItem(int position) {
        return (ListData) myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return myList.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder holder;
        if(convertView == null){
            convertView=inflater.inflate(R.layout.row,parent,false);
            holder=new MyViewHolder();
            convertView.setTag(holder);
            holder.img=(ImageView)convertView.findViewById(R.id.image_view);
            holder.txt_title=(TextView)convertView.findViewById(R.id.txt_view_title);
            holder.txt_description=(TextView)convertView.findViewById(R.id.txt_view_description);
            ListData list_pos = (ListData) myList.get(position);
            holder.txt_title.setText(list_pos.getTitle());
            holder.txt_description.setText(list_pos.getDescription());
            holder.img.setImageResource(list_pos.getImage());
        }
        else {
            holder = (MyViewHolder) convertView.getTag();
        }
        return convertView;
    }
    private class MyViewHolder{
        TextView txt_title;
        TextView txt_description;
        ImageView img;

    }
}
