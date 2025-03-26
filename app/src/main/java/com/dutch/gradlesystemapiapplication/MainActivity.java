package com.dutch.gradlesystemapiapplication;

import android.app.ActivityManager;
import android.content.pm.PackageManager;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ActivityManager activityManager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
//        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();

        PackageManager pm = getPackageManager();
        pm.setSyntheticAppDetailsActivityEnabled("com.example.pkg", true);

        int currentUser = activityManager.getCurrentUser();
        Log.d("CurrentUser", "User ID: " + currentUser);
        // Check if user is a "system user" (e.g., primary admin)
        boolean isSystemUser = (currentUser == 0); // User 0 = system owner
        Log.d("CurrentUser", "Is System User: " + isSystemUser);

        randomMethodForTesting();
    }

    public void randomMethodForTesting() {
    }
}