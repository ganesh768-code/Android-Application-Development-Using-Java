package com.example.messenger;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view){
        EditText Messageview=(EditText) findViewById(R.id.message);
        String messageText=Messageview.getText().toString();
        Intent intent=new Intent(this, RecevieMessageActivity.class);
        intent.putExtra("EXTRA_MESSAGE",messageText);

        //Intent intent = new Intent(Intent.ACTION_SEND);
        //intent.setType("text/plain");
        //intent.putExtra(Intent.EXTRA_TEXT, messageText);
        startActivity(intent);
    }
}