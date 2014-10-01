package com.example.brotherprofiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BrotherProfile extends Activity {

	private EditText name;
	private EditText position;
	private EditText Class;
	private EditText big;
	private EditText little;
	private EditText prevPos;
	private EditText age;
	private EditText employment;
	private EditText major;
	private EditText from;
	private EditText q1;
	private EditText q2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brother_profile);
        
        name=(EditText)findViewById(R.id.nameEditText);
        position=(EditText)findViewById(R.id.positionEditText);
        Class=(EditText)findViewById(R.id.classEditText);
        big=(EditText)findViewById(R.id.bigEditText);
        little=(EditText)findViewById(R.id.littleEditText);
        prevPos=(EditText)findViewById(R.id.prevPosEditText);
        age=(EditText)findViewById(R.id.ageEditText);
        employment=(EditText)findViewById(R.id.employEditText);
        major=(EditText)findViewById(R.id.majorEditText1);
        from =(EditText)findViewById(R.id.fromEditText);
        q1=(EditText)findViewById(R.id.textbox1);
        q2=(EditText)findViewById(R.id.textbox2);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.brother_profile, menu);
        return true;
    }
    
    public void saveClicked(View v){
    	
    	try{
    		
    		 File external = Environment.getExternalStorageDirectory();
             String sdcardPath = external.getPath();
    		
             FileWriter filewriter = new FileWriter(sdcardPath
                     + "/Documents/profile.txt", true);
             BufferedWriter out = new BufferedWriter(filewriter);
        
             
    		out.write("Name: " +name.getText().toString() + "\r\n");
    		out.write("Current Position: " +position.getText().toString()+ "\r\n");
    		out.write("Class: " +Class.getText().toString() + "\r\n");
    		out.write("Big: " +big.getText().toString() + "\r\n");
    		out.write("Little: " +little.getText().toString() + "\r\n");
    		out.write("Previous Position: " +prevPos.getText().toString() + "\r\n");
    		out.write("Age: " +age.getText().toString() + "\r\n");
    		out.write("Employment: " +employment.getText().toString() + "\r\n");
    		out.write("From: " +from.getText().toString() + "\r\n");
    		out.write("Question 1: " +q1.getText().toString() + "\r\n");
    		out.write("Question 2: " +q2.getText().toString() + "\r\n");
    		out.newLine();
    		out.newLine();
    		out.newLine();
    		out.newLine();
    		out.close();
    		filewriter.close();
    		
    		Toast.makeText(this, "The contents are saved in the file.", Toast.LENGTH_LONG).show();
    		 
    	}catch(Throwable t){
    		
    		Toast.makeText(this, "Exception: "+t.toString(), Toast.LENGTH_LONG).show();
    	}
    }
    
}
