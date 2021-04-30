package com.example.franc.toastejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void miMetodo(View v){
        Toast.makeText(MainActivity.this, "Este es un Toast", Toast.LENGTH_LONG).show();
    }
}
