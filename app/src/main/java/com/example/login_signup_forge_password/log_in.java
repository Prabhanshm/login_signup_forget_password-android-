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

public class log_in extends AppCompatActivity {

    TextView goToRegister;
    TextView goToforget;
    Button button;
    private EditText username,password;


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        username=findViewById(R.id.inputuser);
        password=findViewById(R.id.et_input_pass);
        goToRegister=findViewById(R.id.bt_009);


        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(log_in.this,MainActivity.class);
                startActivity(intent);
//                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
//                    Toast.makeText(log_in.this,"Username / Password Required", Toast.LENGTH_LONG).show();
//                }else{
//                    //proceed to login
//                    login();
//                }
//


            }

//            private void login() {
//                LoginRequest loginRequest = new LoginRequest();
//                loginRequest.setUsername(username.getText().toString());
//                loginRequest.setPassword(password.getText().toString());
//
//                Call<LoginResponse> loginResponseCall = ApiClient.getUserService().userLogin(loginRequest);
//                loginResponseCall.enqueue(new Callback<LoginResponse>() {
//                    @Override
//                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
//
//                        if(response.isSuccessful()){
//                            Toast.makeText(log_in.this,"Login Successful", Toast.LENGTH_LONG).show();
//                            LoginResponse loginResponse = response.body();
//
//                            new Handler().postDelayed(new Runnable() {
//                                @Override
//                                public void run() {
//
//                                    startActivity(new Intent(log_in.this,MainActivity.class).putExtra("data",loginResponse.getUsername()));
//                                }
//                            },700);
//
//                        }else{
//                            Toast.makeText(log_in.this,"Login Failed", Toast.LENGTH_LONG).show();
//
//                        }
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<LoginResponse> call, Throwable t) {
//                        Toast.makeText(log_in.this,"Throwable "+t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
//
//                    }
//                });
//
//
//
//            }
        });


        goToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(log_in.this,register.class);
                startActivity(intent);
            }
        });

        goToforget=findViewById(R.id.forgetlink);
        goToforget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(log_in.this,forget_password.class);
                startActivity(intent);
            }
        });


        ImageView toggle;
        EditText et_input_pass;

        et_input_pass = findViewById(R.id.et_input_pass);
        toggle = findViewById(R.id.ivPasswordToggle);

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







    }


}