package com.example.entregasolidaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroComercioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_comercio);
    }

    public void btCadastrar (View v){
        Intent intent = new Intent(this, ComerciosActivity.class) ;
        startActivity(intent);

        Toast.makeText(this, R.string.cadComOk, Toast.LENGTH_SHORT).show();
        finish();
    }

    //Botão para voltar para activity Listar Comércios
    public void CancelClick (View v){
        Intent intent = new Intent(this, ComerciosActivity.class) ;
        startActivity(intent);
    }

}
