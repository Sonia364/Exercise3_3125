package com.example.exercise3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ViewGroup root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        root = findViewById(R.id.root);

        Switch registerLogin = findViewById(R.id.switchRegister);
        TextView mainLabel = findViewById(R.id.loginRegisterText);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        EditText confirmPassword = findViewById(R.id.confirmPassword);
        EditText email = findViewById(R.id.email);
        Button loginBtn = findViewById(R.id.loginBtn);
        Button registerBtn = findViewById(R.id.registerBtn);

        registerLogin.setOnClickListener(
            v->{
                if(registerLogin.isChecked()){
                    confirmPassword.setVisibility(View.VISIBLE);
                    email.setVisibility(View.VISIBLE);
                    mainLabel.setText("Register");
                    registerBtn.setVisibility(View.VISIBLE);
                    loginBtn.setVisibility(View.INVISIBLE);
                }
                else{
                    confirmPassword.setVisibility(View.INVISIBLE);
                    email.setVisibility(View.INVISIBLE);
                    mainLabel.setText("Login");
                    registerBtn.setVisibility(View.INVISIBLE);
                    loginBtn.setVisibility(View.VISIBLE);
                }
            }
        );

        /** Login Functionality */

        loginBtn.setOnClickListener(
                v->{

                    String usernameValue = username.getText().toString();
                    String passwordValue = password.getText().toString();
                    if(usernameValue.isEmpty() || passwordValue.isEmpty()){
                        Toast.makeText(this, "Please fill all the fields!", Toast.LENGTH_SHORT).show();
//                        Snackbar.make(root, "Please fill all the fields!", Snackbar.LENGTH_SHORT)
//                                .setAction()

                    }else{
                        if(usernameValue.equals("test") && passwordValue.equals("test")){
                            Toast.makeText(this, "You are successfully logged in!", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(this, "Username/Password is incorrect!", Toast.LENGTH_SHORT).show();
                        }

                    }

                }
        );

        /** Register Functionality */

        registerBtn.setOnClickListener(
                v->{
                    String usernameValue = username.getText().toString();
                    String passwordValue = password.getText().toString();
                    String confirmPasswordValue = confirmPassword.getText().toString();
                    String emailValue = email.getText().toString();
                    if(usernameValue.isEmpty() || passwordValue.isEmpty() || confirmPasswordValue.isEmpty() || emailValue.isEmpty()){
                        Toast.makeText(this, "Please fill all the fields!", Toast.LENGTH_SHORT).show();
//                        Snackbar.make(root, "Please fill all the fields!", Snackbar.LENGTH_SHORT)
//                                .setAction()

                    }else{
                        if(passwordValue.equals(confirmPasswordValue) == false){
                            Toast.makeText(this, "Confirm password should match!", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(this, "You are successfully registered!", Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );

    }
}