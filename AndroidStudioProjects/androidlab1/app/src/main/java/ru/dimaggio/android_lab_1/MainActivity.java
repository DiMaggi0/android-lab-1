package ru.dimaggio.android_lab_1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main_activity);
    }

    public void changeBackground(View view) {
        EditText colorInputField = findViewById(R.id.colour_text);
        String inputColor = colorInputField.getText().toString().trim();

        try {
            Color.parseColor(inputColor);
        } catch (IllegalArgumentException exception) {
            TextView errorMessage = findViewById(R.id.error_message);
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("color", inputColor);
        startActivity(intent);
    }
}
