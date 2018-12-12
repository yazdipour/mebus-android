package ir.startup.mebus.Activities;

import androidx.appcompat.app.AppCompatActivity;
import ir.hamsaa.RtlMaterialSpinner;
import ir.startup.mebus.R;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class AddCarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        try {
            String[] ITEMS = {"ایتم اول", "ایتم دوم", "ایتم سوم", "ایتم چهارم", "ایتم پنجم", "ایتم ششم"};
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ITEMS);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            RtlMaterialSpinner spinner = findViewById(R.id.spinner);
            spinner.setAdapter(adapter);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        spinner2.setAdapter(adapter);
    }
}
