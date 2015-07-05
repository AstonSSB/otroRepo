package com.EstebanTesis;
import java.sql.PreparedStatement;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;


public class ConexionActivity extends SQLiteOpenHelper {

	String sql= "CREATE TABLE secciones (Cod_Seccion TEXT PRIMARY KEY, NombreSeccion TEXT,Ubicacion TEXT )";
	public ConexionActivity (Context context,String name, CursorFactory factory, int version)
	{
	 super(context,name,factory,version);
	}
	@Override
	public void onCreate(SQLiteDatabase db){
		db.execSQL(sql);
		
		
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion,int newVersion){
		
	}
	public void InsertarSeccion(SQLiteDatabase db,String CodigoSec,String NomSec,String Ubicacion){
		
	//String s="INSERT INTO secciones(Cod_Seccion,NombreSeccion,Ubicacion) VALUES('"+CodigoSec+"','"+NomSec+"','"+Ubicacion+"')";
		SQLiteStatement pst= db.compileStatement("INSERT INTO secciones(Cod_Seccion,NombreSeccion,Ubicacion) VALUES (?,?,?)");
		pst.bindString(1,CodigoSec);
		pst.bindString(2,NomSec);
		pst.bindString(3,Ubicacion);
		pst.execute();
	
	}
	
}
