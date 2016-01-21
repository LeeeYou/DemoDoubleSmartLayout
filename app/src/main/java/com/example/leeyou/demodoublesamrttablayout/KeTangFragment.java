package com.example.leeyou.demodoublesamrttablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class KeTangFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ketang, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getChildFragmentManager(), FragmentPagerItems.with(getActivity())
                .add("ketang_0", PageFragment.class)
                .add("ketang_1", PageFragment.class)
                .add("ketang_2", PageFragment.class)
                .add("ketang_3", PageFragment.class)
                .create());

        ViewPager viewPager = (ViewPager) getActivity().findViewById(R.id.ketang_viewpager);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(4);

        SmartTabLayout viewPagerTab = (SmartTabLayout) getActivity().findViewById(R.id.ketang_smarttablayout);
        viewPagerTab.setViewPager(viewPager);
    }

}
