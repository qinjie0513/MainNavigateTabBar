package com.qinjie.example;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qinjie.example.fragment.Example1Fragment;
import com.qinjie.example.fragment.Example2Fragment;
import com.qinjie.mainnavigatetabbar.MainNavigateTabBar;

public class MainActivity extends AppCompatActivity {

    private MainNavigateTabBar mMainNavigateTabBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainNavigateTabBar = findViewById(R.id.mainNavigateTabBar);
        mMainNavigateTabBar.onRestoreInstanceState(savedInstanceState);
        initMainNavigateTabBar();
    }

    @Override
    protected void onSaveInstanceState(@Nullable Bundle outState) {
        super.onSaveInstanceState(outState);
        mMainNavigateTabBar.onSaveInstanceState(outState);
    }

    private void initMainNavigateTabBar() {
        mMainNavigateTabBar.addTab(Example1Fragment.class, new MainNavigateTabBar.TabParam(R.mipmap.tab_information_unselect, R.mipmap.tab_information_select, "咨讯"));
        mMainNavigateTabBar.addTab(Example2Fragment.class, new MainNavigateTabBar.TabParam(R.mipmap.tab_search_unselect, R.mipmap.tab_search_select, "查询"));
        mMainNavigateTabBar.addTab(Example1Fragment.class, new MainNavigateTabBar.TabParam(R.mipmap.tab_me_unselect, R.mipmap.tab_me_select, "我的"));
    }

}
