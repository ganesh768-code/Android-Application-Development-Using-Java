package com.example.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;



import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onclickfindbeer(View view){
        TextView brand=(TextView) findViewById(R.id.result);
        Spinner colors =(Spinner) findViewById(R.id.spinner);
        String beerType=String.valueOf(colors.getSelectedItem());

        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brands : brandsList) {
            brandsFormatted.append(brands).append('\n');
        }

        brand.setText(brandsFormatted);


    }

}