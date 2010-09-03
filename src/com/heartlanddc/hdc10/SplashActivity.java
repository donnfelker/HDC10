package com.heartlanddc.hdc10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends Activity {
	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splash); 
		
		setButtonClickListeners(); 
	}

	private void setButtonClickListeners() {
		Button websiteButton = (Button)findViewById(R.id.websiteButton); 
		websiteButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SplashActivity.this, HdcWebActivity.class); 
				startActivity(i); 
			}
		});
		
		Button contactButon = (Button)findViewById(R.id.contactButton); 
		contactButon.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SplashActivity.this, HdcContactActivity.class); 
				startActivity(i); 
			}
		});
		
		Button tweetsButton = (Button)findViewById(R.id.tweetsButton); 
		tweetsButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SplashActivity.this, HdcTwitterActivity.class); 
				startActivity(i);
			}
		});
	}
}
