package com.example.a1893713.second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {
String name,pass;
TextView txt_nm,txt_ps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent i = getIntent();
      name =  i.getStringExtra("un");
        i.getStringExtra("ps");



        txt_nm = findViewById(R.id.txtname);
        txt_ps = findViewById(R.id.txtpass);

        txt_nm.setText(name);
        txt_ps.setText(pass);
    }
}
