package com.example.firstapplect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNumber;
    Button btnRandNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRandNumber = findViewById(R.id.btnRandNumber);
        tvNumber = findViewById(R.id.tvNumber);

    }

    public void newNumer(View view) {
        int num = (int) ((9-1+1)*Math.random());
        tvNumber.setText(String.valueOf(num));
        btnRandNumber.setText("Нажмите ещё раз!");
    }
}