package com.example.mvvmarchitect;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager;

import com.example.mvvmarchitect.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {
    int i=0,j=0,k=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }

 /*   @Override
    protected void onPause() {
        super.onPause();
        j++;
        if(j==1) {
            ActivityManager activityManager = (ActivityManager) getApplicationContext()
                    .getSystemService(Context.ACTIVITY_SERVICE);
            activityManager.moveTaskToFront(getTaskId(), 0);

        }
    }*/

 /*   @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean result;
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("Test", "Back button pressed! "+i);
            i++;
            if(i==1)
                result = true;
            else
                result = super.onKeyDown(keyCode, event);
        } else if (keyCode == KeyEvent.KEYCODE_HOME) {
            Log.i("Test", "Home button pressed!");
            j++;
            if(j==1)
                result = true;
            else
                result = super.onKeyDown(keyCode, event);
        } else if (keyCode == KeyEvent.KEYCODE_MENU) {
            Log.i("Test", "Menu button pressed!");
            k++;
            if(k==1)
                result = true;
            else
                result = super.onKeyDown(keyCode, event);
        } else {
            result = super.onKeyDown(keyCode, event);
        }
        return result;
    }*/
}
