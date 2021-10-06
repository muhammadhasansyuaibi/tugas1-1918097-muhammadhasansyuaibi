package com.example.praktikum1_intent_1918097;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    EditText alas, tinggi;
    TextView hasil;
    Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas = (EditText)findViewById(R.id.input_alas);
        tinggi = (EditText)findViewById(R.id.input_tinggi);
        hitung = (Button)findViewById(R.id.btn_hitungluas);
        hasil = (TextView) findViewById(R.id.output_hasilluas);

        final Button hitung = (Button)findViewById(R.id.btn_hitungluas);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String isikanAlas = alas.getText().toString();
                String isikanTinggi = tinggi.getText().toString();
                double alas = Double.parseDouble(isikanAlas);
                double tinggi = Double.parseDouble(isikanTinggi);
                double hsl = LuasSegitiga(alas, tinggi);
                String keluaran = String.valueOf(hsl);
                hasil.setText(keluaran.toString());
            }
        });
    }
    public double LuasSegitiga(double alas, double tinggi) {
        return alas*tinggi/2;
    };
}