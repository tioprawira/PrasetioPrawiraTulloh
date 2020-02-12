package com.example.pindahlayout;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.annotation.TargetApi;
import android.os.Build;

@SuppressLint("NewApi") public class Login extends Activity implements OnClickListener {
	EditText userName, Password;
	Button next;
	String userValue, passwordValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        userName = (EditText) findViewById(R.id.editText1);
        Password = (EditText) findViewById(R.id.editText2);
        next = (Button) findViewById (R.id.next);
        next.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		userValue=userName.getText().toString();
		   passwordValue=Password.getText().toString();
		   
		   
		   
		   if(userValue.isEmpty())
		   {
		    Toast.makeText(getApplicationContext(), "Please enter user name", Toast.LENGTH_LONG).show();
		   }
		   else if(passwordValue.isEmpty())
		   {
		    Toast.makeText(getApplicationContext(), "Please enter password", Toast.LENGTH_LONG).show();
		   }
		   else
		   {
		    
		    if(userValue.equals("admin") && passwordValue.equals("admin"))
		    {
		     Toast.makeText(getApplicationContext(), "Login Sucessfully", Toast.LENGTH_LONG).show();
		    }
		    else
		    {
		     Toast.makeText(getApplicationContext(), "Invalid user id or password", Toast.LENGTH_LONG).show(); 
		    }
		    
		   }
		   
		   
		   startActivity(new Intent("com.example.activity_utama"));
	};
    
}
