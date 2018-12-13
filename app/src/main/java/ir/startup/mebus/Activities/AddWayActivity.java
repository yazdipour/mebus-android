package ir.startup.mebus.Activities;

import androidx.appcompat.app.AppCompatActivity;
import ir.startup.mebus.R;

import android.os.Bundle;
import android.view.MenuItem;

public class AddWayActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_add_way);
    }
}
