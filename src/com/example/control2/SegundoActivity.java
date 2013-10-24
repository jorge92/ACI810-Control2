package com.example.control2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class SegundoActivity extends Activity {
	
	
	 public TextView tv1, tv2;
     public RatingBar stars2;
     String nombre,correo;
     
     @Override
     protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.registro);
             
             
             tv1 = (TextView) findViewById(R.id.tv1);
             tv2 = (TextView) findViewById(R.id.tv2);
             stars2 = (RatingBar) findViewById(R.id.stars2);
             
             nombre = getIntent().getStringExtra("nombre");
             correo = getIntent().getStringExtra("correo");
             Float rating = getIntent().getFloatExtra("rating", 0);

             tv1.setText(nombre);
             tv2.setText(correo);
             stars2.setRating(rating);
     
     } 
}

