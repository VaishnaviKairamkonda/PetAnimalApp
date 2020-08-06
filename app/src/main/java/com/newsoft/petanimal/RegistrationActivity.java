package com.newsoft.petanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RegistrationActivity extends AppCompatActivity {
Button btnRegister;
EditText etPassword,etcPassword;
ImageView Rdata,Rdata1;
    boolean show=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        btnRegister=findViewById(R.id.btnRegister);
        etcPassword=findViewById(R.id.etcpassword);
        etPassword=findViewById(R.id.etpassword);
        Rdata=findViewById(R.id.RData);
        Rdata1=findViewById(R.id.RData1);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i=new Intent(RegistrationActivity.this,MainActivity.class);
                startActivity(i);
            }});
        Rdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show){
                    Rdata.setBackgroundResource(0);
                    Rdata.setBackgroundResource(R.drawable.ey1);
                    etPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    etPassword.setSelection(etPassword.getText().length());

                    show=false;
                }else{
                    Rdata.setBackgroundResource(0);
                    Rdata.setBackgroundResource(R.drawable.ey2);
                    //etpass1.setInputType(InputType.TYPE_TEXT);
                    etPassword.setInputType(InputType.TYPE_CLASS_TEXT |
                            InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    etPassword.setSelection(etPassword.getText().length());
                    show=true;
                }

            }
        });
        Rdata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(show){
                    Rdata1.setBackgroundResource(0);
                    Rdata1.setBackgroundResource(R.drawable.ey1);
                    etcPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    etcPassword.setSelection(etcPassword.getText().length());

                    show=false;
                }else{
                    Rdata1.setBackgroundResource(0);
                    Rdata1.setBackgroundResource(R.drawable.ey2);
                    //etpass1.setInputType(InputType.TYPE_TEXT);
                    etcPassword.setInputType(InputType.TYPE_CLASS_TEXT |
                            InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    etcPassword.setSelection(etcPassword.getText().length());
                    show=true;
                }

            }
        });

    }
}
