package com.rgb0101.listsample.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.rgb0101.listsample.R;
import com.rgb0101.listsample.list.Itemds;
import com.rgb0101.listsample.list.SampleAdapter;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by noirCynical on 2015. 10. 13..
 */
public class MainFragment extends Fragment {
    private View wholeView= null;
    private ListView mList= null;
    private SampleAdapter mAdapter= null;
    private ArrayList<Itemds> mContents= null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        wholeView= inflater.inflate(R.layout.fragment_main, null);
        return wholeView;
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
    }
    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
//        mList= (ListView)wholeView.findViewById(R.id.listviewFragmentMain);
//
//        ArrayList<String> content1= new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.listcontent)));
//        ArrayList<String> content2= new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.listcontent2)));
//        ArrayList<String> content3= new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.listcontent3)));
//        mContents= new ArrayList<Itemds>();
//        for(int i=0; i<30; i++){
//            Itemds temp= new Itemds();
//            temp.setContent1(content1.get(i%content1.size()));
//            temp.setContent2(content2.get(i%content2.size()));
//            temp.setContent3(content3.get(i%content3.size()));
//            mContents.add(temp);
//        }
//        mAdapter= new SampleAdapter(getActivity(), R.layout.listitem, mContents);
//        mList.setAdapter(mAdapter);
    }
}
