package ir.startup.mebus.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import ir.startup.mebus.Fragments.CarsFragment;
import ir.startup.mebus.Fragments.DriversFragment;
import ir.startup.mebus.Fragments.ServiceFragment;
import ir.startup.mebus.R;
import ir.startup.mebus.TabPagerAdapter;
import me.anwarshahriar.calligrapher.Calligrapher;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DriversActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers);
        new Calligrapher(this).setFont(this, "irsans-Regular.ttf", true);
        String[] titles = new String[]{"رانندگان", "وسایل نقلیه"};
        Fragment[] fragments = new Fragment[]{new DriversFragment(), new CarsFragment()};
        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new TabPagerAdapter(getSupportFragmentManager(), fragments, titles));
        tabLayout.setupWithViewPager(viewPager);
    }
}
