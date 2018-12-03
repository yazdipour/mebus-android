package ir.startup.mebus.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.crowdfire.cfalertdialog.CFAlertDialog;

import androidx.appcompat.app.AppCompatActivity;
import ir.startup.mebus.R;
import me.anwarshahriar.calligrapher.Calligrapher;

public class ProfileActivity extends AppCompatActivity {

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
        findViewById(R.id.msg_fab).setOnClickListener(view -> startActivity(new Intent(ProfileActivity.this, MessagesActivity.class)));
        findViewById(R.id.edit_fab).setOnClickListener(view -> Toast.makeText(this, "Edit", Toast.LENGTH_SHORT).show());
        findViewById(R.id.back_btn).setOnClickListener(view -> onBackPressed());
    }
}
