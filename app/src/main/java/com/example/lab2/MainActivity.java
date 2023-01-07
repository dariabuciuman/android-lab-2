package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void navigateToNewActivity(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Please check that you entered two numbers", Toast.LENGTH_SHORT);
        EditText number1 = findViewById(R.id.number1Input);
        EditText number2 = findViewById(R.id.number2Input);
        try {
            int nr1 = Integer.parseInt(number1.getText().toString());
            int nr2 = Integer.parseInt(number2.getText().toString());
            Intent intent1 = new Intent(this, MainActivity2.class);
            intent1.putExtra("number1", nr1);
            intent1.putExtra("number2", nr2);
            startActivity(intent1);
        } catch (NumberFormatException e) {
            toast.show();
        }
    }
}