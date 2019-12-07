package com.dtorres.evaluacionapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dtorres.evaluacionapp.R;

public class MainActivity extends AppCompatActivity {

    private EditText correoInput;
    private EditText contraseñaInput;
    private Button registroButton;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correoInput = findViewById(R.id.main_input_correo);
        contraseñaInput = findViewById(R.id.main_input_contraseña);
        loginButton = findViewById(R.id.main_button_ingresar);
        registroButton = findViewById(R.id.main_button_registro);
        registroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callRegister();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        loadLastUsername();

        verifyLoginStatus();

    }

    private void callRegister(){

        Intent intent = new Intent(this, RegisterUserActivity.class);
        startActivity(intent);

    }

    private void login(){

    }

    private void loadLastUsername(){

    }

    private void verifyLoginStatus(){

    }
}
