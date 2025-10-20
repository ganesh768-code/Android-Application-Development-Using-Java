package com.example.counterapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView counterwelcom,counternum;
    Button btn;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterwelcom=findViewById(R.id.text1);
        counternum=findViewById(R.id.text2);

        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counternum.setText(""+counter());
            }
        });

    }

    public int counter(){
        count=1+count;
        return count;
    }


}