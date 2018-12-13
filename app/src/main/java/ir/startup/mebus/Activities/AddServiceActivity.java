package ir.startup.mebus.Activities;

import androidx.appcompat.app.AppCompatActivity;
import ir.hamsaa.RtlMaterialSpinner;
import ir.startup.mebus.R;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class AddServiceActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_add_service);

        try {
            String[] ITEMS = {"ایتم اول", "ایتم دوم", "ایتم سوم"};
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ITEMS);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            RtlMaterialSpinner spinner = findViewById(R.id.spinner);
            RtlMaterialSpinner spinner2 = findViewById(R.id.spinner2);
            spinner.setAdapter(adapter);
            spinner2.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
