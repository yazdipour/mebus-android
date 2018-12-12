package ir.startup.mebus.Activities;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import ir.startup.mebus.Fragments.*;
import ir.startup.mebus.R;
import ir.startup.mebus.Adapter.TabPagerAdapter;

public class ServicesActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        try {
            getSupportActionBar().setElevation(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<String> titles = new ArrayList<>();
        titles.add(getResources().getString(R.string.title1));
        titles.add(getResources().getString(R.string.title2));
        titles.add(getResources().getString(R.string.title6));
        titles.add(getResources().getString(R.string.title7));
        titles.add(getResources().getString(R.string.title8));
        List<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(new WayFragment());
        fragments.add(new ServiceFragment());
        fragments.add(new WaysFragment());
        fragments.add(new TourFragment());
        fragments.add(new PaziraeFragment());
        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new TabPagerAdapter(getSupportFragmentManager(), fragments, titles));
        tabLayout.setupWithViewPager(viewPager);
        switch (getIntent().getExtras().getInt("source")) {
            case R.id.way_special_btn:
                viewPager.setCurrentItem(0);
                break;
            case R.id.ways_btn:
                viewPager.setCurrentItem(2);
                break;
            case R.id.service_btn:
                viewPager.setCurrentItem(1);
                break;
            case R.id.waiter_btn:
                viewPager.setCurrentItem(4);
                break;
            case R.id.tours_btn:
                viewPager.setCurrentItem(3);
                break;
        }
    }
}
