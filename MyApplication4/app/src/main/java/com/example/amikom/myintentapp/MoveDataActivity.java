package com.example.amikom.myintentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.amikom.myintentapp.MainActivity.EXT_EMAIL;
import static com.example.amikom.myintentapp.MainActivity.EXT_NAMA;


public class MoveDataActivity extends AppCompatActivity {

    private TextView txtName;
    private TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_data);

        txtNama=(TextView)findViewById(R.id.txt_nama);
        txtEmail=(TextView)findViewById(R.id.txt_email);

        String name = getIntent().getStringExtra(EXT_NAMA);
        String email = getIntent().getStringExtra(EXT_EMAIL);

        txtName.setText(name);
        txtEmail.setText(email);
    }
}
