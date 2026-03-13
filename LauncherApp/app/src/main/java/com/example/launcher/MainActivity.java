package com.example.launcher;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create intent to start com.softwinner.awsource/.MainActivity
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.softwinner.awsource", "com.softwinner.awsource.MainActivity"));
        startActivity(intent);

        // Close this activity
        finish();
    }
}