package com.example.amikom.myintentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String EXT_NAMA = "extra_nama";
    private static final String EXT_EMAIL = "extra_email";

    private Button btnMove;
    private Button btnMoveWithData;
    private Button btnMoveWithObject;
    private Button btnDialNumber;
    private Button btnResult;

    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = (Button)findViewById(R.id.tombol1);
        btnMoveWithData = (Button) findViewById(R.id.tombol2);
        btnMoveWithObject= (Button) findViewById(R.id.tombol3);
        btnDialNumber = (Button) findViewById(R.id.tombol4);
        btnResult = (Button) findViewById(R.id.tombol5);

        txtResult = (TextView) findViewById(R.id.textHasil);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(MainActivity.this, MoveActivity.class);
                startActivity(in);
            }
        });

        btnMoveWithData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, MoveDataActivity.class);
                in.putExtra(EXT_NAMA, "Harish");
                in.putExtra(EXT_EMAIL, "yaya@gmail.com");
                startActivity(in);
            }
        });
        }
    }
}
