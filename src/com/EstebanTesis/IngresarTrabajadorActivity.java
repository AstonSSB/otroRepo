package com.EstebanTesis;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;


public class IngresarTrabajadorActivity extends Activity   {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingresotrabajador);
       // View BotonIngresarSeccion = findViewById(R.id.BtnIngresarSeccion);
        //BotonIngresarSeccion.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
