package com.example.converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        final EditText inchToCentiText = (EditText)findViewById(R.id.editTextInch); 
        final Button inchToCentiButton = (Button) findViewById(R.id.inchButton);
        
        inchToCentiButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	TextView inchToCentiView = (TextView)findViewById(R.id.textViewInch);
            	double a = Double.parseDouble(inchToCentiText.getText().toString().trim());
            	a = a * 2.54;
            	inchToCentiView.setText(String.valueOf(a));
            	
            	
            }
        });
        
        final EditText centiToInchText = (EditText)findViewById(R.id.editTextCenti); 
        final Button centiToInchButton = (Button) findViewById(R.id.centiButton);
        
        centiToInchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	TextView centiToInctView = (TextView)findViewById(R.id.textViewCenti);
            	double b = Double.parseDouble(centiToInchText.getText().toString().trim());
            	b = b * .393701;
            	centiToInctView.setText(String.valueOf(b));
            	
            	
            }
        });
        
        final EditText mileToKMText = (EditText)findViewById(R.id.editTextMiles); 
        final Button mileToKMButton = (Button) findViewById(R.id.milesButton);
        
        mileToKMButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	TextView mileToKMView = (TextView)findViewById(R.id.textViewMiles);
            	double c = Double.parseDouble(mileToKMText.getText().toString().trim());
            	c = c * 1.60934;
            	mileToKMView.setText(String.valueOf(c));
            	
            	
            }
        });
        
        final EditText mileToKMText = (EditText)findViewById(R.id.editTextMiles); 
        final Button mileToKMButton = (Button) findViewById(R.id.milesButton);
        
        mileToKMButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	TextView mileToKMView = (TextView)findViewById(R.id.textViewMiles);
            	double c = Double.parseDouble(mileToKMText.getText().toString().trim());
            	c = c * 1.60934;
            	mileToKMView.setText(String.valueOf(c));
            	
            	
            }
        });
        
        
        
    }
}
