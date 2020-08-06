package com.newsoft.petanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
Button btnLogin;
    ImageView imgPassword;
    EditText etPassword;
    boolean show=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin=findViewById(R.id.btnLogin);
        imgPassword=findViewById(R.id.checkData);
        etPassword=findViewById(R.id.password);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(i);
            }});
        imgPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show){
                    imgPassword.setBackgroundResource(0);
                    imgPassword.setBackgroundResource(R.drawable.ey1);
                    etPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    etPassword.setSelection(etPassword.getText().length());

                    show=false;
                }else{
                    imgPassword.setBackgroundResource(0);
                    imgPassword.setBackgroundResource(R.drawable.ey2);
                    //etpass1.setInputType(InputType.TYPE_TEXT);
                    etPassword.setInputType(InputType.TYPE_CLASS_TEXT |
                            InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    etPassword.setSelection(etPassword.getText().length());
                    show=true;
                }

            }
        });
    }
}
