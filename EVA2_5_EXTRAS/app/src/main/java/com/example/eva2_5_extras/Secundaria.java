package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        intent = getIntent();
        String sNombre = intent.getStringExtra("NOMBRE");
        String sApellido = intent.getStringExtra("APELLIDO");
        String sCorreo = intent.getStringExtra("CORREO");
        int  sEdad = intent.getIntExtra("EDAD",0);
        int iEstado = intent.getIntExtra("GENERO",0);
        TextView txtVwInfo;
        txtVwInfo = findViewById(R.id.txtVwInfo);
        txtVwInfo.append("Nombre: \n" );
        txtVwInfo.append(sNombre+"\n" );
        txtVwInfo.append("Apellido: \n" );
        txtVwInfo.append(sApellido+"\n" );
        txtVwInfo.append("Edad: \n" );
        txtVwInfo.append(sEdad+"\n" );
        txtVwInfo.append("Correo: \n" );
        txtVwInfo.append(sCorreo+"\n");

        RadioButton rdTemp = findViewById(iEstado);
        txtVwInfo.append("Genero: \n");
        txtVwInfo.append(iEstado+"\n");
    }

    public void onClickSal(View v){
        finish();
    }
}