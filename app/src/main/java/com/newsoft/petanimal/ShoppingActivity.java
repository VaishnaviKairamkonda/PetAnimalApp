package com.newsoft.petanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShoppingActivity extends AppCompatActivity {
Button btnCats,btnDogs,btnBirds,btnOthers;
    boolean iscolor = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
//        btnCats=(Button)findViewById(R.id.btnCats);
//        btnDogs=(Button)findViewById(R.id.btnDogs);
//        btnBirds=(Button)findViewById(R.id.btnBirds);
//        btnOthers=(Button)findViewById(R.id.btnOthers);


    }
}
