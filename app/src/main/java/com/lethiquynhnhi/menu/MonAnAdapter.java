package com.lethiquynhnhi.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MonAnAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<MonAn> arrMonAn;

    public MonAnAdapter(Context context, int layout, ArrayList<MonAn> monAnList){
        this.context = context;
        this.layout = layout;
        this.arrMonAn = monAnList;
    }

    @Override
    public int getCount() {
        return arrMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return arrMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        View imgView;
        TextView tvTen;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(layout, null);

            holder = new ViewHolder();
            //Ánh xạ và gán giá trị

            holder.tvTen = (TextView) convertView.findViewById(R.id.textViewTen);
            holder.tvTen.setText(arrMonAn.get(position).mTen);

            holder.imgView = (View) convertView.findViewById(R.id.imgHinh);
            holder.imgView.setBackgroundResource(arrMonAn.get(position).mHinh);
            convertView.setTag(holder);
        } else {
            holder  = (ViewHolder) convertView.getTag();
        }


        return convertView;
    }
}
