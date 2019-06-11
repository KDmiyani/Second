package com.example.a1893713.second;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_uname,edt_pass;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_uname = findViewById(R.id.txtuser);
        edt_pass = findViewById(R.id.txtpass);
        btn = findViewById(R.id.btnpress);


      final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.setMessage(R.string.alert);

             alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {


                     String uname,pass;

                     uname = edt_uname.getText().toString();
                     pass = edt_pass.getText().toString();

                     Intent i = new Intent(MainActivity.this,dashboard.class);
                     i.putExtra("un",uname);
                     i.putExtra("ps",pass);
                     startActivity(i);

                     Toast.makeText(getApplicationContext(),uname+"Thanx",Toast.LENGTH_LONG).show();


                     


                 }
             });


                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"keval bhai Kd", Toast.LENGTH_LONG).show();
                    }
                });

                alertDialog.show();



            }
        });





    }
}
