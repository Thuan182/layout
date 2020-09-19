package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtuser,edtpassword;
    Button btdangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        btdangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    private  void anhxa(){
        edtuser = (EditText)findViewById(R.id.editTextEmailAddress);
        edtpassword =(EditText)findViewById(R.id.editTextPassword);
        btdangnhap=(Button)findViewById(R.id.buttondangnhap);
    }
}