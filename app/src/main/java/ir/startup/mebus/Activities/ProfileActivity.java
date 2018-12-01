package ir.startup.mebus.Activities;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

import com.crowdfire.cfalertdialog.CFAlertDialog;

import androidx.appcompat.app.AppCompatActivity;
import ir.startup.mebus.R;
import me.anwarshahriar.calligrapher.Calligrapher;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        new Calligrapher(this).setFont(this, "irsans-Regular.ttf", true);
        findViewById(R.id.logout_btn).setOnClickListener(view -> {
            CFAlertDialog.Builder builder = new CFAlertDialog.Builder(this)
                    .setTitle("آیا  میخواهید خارج شوید؟")
                    .setTextGravity(Gravity.CENTER_HORIZONTAL)
                    .setDialogStyle(CFAlertDialog.CFAlertStyle.BOTTOM_SHEET)
                    .addButton("بله", -1, -1, CFAlertDialog.CFAlertActionStyle.NEGATIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                        Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    })
                    .addButton("خیر", -1, -1, CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                        dialog.dismiss();
                    });
            builder.show();
        });
    }
}
