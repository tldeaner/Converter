/*
 * This app is a converter for metric to standard and back. The convert uses Inches, Centimeter, Miles and Kilometers.
 * 
 * @programmer Timothy Deaner
 * @course GUI
 * @Date 4/13/2015
 * 
 * <pre>
 * This application was designed on the Nexus 5 phone and is a basic converter application.
 * The application takes a number from the user in form of a standard or metric system and converts
 * it to its equivalent in the opposite measurement system. (Inches to centimeters or vice versa)  The program 
 * has a basic layout that allows the user to enter a number in a text field, the program takes that number
 * from the text field and multiplies by the correct number when the according button is pressed and then
 * displays the output in the text field.
 * </pre>
 * 
 * 
 * 
 */


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
        
        
        final EditText inchToCentiText = (EditText)findViewById(R.id.editTextInch);//inches text field
        final Button inchToCentiButton = (Button) findViewById(R.id.inchButton);//inches button
        
        inchToCentiButton.setOnClickListener(new View.OnClickListener() {//action listener for inches button
            public void onClick(View v) {
            	TextView inchToCentiView = (TextView)findViewById(R.id.textViewInch);
            	double a = Double.parseDouble(inchToCentiText.getText().toString().trim());
            	a = a * 2.54;//grabs the number from the user and multiples it for inches to centimeters
            	inchToCentiView.setText(String.valueOf(a));//displays the output to the user
            	
            	
            }
        });
        
        final EditText centiToInchText = (EditText)findViewById(R.id.editTextCenti); //Centimeters text field
        final Button centiToInchButton = (Button) findViewById(R.id.centiButton);//Centimeters button
        
        centiToInchButton.setOnClickListener(new View.OnClickListener() {//Action listener for centimeters button
            public void onClick(View v) {
            	TextView centiToInctView = (TextView)findViewById(R.id.textViewCenti);
            	double b = Double.parseDouble(centiToInchText.getText().toString().trim());
            	b = b * .393701;//grabs the number from he user and multiples it for centimeters to inches
            	centiToInctView.setText(String.valueOf(b));//outputs to the user
            	
            	
            }
        });
        
        final EditText mileToKMText = (EditText)findViewById(R.id.editTextMiles); //miles text field
        final Button mileToKMButton = (Button) findViewById(R.id.milesButton);//miles button
        
        mileToKMButton.setOnClickListener(new View.OnClickListener() {//Action listener for miles button
            public void onClick(View v) {
            	TextView mileToKMView = (TextView)findViewById(R.id.textViewMiles);
            	double c = Double.parseDouble(mileToKMText.getText().toString().trim());
            	c = c * 1.60934;//grabs the number from the user and multiplies it for miles to KM 
            	mileToKMView.setText(String.valueOf(c));//Displays to user
            	
            	
            }
        });
        
        final EditText kmToMileText = (EditText)findViewById(R.id.editTextKM); //km text field
        final Button kmToMileButton = (Button) findViewById(R.id.kmButton);//km button
        
        kmToMileButton.setOnClickListener(new View.OnClickListener() {//action listener for km
            public void onClick(View v) {
            	TextView kmToMileView = (TextView)findViewById(R.id.textViewKm);
            	double d = Double.parseDouble(kmToMileText.getText().toString().trim());
            	d = d * .621371;//grabs the number from the user and multiplies it for km to miles
            	kmToMileView.setText(String.valueOf(d));//displays to user
            	
            	
            }
        });
        
        
        
    }
}
