package com.tl.login;

import android.annotation.Nullable;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class loginscreen extends AppCompatActivity {
    private Button btnlogin;
    @Override
    protected void onCreate(Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        btnlogin= (Button) findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intenr intent =new Intent(loginscreen.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}