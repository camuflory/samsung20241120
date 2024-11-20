package com.norameyer.samsung20241118;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button bForgot, bCreateAcc;
    private String username = "Qwerty", password = "12345678";
    private EditText edUsername, edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bForgot = findViewById(R.id.bForgot);
        bCreateAcc = findViewById(R.id.bCreateAcc);
        bForgot.setTextColor(Color.GRAY);
        bCreateAcc.setTextColor(Color.GRAY);
        edUsername = findViewById(R.id.edUsername);
        edPassword = findViewById(R.id.edPassword);
    }

    public void onSignIn(View view) {
        if (password.isEmpty() || username.isEmpty()) {
            password = edPassword.getText().toString();
            username = edUsername.getText().toString();
            Toast.makeText(this, "successful signing in!", Toast.LENGTH_SHORT).show();
        }
        else if (edUsername.getText().toString().equals(username) &&
                edPassword.getText().toString().equals(password)) {
            password = edPassword.getText().toString();
            username = edUsername.getText().toString();
            Toast.makeText(this, "successful signing in!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "wrong password or username", Toast.LENGTH_SHORT).show();
        }
    }

    public void onForgot(View view) {
        password = "";
        edPassword.setText("");
        Toast.makeText(this, "enter new password", Toast.LENGTH_SHORT).show();
    }

    public void onCreateAcc(View view) {
        password = "";
        username = "";
        edPassword.setText("");
        edUsername.setText("");
        Toast.makeText(this, "enter new password and username", Toast.LENGTH_SHORT).show();
    }
}