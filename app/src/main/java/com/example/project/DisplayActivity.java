package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    Button Knappen;
    EditText name;
    SharedPreferences preferences;

    Button Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name = findViewById(R.id.edit_text);
        button = findViewById(R.id.save);
        preferences = getSharedPreferences("preferences", MODE_PRIVATE);
        return = findViewById(R.id.tillback);
        return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("name", namn.getText().toString());
            editor.apply();
        }
    });
}
}