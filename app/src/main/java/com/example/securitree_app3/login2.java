package com.example.securitree_app3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

class Login2 extends AppCompatActivity {

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
                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.0.2.2/php login/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                RequestInterface request = retrofit.create(RequestInterface.class);
                Call<JsonResponse> call = request.login(username,password);
                call.enqueue(new Callback<JsonResponse>() {
                    @Override
                    public void onResponse(Call<JsonResponse> call, Response<JsonResponse> response) {
                        if(response.code()==200){
                            JsonResponse jsonResponse = response.body();
                            Toast.makeText(getApplicationContext(),jsonResponse.getResponse().toString(),Toast.LENGTH_SHORT).show();

                            //Als de verbinding geslaagd is word de app geopend
                            Intent mainIntent = new Intent(Login2.this, MainActivity.class);
                            Login2.this.startActivity(mainIntent);
                        }
                        else {
                            Toast.makeText(getApplicationContext(),String.valueOf(response.code()),Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onFailure(Call<JsonResponse> call, Throwable t) {
                        Toast.makeText(Login2.this, "Kan geen verbinding maken.", Toast.LENGTH_SHORT).show();

                    }
                });
                /*
                if(username.isEmpty() || password.isEmpty()){
                    Toast.makeText(Login.this, "Voer gegevens in.", Toast.LENGTH_SHORT).show();
                } else if(username.equals("1") && password.equals("1")){
                    Toast.makeText(Login.this, "Login Gelukt", Toast.LENGTH_SHORT).show();
                    Intent mainIntent = new Intent(Login.this, MainActivity.class);
                    Login.this.startActivity(mainIntent);
                } else {
                    Toast.makeText(Login.this, "Username/Password Ongeldig", Toast.LENGTH_SHORT).show();
                }
                 */
            }
        });
    }
}