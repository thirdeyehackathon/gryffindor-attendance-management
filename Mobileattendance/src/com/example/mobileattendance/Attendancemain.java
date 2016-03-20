package com.example.mobileattendance;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Attendancemain extends Activity {
ImageView im;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendancemain);
        im=(ImageView)findViewById(R.id.selectone);
     //   Animation translatebu= AnimationUtils.loadAnimation(this, R.anim.animationfile);
      //  tv.setText("Some text view.");
       // tv.startAnimation(translatebu);
        im.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				
				// TODO Auto-generated method stub
				Intent mainIntent = new Intent(Attendancemain.this, MainActivity.class);
	            startActivity(mainIntent);
				
			}
		});
       

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.attendancemain, menu);
                   return true;
    }
}