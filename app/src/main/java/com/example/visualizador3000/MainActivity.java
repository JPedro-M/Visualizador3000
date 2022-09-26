package com.example.visualizador3000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgFoto;
    Button btFoto1, btFoto2;
    TextView txtInformacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgFoto = (ImageView) findViewById(R.id.imgFoto);
        btFoto1 = (Button) findViewById(R.id.btFoto1);
        btFoto2 = (Button) findViewById(R.id.btFoto2);
        txtInformacao = (TextView) findViewById(R.id.txtInformacao);

        btFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgFoto.setImageResource(R.drawable.vcfoiavisado);
                txtInformacao.setText("Você foi avisado");
            }
        });

        btFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgFoto.setImageResource(R.drawable.fuiavisado);
                txtInformacao.setText("Fui avisado?");
            }
        });
    }
}