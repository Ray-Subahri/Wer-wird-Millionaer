package com.raysubahri.werwirdmillionr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button firstAnswerBtn = findViewById(R.id.firstAnswerBtn);
        firstAnswerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wrongAnswerIntent = new Intent(getApplicationContext(), wrong.class);
                startActivity(wrongAnswerIntent);
            }
        });

        Button secondAnswerBtn = findViewById(R.id.secondAnswerBtn);
        secondAnswerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wrongAnswerIntent = new Intent(getApplicationContext(), wrong.class);
                startActivity(wrongAnswerIntent);
            }
        });

        Button thirdAnswerBtn = findViewById(R.id.thirdAnswerBtn);
        thirdAnswerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wrongAnswerIntent = new Intent(getApplicationContext(), wrong.class);
                startActivity(wrongAnswerIntent);
            }
        });

        Button fourthAnswerBtn = findViewById(R.id.fourthAnswerBtn);
        fourthAnswerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rightAnswerIntent = new Intent(getApplicationContext(), Right.class);
                startActivity(rightAnswerIntent);
            }
        });




    }
}