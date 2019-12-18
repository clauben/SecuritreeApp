package com.example.securitree_app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

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
                String password = etUsername.getText().toString().trim();

                if(username.isEmpty() || password.isEmpty()){
                    Toast.makeText(Login.this, "Voer gegevens in.", Toast.LENGTH_SHORT).show();
                } else if(username.equals("1") && password.equals("1")){
                    Toast.makeText(Login.this, "Login Gelukt", Toast.LENGTH_SHORT).show();
                    Intent mainIntent = new Intent(Login.this, MainActivity.class);
                    Login.this.startActivity(mainIntent);
                } else {
                    Toast.makeText(Login.this, "Username/Password Ongeldig", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
