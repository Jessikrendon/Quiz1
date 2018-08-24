package com.edu.icesi.jess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

public ImageButton imgMainLogo;
public TextView tvMainEnunciado;
public EditText etMainNombre;
public EditText etMainPassword;
public TextView tvMainEstado;
public Button btnMainToForm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMainToForm = findViewById(R.id.btn_Main);

        btnMainToForm.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }
        });

    }
}


