package com.example.securitree_app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Lgn extends AppCompatActivity {

    EditText etUsername;
    EditText etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.edittext_username);
        etPassword = (EditText) findViewById(R.id.edittext_password);
        btnLogin = (Button) findViewById(R.id.button_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if(username.isEmpty() || password.isEmpty()){
                    Toast.makeText(Lgn.this, "Voer gegevens in.", Toast.LENGTH_SHORT).show();
                } else if( username.equals("noureddine") && password.equals("Welkom#1") || username.equals("claudio") && password.equals("Welkom#1") || username.equals("steven") && password.equals("Welkom#1") || username.equals("tom") && password.equals("Welkom#1")){
                    Toast.makeText(Lgn.this, "Login Gelukt", Toast.LENGTH_SHORT).show();
                    Intent mainIntent = new Intent(Lgn.this, DashboardNew.class);
                    Lgn.this.startActivity(mainIntent);
                } else {
                    Toast.makeText(Lgn.this, "Username/Password Ongeldig", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}