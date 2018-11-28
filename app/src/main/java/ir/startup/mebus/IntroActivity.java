package ir.startup.mebus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
//import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class IntroActivity extends AppIntro {
//    private SharedPreferences share;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        share = getSharedPreferences("x", MODE_PRIVATE);
//        Boolean setting = share.getBoolean(getString(R.string.app_name), false);
        if (false) {
//            GoMain();
            return;
        }
//        addSlide(AppIntroFragment.newInstance(
//                "Title",
//                "irsans-Regular.ttf",
//                "desc",
//                "irsans-Regular.ttf",
//                R.drawable.fourbus,
//                Color.parseColor("#f39c12"),
//                0,
//                0
//        ));
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));
        showSkipButton(false);
        setProgressButtonEnabled(true);
    }

//    @Override
//    public void onDonePressed(Fragment currentFragment) {
//        super.onDonePressed(currentFragment);
//        GoMain();
//    }

    /**
     * Go to the Main Page = TabbedActivity
     */
//    private void GoMain() {
////        share.edit().putBoolean(getString(R.string.app_name), true).apply();
//        Intent i = new Intent(getApplicationContext(), MainActivity.class);
//        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(i);
//        finish();
//    }
}