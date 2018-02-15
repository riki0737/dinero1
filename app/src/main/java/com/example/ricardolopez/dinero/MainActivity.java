package com.example.ricardolopez.dinero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button apar = (Button) findViewById(R.id.aP);
        final Button epar = (Button) findViewById(R.id.eP);
        final Button listpar = (Button) findViewById(R.id.lpar);

        final EditText textmes = (EditText) findViewById(R.id.idmes);
        final EditText textdia = (EditText) findViewById(R.id.iddia);
        final EditText textTempo = (EditText) findViewById(R.id.tempo);
        final EditText textFinal = (EditText) findViewById(R.id.lparts);

        final Spinner barra = (Spinner) findViewById(R.id.spinner);
        String [] categor = {"Pre-benajín","Benajín","Alevín","Infantil","Cadete","Juvenil","4a. Catalana","3a. Catalana","2a. Catalana","1a Catalana"};
        barra.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,categor));

        final arbitrajes a = new arbitrajes();

        apar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome, tempora;
                int me, di;
                nome = barra.getAccessibilityClassName().toString();
                tempora = textTempo.getText().toString();
                me = Integer.valueOf(textmes.getText().toString());
                di = Integer.valueOf(textdia.getText().toString());
                a.añadirpartido(nome,tempora,me,di);
            }
        });

        epar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome, tempora;
                int me, di;
                nome = barra.getAccessibilityClassName().toString();
                tempora = textTempo.getText().toString();
                me = Integer.valueOf(textmes.getText().toString());
                di = Integer.valueOf(textdia.getText().toString());
                a.eliminarpartido(nome,tempora,me,di);
            }
        });

        listpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<partido> partidosL = new ArrayList<partido>();
                partidosL = a.mostrarpartidos();
                for(int i = 0; i < partidosL.size();++i)
                    textFinal.setText(partidosL.get(i).getcategoria().getTipo());
            }
        });
    }
}
