package com.EstebanTesis;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.EstebanTesis.ConexionActivity;
public class MainActivity extends Activity  implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View BotonMenuAdministrador = findViewById(R.id.BtnMenuAdmistrador);
        BotonMenuAdministrador.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View vista) {
		// TODO Auto-generated method stub
    if(vista.getId()== findViewById(R.id.BtnMenuAdmistrador).getId())
    {	
    	Intent  j = new Intent(this, administradorActivity.class);
    	startActivity(j);
    }	
		
	}
    
}
