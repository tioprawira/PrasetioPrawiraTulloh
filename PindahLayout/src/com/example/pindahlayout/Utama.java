package com.example.pindahlayout;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Utama extends Activity implements OnClickListener {
	Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
        
        back = (Button) findViewById (R.id.back);
        back.setOnClickListener(this);
    }

	@Override
	public void onClick(View arg0) {
		finish();
	}
    
}