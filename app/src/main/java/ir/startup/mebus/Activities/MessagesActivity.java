package ir.startup.mebus.Activities;

import androidx.appcompat.app.AppCompatActivity;
import ir.startup.mebus.R;
import me.anwarshahriar.calligrapher.Calligrapher;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.crowdfire.cfalertdialog.CFAlertDialog;

public class MessagesActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_messages);
        new Calligrapher(this).setFont(this, "irsans-Regular.ttf", true);
        findViewById(R.id.more_btn).setOnClickListener(view -> {
            Toast.makeText(this, "REMOVED", Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.main_card).setOnClickListener(view -> {
            CFAlertDialog.Builder builder = new CFAlertDialog.Builder(this)
                    .setTitle(((TextView) findViewById(R.id.title)).getText())
                    .setTextGravity(Gravity.CENTER_HORIZONTAL)
                    .setMessage(((TextView) findViewById(R.id.subtitle)).getText())
                    .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                    .addButton("دیدن تورها", -1, -1, CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                        startActivity(new Intent(MessagesActivity.this, ProfileActivity.class));
                        dialog.dismiss();
                    })
                    .addButton(getResources().getString(R.string.delete), -1, -1, CFAlertDialog.CFAlertActionStyle.NEGATIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                        startActivity(new Intent(MessagesActivity.this, MessagesActivity.class));
                        dialog.dismiss();
                    });
            builder.show();
        });
    }
}
