package com.rgb0101.listsample.list;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rgb0101.listsample.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by noirCynical on 2015. 10. 13..
 */
public class SampleAdapter extends ArrayAdapter<Itemds> {
    private Context mContext= null;
    private ArrayList<Itemds> mContents= null;

    public SampleAdapter(Context context, int resId, ArrayList<Itemds> contents){
        super(context, resId, contents);
        mContext= context;
        mContents= contents;
    }

    @Override
    public View getView(int position, View v, ViewGroup container){
        if(v == null) v= LayoutInflater.from(mContext).inflate(R.layout.listitem, null);
//        ((TextView)v.findViewById(R.id.textFragmentMainList01)).setText(mContents.get(position));
//        ((TextView)v.findViewById(R.id.textFragmentMainList02)).setText(mContents.get(position));
//        ((TextView)v.findViewById(R.id.textFragmentMainList02)).setTextColor(Color.argb(255, 200, 200, 150));
        ((TextView)v.findViewById(R.id.textFragmentMainList01)).setText(mContents.get(position).getContent1());
        ((TextView)v.findViewById(R.id.textFragmentMainList02)).setText(mContents.get(position).getContent2());
//        ((TextView)v.findViewById(R.id.textFragmentMainList01)).setText(mContents.get(position).getContent1());
        String temp= "", cont= mContents.get(position).getContent3();
        for(int i=0; i<cont.length(); i++){
            switch(i%5){
                case 0: temp += "<font color=\"red\">"+cont.substring(i,i+1)+"</font>"; break;
                case 1: temp += "<font color=\"black\">"+cont.substring(i, i+1)+"</font>"; break;
                case 2: temp += "<font color=\"blue\">"+cont.substring(i, i+1)+"</font>"; break;
                case 3: temp += "<font color=\"yellow\">"+cont.substring(i, i+1)+"</font>"; break;
                case 4: temp += "<font color=\"orange\">"+cont.substring(i,i+1)+"</font>"; break;
            }
        }
        ((TextView)v.findViewById(R.id.textFragmentMainList03)).setText(Html.fromHtml(temp));
        ((ImageView)v.findViewById(R.id.imageFragmentMainList)).setImageDrawable(mContext.getResources().getDrawable(R.drawable.icon));
        return v;
    }

    @Override
    public int getCount(){
        if(mContents == null) return 5;
        else return mContents.size();
    }
}
