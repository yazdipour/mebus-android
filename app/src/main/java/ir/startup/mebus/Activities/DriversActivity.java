package ir.startup.mebus.Activities;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;

import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import ir.startup.mebus.Fragments.CarsFragment;
import ir.startup.mebus.Fragments.DriversFragment;
import ir.startup.mebus.R;
import ir.startup.mebus.TabPagerAdapter;
import me.anwarshahriar.calligrapher.Calligrapher;

public class DriversActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_drivers);
        new Calligrapher(this).setFont(this, "irsans-Regular.ttf", true);
        List<String> titles = Arrays.asList("رانندگان", "وسایل نقلیه");
        List<Fragment> fragments = Arrays.asList(new DriversFragment(), new CarsFragment());
        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new TabPagerAdapter(getSupportFragmentManager(), fragments, titles));
        tabLayout.setupWithViewPager(viewPager);
    }
}
