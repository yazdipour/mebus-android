package ir.startup.mebus.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.crowdfire.cfalertdialog.CFAlertDialog;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import ir.startup.mebus.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    private boolean playedTapTarget = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!playedTapTarget)
            TapTargetView.showFor(this,
                    TapTarget.forView(findViewById(R.id.service_btn),
                            "سرویس", "سرویس تست آموزش")
                            .outerCircleAlpha(.9f)
                            .titleTextSize(30)
                            .descriptionTextSize(20)
                            .textColor(R.color.white)
                            .descriptionTextColor(R.color.white)
                            .outerCircleColor(R.color.colorPrimaryDark)
                            .drawShadow(true)
                            .cancelable(true)
                            .tintTarget(true)
                            .transparentTarget(true)
                            .textTypeface(Objects.requireNonNull(ResourcesCompat.getFont(this, R.font.irsans)))
                            .targetRadius(80));
        playedTapTarget = true;
        findViewById(R.id.info_btn).setOnClickListener(this);
        findViewById(R.id.ad_btn).setOnClickListener(this);
        findViewById(R.id.profile_btn).setOnClickListener(this);
        findViewById(R.id.way_special_btn).setOnClickListener(this);
        findViewById(R.id.ways_btn).setOnClickListener(this);
        findViewById(R.id.service_btn).setOnClickListener(this);
        findViewById(R.id.driver_btn).setOnClickListener(this);
        findViewById(R.id.telegram_btn).setOnClickListener(this);
        findViewById(R.id.waiter_btn).setOnClickListener(this);
        findViewById(R.id.tours_btn).setOnClickListener(this);
        findViewById(R.id.lift_btn).setOnClickListener(this);
        findViewById(R.id.menu_btn).setOnClickListener(this);
        ((NavigationView) findViewById(R.id.nav_view)).setNavigationItemSelectedListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.menu_btn:
                ((DrawerLayout) findViewById(R.id.drawer_layout)).openDrawer(Gravity.RIGHT);
                break;
            case R.id.profile_btn:
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(this)
                        .setTitle(R.string.title5)
                        .setTextGravity(Gravity.CENTER_HORIZONTAL)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.BOTTOM_SHEET)
                        .addButton("پروفایل", getResources().getColor(R.color.white), getResources().getColor(R.color.colorPrimary), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                            dialog.dismiss();
                        })
                        .addButton(getResources().getString(R.string.label_messages), getResources().getColor(R.color.white), getResources().getColor(R.color.colorPrimaryDark), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            startActivity(new Intent(MainActivity.this, MessagesActivity.class));
                            dialog.dismiss();
                        });
                builder.show();
                break;
            case R.id.way_special_btn:
            case R.id.ways_btn:
            case R.id.service_btn:
            case R.id.waiter_btn:
            case R.id.tours_btn:
                Intent i = new Intent(MainActivity.this, ServicesActivity.class);
                i.putExtra("source", view.getId());
                startActivity(i);
                break;
            case R.id.lift_btn:
                startActivity(new Intent(MainActivity.this, RequestActivity.class));
                break;
            case R.id.driver_btn:
                startActivity(new Intent(MainActivity.this, DriversActivity.class));
                break;
            case R.id.info_btn:
            case R.id.telegram_btn:
            case R.id.ad_btn:
            case R.id.nav_share:
            case R.id.nav_send:
            default:
                Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        View view = new View(this);
        view.setId(menuItem.getItemId());
        onClick(view);
        ((DrawerLayout) findViewById(R.id.drawer_layout)).closeDrawer(GravityCompat.START);
        return true;
    }
}
