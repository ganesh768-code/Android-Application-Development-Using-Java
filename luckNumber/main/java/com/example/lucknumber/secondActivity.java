package com.example.lucknumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class secondActivity extends AppCompatActivity {

    TextView heading2,Number;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Number=findViewById(R.id.textView3);
        btn=findViewById(R.id.sharebtn);

        Intent i=getIntent();
        String name=i.getStringExtra("username");

        int number=numbergenerator();
        Number.setText(""+number);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharetodata(name,number);
            }
        });


    }

    public int numbergenerator(){
        Random r=new Random();

        int upper_limit=100;
        int randomnum=r.nextInt(upper_limit);

        return randomnum;
    }

    public void sharetodata(String name,int number){
        Intent i= new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        i.putExtra(Intent.EXTRA_SUBJECT,"Lucky Number");
        i.putExtra(Intent.EXTRA_TEXT,name+" Lucky Nunber is"+number);

        //i.putExtra(Intent.createChooser(i,"choose Your Option"));
        Intent chooser = Intent.createChooser(i, "Choose Your Option");

        // Step 4: Start the activity with the chooser intent
        startActivity(chooser);
    }
}