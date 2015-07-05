package com.EstebanTesis;

import com.EstebanTesis.ConexionActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;



public class IngresarSeccionActivity extends Activity   {
private EditText TxtCod_Sec,TxtNom_Sec,TxtUbicacion;
private Button BtnIngresarDatosSeccion; 
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ingresarseccion);
        TxtCod_Sec= (EditText)findViewById(R.id.TxtCod_Sec);
        TxtNom_Sec= (EditText)findViewById(R.id.TxtNom_Seccion);
        TxtUbicacion= (EditText)findViewById(R.id.TxtUbicacion);
        
        
      BtnIngresarDatosSeccion.setOnClickListener( new View.OnClickListener(){
		
		@Override
		public void onClick(View v) {
			String CodigoSec=TxtCod_Sec.getText().toString();
			String NomSec=TxtNom_Sec.getText().toString();
			String Ubicacion=TxtUbicacion.getText().toString();
			
			ConexionActivity cn = new ConexionActivity(getApplicationContext(),"BDEvaluacion.db",null,1);
			SQLiteDatabase db= cn.getWritableDatabase();
			cn.InsertarSeccion(db,CodigoSec,NomSec,Ubicacion);
		}
      });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

  
   //public void onClick(View vista) {
		
    //if(vista.getId()== findViewById(R.id.BtnIngresarSeccion).getId())
    //{	
    //	Intent  j = new Intent(this, IngresarSeccionActivity.class);
    //	startActivity(j);
    //}	

    //}		
}	