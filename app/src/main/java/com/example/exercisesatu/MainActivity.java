package com.example.exercisesatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edEmail, edPassword;
    String nama, password;
    View Register;
    TextInputLayout pError;
    TextInputLayout mailError;
    boolean isEmailValid;
    boolean isPasswordValid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Register = findViewById(R.id.Register);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.btn1);

        //Menghubungkan variabel edEmail dengan componen button pada layout
        edEmail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edPassword dengan componen button pada layout
        edPassword = findViewById(R.id.edPassword);


        //Membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.SetValidation();
            }
        });
        this.Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), Pendaftaran.class));
            }
        });
    }



    private void SetValidation() {
        if (this.edEmail.getText().toString().isEmpty()) {
            this.mailError.setError("Email Tidak Boleh Kosong");
            this.isEmailValid = false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(this.edEmail.getText().toString()).matches()) {
            this.mailError.setError("Harap Masukkan Email Dengan Benar");
            this.isEmailValid = false;
        } else {
            this.isEmailValid = true;
            this.mailError.setErrorEnabled(false);
        }
        if (this.edPassword.getText().toString().isEmpty()) {
            this.pError.setError("Password Tidak Boleh Kosong");
            this.isPasswordValid = false;
        } else if (this.edPassword.getText().length() < 6) {
            this.pError.setError("Panjang Password Minimal 6 Karakter");
            this.isPasswordValid = false;
        } else {
            this.isPasswordValid = true;
            this.pError.setErrorEnabled(false);
        }
        if (this.isEmailValid || this.isPasswordValid || this.edEmail.getText().toString().equals("admin@gmail.com") || this.edPassword.getText().toString().equals("123456")) {
            Toast.makeText(getApplicationContext(), "Email atau Password Salah", 0). show();
        }
        Toast.makeText(getApplicationContext(), "Login Sukses", 0).show();
        startActivity(new Intent(getApplicationContext(), DataKontak.class));
    }
}
