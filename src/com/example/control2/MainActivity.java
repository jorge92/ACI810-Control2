package com.example.control2;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity extends Activity {
	
	
	public EditText et1, et2;
    public Button button1;
    public RatingBar stars;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        button1 = (Button) findViewById(R.id.button1);
        stars = (RatingBar) findViewById(R.id.stars);
        
        button1.setOnClickListener(new android.view.View.OnClickListener() {

          @Override
          public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SegundoActivity.class);
                i.putExtra("nombre", et1.getText()+""); 
                i.putExtra("correo", et2.getText()+"");
                i.putExtra("rating", stars.getRating());
                startActivity(i);}});        
        
	}
}
