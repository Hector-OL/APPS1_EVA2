package com.example.eva2_5_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    EditText edtTxtNombre,edtTxtApellido,edtTxtCorreo,edtTxtEdad;
    RadioButton rdBtnF,rdBtnM,rdBtnO;
    RadioGroup rdGrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this,Secundaria.class);
    }

    @Override
    protected void onStart() {
        super.onStart();
        edtTxtNombre = findViewById(R.id.edtTxtNombre);
        edtTxtApellido = findViewById(R.id.edtTxtApellido);
        edtTxtCorreo = findViewById(R.id.edtTxtCorreo);
        edtTxtEdad = findViewById(R.id.edtTxtEdad);
        rdBtnF = findViewById(R.id.rdBtnF);
        rdBtnM = findViewById(R.id.rdBtnM);
        rdBtnO = findViewById(R.id.rdBtnO);
        rdGrp = findViewById(R.id.rdGrp1);
    }

    public void onClick(View v){
        intent.putExtra("NOMBRE",edtTxtNombre.getText().toString());
        intent.putExtra("APELLIDO",edtTxtApellido.getText().toString());
        intent.putExtra("CORREO",edtTxtCorreo.getText().toString());
        int dEdad = 0;
        dEdad = parseInt(edtTxtEdad.getText().toString());
        intent.putExtra("EDAD",dEdad);
        intent.putExtra("GENERO",rdGrp.getCheckedRadioButtonId());
        startActivity(intent);
    }
}