package com.example.exercisesatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataKontak extends AppCompatActivity {

    TextView eNama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kontak);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        eNama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        switch (nama) {
            case "Fadia":
                eNama.setText("Fadia");
                tvnomor.setText("081123457768");
                break;
            case "Rani":
                eNama.setText("Rani");
                tvnomor.setText("081123457768");
                break;
            case "Arya":
                eNama.setText("Arya");
                tvnomor.setText("081123457768");
                break;
            case "Vadillah":
                eNama.setText("Vadillah");
                tvnomor.setText("081123457768");
                break;
            case "Rayka":
                eNama.setText("Rayka");
                tvnomor.setText("081123457768");
                break;
            case "Agustasya":
                eNama.setText("Agustasya");
                tvnomor.setText("081123457768");
                break;
            case "Rama":
                eNama.setText("Rama");
                tvnomor.setText("081123457768");
                break;
            case "Ravictor":
                eNama.setText("Ravictor");
                tvnomor.setText("081123457768");
                break;
            case "Arga":
                eNama.setText("Arga");
                tvnomor.setText("081123457768");
                break;
            case "Aprillian":
                eNama.setText("Aprilian");
                tvnomor.setText("081123457768");
                break;

        }
    }
}
