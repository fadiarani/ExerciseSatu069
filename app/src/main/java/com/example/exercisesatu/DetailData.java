package com.example.exercisesatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class DetailData extends AppCompatActivity {

    Button btnDelete, btnEdit ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data);

        btnDelete = findViewById(R.id.btndel);
        btnEdit = findViewById(R.id.btned);



    }

}