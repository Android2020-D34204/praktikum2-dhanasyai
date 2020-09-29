package com.example.kalkulatordhana;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText bil1, bil2, operasi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bil1 = findViewById(R.id.bilangan1);
        bil2 = findViewById(R.id.bilangan2);
        operasi = findViewById(R.id.operator);
        hasil = findViewById(R.id.hasilOperasi);
        hitung = findViewById(R.id.eksekusi);


        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bilangan1 = Integer.parseInt(bil1.getText().toString());
                int bilangan2 = Integer.parseInt(bil2.getText().toString());

                String eksekusiBilangan = operasi.getText().toString();

                if (eksekusiBilangan.equals("+")){
                    int hasilnya = bilangan1 + bilangan2;
                    hasil.setText(String.valueOf(hasilnya));

                }else if (eksekusiBilangan.equals("-")){
                    int hasilnya2 = bilangan1 - bilangan2;
                    hasil.setText(String.valueOf(hasilnya2));

                }else if (eksekusiBilangan.equals("/")){
                    int hasilnya3 = bilangan1 / bilangan2;
                    hasil.setText(String.valueOf(hasilnya3));

                }else if (eksekusiBilangan.equals("*")){
                    int hasilnya4 = bilangan1 * bilangan2;
                    hasil.setText(String.valueOf(hasilnya4));

                }else{
                    hasil.setText("OPERASI ARITMATIK TIDAK SESUAI");
                }

            }
        });

    }
}