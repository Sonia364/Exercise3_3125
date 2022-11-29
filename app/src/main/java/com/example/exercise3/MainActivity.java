package com.example.exercise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch registerLogin = findViewById(R.id.switchRegister);
        registerLogin.setOnClickListener(
            v->{
                if(registerLogin.isChecked()){

                }
            }
        );
    }
}