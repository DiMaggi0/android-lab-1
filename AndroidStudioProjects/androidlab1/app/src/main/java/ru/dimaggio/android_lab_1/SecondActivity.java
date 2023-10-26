package ru.dimaggio.android_lab_1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;

public class SecondActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.background_changing);

        Intent intent = getIntent();
        String color = intent.getStringExtra("color");

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        constraintLayout.setBackgroundColor(Color.parseColor(color));
    }
}