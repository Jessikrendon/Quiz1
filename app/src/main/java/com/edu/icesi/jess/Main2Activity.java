package com.edu.icesi.jess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public TextView tvSaludo;
    public TextView tvAviso;
    public Button btnGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


btnGoBack = findViewById(R.id.btn_GoBack);

btnGoBack.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i2);


    }
});

    }
}
