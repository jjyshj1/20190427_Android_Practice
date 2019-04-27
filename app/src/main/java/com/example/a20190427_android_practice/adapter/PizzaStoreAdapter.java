package com.example.a20190427_android_practice.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a20190427_android_practice.R;
import com.example.a20190427_android_practice.datas.PizzaStore;

import java.util.List;

public class PizzaStoreAdapter extends ArrayAdapter<PizzaStore> {

    Context mContext;
    List<PizzaStore> mList;
    LayoutInflater inf;

    public PizzaStoreAdapter(Context context, List<PizzaStore> list) {

        super(context, R.layout.pizza_spinner_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {

            row = inf.inflate(R.layout.pizza_spinner_item, null);
        }

        PizzaStore  storeData = mList.get(position);

        ImageView logoImgView = row.findViewById(R.id.logoImgView);
        TextView nameTxt = row.findViewById(R.id.nameTxt);


        nameTxt.setText(storeData.storeName);
        return row;
    }


    @Override
    public View getDropDownView(int position,  View convertView, ViewGroup parent) {


        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.pizza_spinner_list_item, null);
        }

        PizzaStore  storeData = mList.get(position);

        ImageView logoImgView = row.findViewById(R.id.logoImgView);
        TextView nameTxt = row.findViewById(R.id.nameTxt);
        TextView locationTxt = row.findViewById(R.id.locationTxt);
        TextView openTimeTxt = row.findViewById(R.id.openTimeTxt);

        nameTxt.setText(storeData.storeName);
        locationTxt.setText(String.format("(%s)", storeData.location));
        openTimeTxt.setText(storeData.openTime);
        return row;
    }
}