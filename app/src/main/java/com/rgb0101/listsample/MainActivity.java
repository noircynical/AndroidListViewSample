package com.rgb0101.listsample;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.rgb0101.listsample.fragments.MainFragment;

public class MainActivity extends FragmentActivity {

    private FragmentTransaction mFrgTransaction= null;
    private MainFragment mMainFragment= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
        moveFragment(Constants.MAIN);
    }
    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        mMainFragment= new MainFragment();
    }

    private void moveFragment(int type){
        mFrgTransaction= getSupportFragmentManager().beginTransaction();
        switch (type){
            case Constants.MAIN: mFrgTransaction.replace(R.id.container, mMainFragment); break;
        }
        mFrgTransaction.commit();
    }
}
