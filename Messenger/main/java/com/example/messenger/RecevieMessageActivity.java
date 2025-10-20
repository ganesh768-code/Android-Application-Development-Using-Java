package com.example.messenger;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class RecevieMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recevie_message);

        Intent intent=getIntent();
        String messageText=intent.getStringExtra("EXTRA_MESSAGE");
        TextView Messageview=(TextView) findViewById(R.id.result);
        Messageview.setText(messageText);

    }
}