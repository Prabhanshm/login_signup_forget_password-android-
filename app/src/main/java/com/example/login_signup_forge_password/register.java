package com.example.login_signup_forge_password;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity {
    TextView goToLogin;
    private EditText inputName,inputEmail,inputPassword,inputAdhar;
    private Button btnRegister;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        inputName = findViewById(R.id.inname);
        inputEmail = findViewById(R.id.inemail);
        inputPassword = findViewById(R.id.inpass);
        inputAdhar = findViewById(R.id.inadhar);
        btnRegister = findViewById(R.id.button);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });





        goToLogin=findViewById(R.id.bt_09);
        goToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register.this,log_in.class);
                startActivity(intent);
            }
        });

        ImageView toggle;
        EditText et_input_pass;

        et_input_pass = findViewById(R.id.et_input_pass10);
        toggle = findViewById(R.id.ivPasswordToggle1);

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_input_pass.getTransformationMethod().getClass().getSimpleName() .equals("PasswordTransformationMethod")) {
                    et_input_pass.setTransformationMethod(new SingleLineTransformationMethod());
                }
                else {
                    et_input_pass.setTransformationMethod(new PasswordTransformationMethod());
                }

                et_input_pass.setSelection(et_input_pass.getText().length());
            }
        });



        ImageView toggle1;
        EditText et_input_pass1;

        et_input_pass1 = findViewById(R.id.et_input_pass);
        toggle1 = findViewById(R.id.ivPasswordToggle);

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_input_pass1.getTransformationMethod().getClass().getSimpleName() .equals("PasswordTransformationMethod")) {
                    et_input_pass1.setTransformationMethod(new SingleLineTransformationMethod());
                }
                else {
                    et_input_pass1.setTransformationMethod(new PasswordTransformationMethod());
                }

                et_input_pass1.setSelection(et_input_pass1.getText().length());
            }
        });

    }





}