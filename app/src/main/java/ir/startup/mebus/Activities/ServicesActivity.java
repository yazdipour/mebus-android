package ir.startup.mebus.Activities;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import ir.startup.mebus.Fragments.DriversFragment;
import ir.startup.mebus.Fragments.ServiceFragment;
import ir.startup.mebus.R;
import ir.startup.mebus.TabPagerAdapter;
import me.anwarshahriar.calligrapher.Calligrapher;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        new Calligrapher(this).setFont(this, "irsans-Regular.ttf", true);
        String[] titles = new String[]{
                getResources().getString(R.string.title5),
                getResources().getString(R.string.title6),
                getResources().getString(R.string.title7),
                getResources().getString(R.string.title8),
        };
        Fragment[] fragments = new Fragment[]{
                new ServiceFragment(),
                new ServiceFragment(),
                new ServiceFragment(),
                new ServiceFragment()
        };
        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new TabPagerAdapter(getSupportFragmentManager(), fragments, titles));
        tabLayout.setupWithViewPager(viewPager);
    }
}
