package com.example.geniuspi;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	//atributos que representam elementos da tela
	private Button btVermelho;
	private Button btAzul;
	private Button btVerde;
	private Button btStart;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//comando para deixar a aplicação apenas na vertical
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		//busca por referencia aos componentes da tela
		btVermelho = (Button) findViewById(R.id.btvermelho);
		btAzul = (Button) findViewById(R.id.btazul);
		btVerde = (Button) findViewById(R.id.btverde);
		btStart = (Button) findViewById(R.id.btstart);
		
		//definição do evento ao click do botao start
		btStart.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
			        HttpClient client = new DefaultHttpClient();  
			        String getURL = "http://192.168.1.101:8080/GeniusPiWeb/start";
			        HttpGet get = new HttpGet(getURL);
			        HttpResponse responseGet = client.execute(get);  
			        HttpEntity resEntityGet = responseGet.getEntity();  
			        if (resEntityGet != null) {  
			                    //do something with the response
			                    Log.i("GET RESPONSE",EntityUtils.toString(resEntityGet));
			                }
			} catch (Exception e) {
			    e.printStackTrace();
			}
			}
		});
		
		//definição do evento ao click do botao vermelho
		btVermelho.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				
				try {
			        HttpClient client = new DefaultHttpClient();  
			        String getURL = "http://192.168.1.101:8080/GeniusPiWeb/red";
			        HttpGet get = new HttpGet(getURL);
			        HttpResponse responseGet = client.execute(get);  
			        HttpEntity resEntityGet = responseGet.getEntity();  
			        if (resEntityGet != null) {  
			                    //do something with the response
			                    Log.i("GET RESPONSE",EntityUtils.toString(resEntityGet));
			                }
			} catch (Exception e) {
			    e.printStackTrace();
			}
			}
		});
		
		//definição do evento ao click do botao azul
		btAzul.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				
				try {
			        HttpClient client = new DefaultHttpClient();  
			        String getURL = "http://192.168.1.101:8080/GeniusPiWeb/blue";
			        HttpGet get = new HttpGet(getURL);
			        HttpResponse responseGet = client.execute(get);  
			        HttpEntity resEntityGet = responseGet.getEntity();  
			        if (resEntityGet != null) {  
			                    //do something with the response
			                    Log.i("GET RESPONSE",EntityUtils.toString(resEntityGet));
			                }
			} catch (Exception e) {
			    e.printStackTrace();
			}
				
			}
		});
		
		//definição do evento ao click do botao verde
		btVerde.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				
				try {
			        HttpClient client = new DefaultHttpClient();  
			        String getURL = "http://192.168.1.101:8080/GeniusPiWeb/green";
			        HttpGet get = new HttpGet(getURL);
			        HttpResponse responseGet = client.execute(get);  
			        HttpEntity resEntityGet = responseGet.getEntity();  
			        if (resEntityGet != null) {  
			                    //do something with the response
			                    Log.i("GET RESPONSE",EntityUtils.toString(resEntityGet));
			                }
			} catch (Exception e) {
			    e.printStackTrace();
			}
				
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
