package ir.startup.mebus.Activities;

import androidx.appcompat.app.AppCompatActivity;
import ir.startup.mebus.R;
import me.anwarshahriar.calligrapher.Calligrapher;

import android.os.Bundle;

public class RequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        new Calligrapher(this).setFont(this, "irsans-Regular.ttf", true);
//        https://github.com/mohamad-amin/PersianMaterialDateTimePicker/
    }
}
