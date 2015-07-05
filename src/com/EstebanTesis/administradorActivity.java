package com.EstebanTesis;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;


public class administradorActivity extends Activity implements OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admnistrador);
        View BotonIngresarSeccion = findViewById(R.id.BtnIngresarSeccion);
        BotonIngresarSeccion.setOnClickListener(this);
        View BotonIngresarTrabajador= findViewById(R.id.BtnIngresarTrabajador);
        BotonIngresarTrabajador.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
    public void onClick(View vist) {
		// TODO Auto-generated method stub
    if(vist.getId()== findViewById(R.id.BtnIngresarSeccion).getId())
    {	
    	Intent  x = new Intent(this,IngresarSeccionActivity.class);
    	startActivity(x);
    }	
    if(vist.getId()== findViewById(R.id.BtnIngresarTrabajador).getId())
    {
    	Intent y = new Intent(this,IngresarTrabajadorActivity.class);
    	startActivity(y);
    }

    }		
}	