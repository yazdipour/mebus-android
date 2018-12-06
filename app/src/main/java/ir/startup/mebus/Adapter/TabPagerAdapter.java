package ir.startup.mebus.Adapter;

import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList;
    private List<String> mFragmentTitleList;

    public TabPagerAdapter(FragmentManager fm, List<Fragment> mFragments, List<String> mTitles) {
        super(fm);
        mFragmentList = mFragments;
        mFragmentTitleList = mTitles;
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
