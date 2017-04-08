package br.com.toolbox.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spn_cidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spn_cidades = (Spinner) findViewById(R.id.spn_cidades);

        //Lista das cidade
        List<String> lstcidades= new ArrayList<>();
        lstcidades.add("Osasco");
        lstcidades.add("Barueri");
        lstcidades.add("Itapevi");
        lstcidades.add("Jandira");
        lstcidades.add("lalala");

        // criar o adapter  para o spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lstcidades);
        // quando clica no spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Definindo o adapter no spinner: HEY SPINNER USA ESTE ADAPTER
        spn_cidades.setAdapter(adapter);



    }

}
