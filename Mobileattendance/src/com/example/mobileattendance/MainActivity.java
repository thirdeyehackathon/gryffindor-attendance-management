package com.example.mobileattendance;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

	RadioGroup rg;
	RadioButton rb1,rb2;
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//rg=(RadioGroup)findViewById(R.id.radioGroup2);
		rg=(RadioGroup)findViewById(R.id.radioGroup2);
		rb1=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
		rb2=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
		b=(Button)findViewById(R.id.buttgo);
		b.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(rb2.isChecked() == true)
				{
					
				}
					if(rb1.isChecked() == true)
					{
						
						Intent i=new Intent(MainActivity.this,Idarea.class);
						startActivity(i);
					}
				
				

				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
