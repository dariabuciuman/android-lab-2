package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int nr1 = getIntent().getIntExtra("number1", 0);
        int nr2 = getIntent().getIntExtra("number2", 0);
        TextView result = findViewById(R.id.resultOutput);
        Integer res = nr1 + nr2;
        result.setText(res.toString());
    }

    public void navigateToOldActivity(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}