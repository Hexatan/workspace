package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener { //implements OnClickListener permet � l'activit� de detecter les clics
	private TextView monTexte = null;
	private TextView t2 = null;
	private Button b = null;
	private EditText champ = null;
	private SeekBar progbar = null;
	
	/*Methode lanc�e a chaque fois que l'application est re/lanc�e*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);//On modifie l'activit� avec le contenu du fichier activity_main
		b = (Button) findViewById(R.id.bouton);//On cherche la vue grace a son id�e puis on la caste en button
		monTexte = (TextView) findViewById(R.id.text);
		champ = (EditText) findViewById(R.id.editText);
		t2 = (TextView) findViewById(R.id.text2);
		progbar = (SeekBar) findViewById(R.id.seekBar);
		b.setOnClickListener(this);//On associe le bouton et le listener du clic
		progbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
					t2.setText(progress + " " + fromUser);
			}
		});
	}
	
	//M�thode appeller � chaque clique sur le bouton
	@Override
	public void onClick(View v) {
		String t = champ.getText().toString();
		monTexte.setText(t);
	}
	
	
}
