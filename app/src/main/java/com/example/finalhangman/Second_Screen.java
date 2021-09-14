package com.example.finalhangman;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Screen extends AppCompatActivity  implements OnClickListener {
    Button third_activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        third_activity = findViewById(R.id.third_activity_btn);
        third_activity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Third_Screen.class);
        startActivity(intent);
    }
}
