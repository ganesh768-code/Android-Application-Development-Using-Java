package com.example.kilogamstopoundsconvertorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText input;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input=findViewById(R.id.edit1);
        result=findViewById(R.id.text1);
        btn=findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=input.getText().toString();

                double kilo=Double.parseDouble(number);

                double pounds=convert(kilo);
                result.setText(""+pounds);
            }
        });

    }

    public double convert(double kilo){
        // 1kilo=2.20462
        return kilo*2.20462;

    }
}