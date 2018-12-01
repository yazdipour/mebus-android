package ir.startup.mebus.Activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.crowdfire.cfalertdialog.CFAlertDialog;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;

import androidx.appcompat.app.AppCompatActivity;
import ir.startup.mebus.R;
import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Calligrapher(this).setFont(this, "irsans-Regular.ttf", true);
        TapTargetView.showFor(this,
                TapTarget.forView(findViewById(R.id.service_btn), "سرویس", "سرویس تست آموزش")
                        .outerCircleAlpha(0.8f)
                        .titleTextSize(30)
                        .descriptionTextSize(20)
                        .textColor(R.color.white)
                        .descriptionTextColor(R.color.white)
                        .outerCircleColor(R.color.semiblack)
                        .drawShadow(true)
                        .cancelable(true)
                        .tintTarget(true)
                        .transparentTarget(true)
                        .targetRadius(80));
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
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.info_btn:
            case R.id.telegram_btn:
            case R.id.ad_btn:
                Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
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
        }
    }
}
