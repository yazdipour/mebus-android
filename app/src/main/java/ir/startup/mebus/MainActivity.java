package ir.startup.mebus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;

import androidx.appcompat.app.AppCompatActivity;
import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Calligrapher(this).setFont(this, "irsans-Regular.ttf", true);
        TapTargetView.showFor(this,
                TapTarget.forView(findViewById(R.id.infobtn), "تست", "تست آموزش")
                        .outerCircleAlpha(0.8f)
                        .titleTextSize(30)
                        .descriptionTextSize(20)
                        .textColor(R.color.white)
                        .drawShadow(true)
                        .cancelable(true)
                        .tintTarget(true)
                        .transparentTarget(true)
                        .targetRadius(60));
        findViewById(R.id.infobtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.infobtn:
                startActivity(new Intent(MainActivity.this, DriversActivity.class));
                break;
        }
    }
}
