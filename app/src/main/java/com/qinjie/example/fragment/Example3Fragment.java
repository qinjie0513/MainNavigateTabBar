package com.qinjie.example.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qinjie.example.R;

public class Example3Fragment extends Fragment {

    private TextView mTextView;

    public static Example3Fragment newInstance(int position) {
        Example3Fragment fragment = new Example3Fragment();
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_POSITION", position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_example, null);
        mTextView = view.findViewById(R.id.textview);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mTextView.setText("我的");
    }

}
