package com.example.hw42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SeondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = findViewById(R.id.textView_recipe );

        String name= getIntent() .getExtras() .getString("name");

        textView .setText(name );
    }
}