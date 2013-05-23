package com.example.tutoandroiddessin;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class TutoAndroidDessinActivity extends Activity {
	Dessin dessin = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tuto_android_dessin);
		dessin = (Dessin) findViewById(R.id.dessin);
		dessin.setOnTouchListener(dessin);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tuto_android_dessin, menu);
		return true;
	}

}
