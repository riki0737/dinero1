package com.example.ricardolopez.dinero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    final Button apar = (Button) findViewById(R.id.aP);
    final Button epar = (Button) findViewById(R.id.eP);
    final Button listpar = (Button) findViewById(R.id.lpar);

    final EditText textmes = (EditText) findViewById(R.id.idmes);
    final EditText textdia = (EditText) findViewById(R.id.iddia);
    final EditText textTempo = (EditText) findViewById(R.id.tempo);
    final EditText textFinal = (EditText) findViewById(R.id.lparts);

    final Spinner barra = (Spinner) findViewById(R.id.spinner);
}
