package ir.startup.mebus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<String> mFragmentTitleList = new ArrayList<>();

    public TabPagerAdapter(FragmentManager fm, Fragment[] mFragments, String[] mTitles) {
        super(fm);
        Collections.addAll(mFragmentList, mFragments);
        Collections.addAll(mFragmentTitleList, mTitles);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}
