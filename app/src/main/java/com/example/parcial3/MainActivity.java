package com.example.parcial3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void siguiente(View view) {
        usuario = findViewById(R.id.editTextUser);
        contrasena = findViewById(R.id.editTextPassword);
        String user = usuario.getText().toString();
        String password = contrasena.getText().toString();
        if (user.equals("Parcial3") && password.equals("1234")) {
            Intent siguiente = new Intent(this, Next.class);
            startActivity(siguiente);
        } else {
            Toast.makeText(this, "Usuario no valido", Toast.LENGTH_LONG).show();
        }
    }
}