package com.example.test2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnConfirma;
    private EditText txtLogin, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Pega e salva o id do botão para adicionar o evento de click */
        btnConfirma = findViewById(R.id.buttonConfirma);

        txtLogin = findViewById(R.id.txtLogin);
        txtSenha = findViewById(R.id.txtSenha);

        /* Add o evento de click no botão Confirmar */
        btnConfirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* Chama o método de login */
                Entrar();

            }
        });

    }


    private void Entrar() {
        try
        {
            String usuario = txtLogin.getText().toString().trim();
            String senha = txtSenha.getText().toString().trim();

            /* Verifica se login ou senha é vazio */
            if(TextUtils.isEmpty(usuario) || TextUtils.isEmpty(senha)){
                Toast.makeText(this, "Preencha o Login e a Senha", Toast.LENGTH_LONG).show();
                return;
            }

            /* Se login e senha for opet deixa entrar */
            if(usuario.equals("opet") && senha.equals("opet") ){

                Intent myIntent = new Intent(MainActivity.this, tela2.class);
                MainActivity.this.startActivity(myIntent);
                finish();

            }else{
                /* Da aviso de Login invalido */
                Toast.makeText(this, "Login inválido", Toast.LENGTH_LONG).show();
            }

        } catch (Exception e) {

        }
    }


}