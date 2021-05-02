package com.example.exercisesatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataKontak extends AppCompatActivity {

    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kontak);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama) {
            case "Fadia":
                tvnama.setText("Fadia");
                tvnomor.setText("081123457768");
                break;
            case "Rani":
                tvnama.setText("Rani");
                tvnomor.setText("081123457768");
                break;
            case "Arya":
                tvnama.setText("Arya");
                tvnomor.setText("081123457768");
                break;
            case "Vadillah":
                tvnama.setText("Vadillah");
                tvnomor.setText("081123457768");
                break;
            case "Rayka":
                tvnama.setText("Rayka");
                tvnomor.setText("081123457768");
                break;
            case "Agustasya":
                tvnama.setText("Agustasya");
                tvnomor.setText("081123457768");
                break;
            case "Rama":
                tvnama.setText("Rama");
                tvnomor.setText("081123457768");
                break;
            case "Ravictor":
                tvnama.setText("Ravictor");
                tvnomor.setText("081123457768");
                break;
            case "Arga":
                tvnama.setText("Arga");
                tvnomor.setText("081123457768");
                break;
            case "Aprilian":
                tvnama.setText("Aprilian");
                tvnomor.setText("081123457768");
                break;

        }
    }
}
