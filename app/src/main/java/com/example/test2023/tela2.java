package com.example.test2023;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public class tela2 extends AppCompatActivity {

    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2);

        ConfigurarBotaoVoltar();

    }

    public void ConfigurarBotaoVoltar() {
        try {
            if (getSupportActionBar() != null) {
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            }

        } catch (Exception ex) {

        }
    }

    @Override
    public void onBackPressed() {
        try {
            Intent myIntent = new Intent(tela2.this, MainActivity.class);
            tela2.this.startActivity(myIntent);
            finish();

        } catch (Exception e) {

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        try
        {
            switch (item.getItemId())
            {
                default:
                    Intent myIntent = new Intent(tela2.this, MainActivity.class);
                    tela2.this.startActivity(myIntent);
                    finish();
            }
        } catch (Exception ex) {

        }
        return true;
    }





}