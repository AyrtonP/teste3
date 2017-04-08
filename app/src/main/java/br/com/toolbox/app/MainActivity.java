package br.com.toolbox.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void AbrirTelaCalendario(View view) {
        Intent intent = new Intent(this,CalendarioActivity.class);
        startActivity(intent);
    }
    public void AbrirTelaSpinner(View view) {
        Intent intent = new Intent(this,SpinnerActivity.class);
        startActivity(intent);
    }
    public void AbrirListViewCustomizada(View view) {
        Intent intent = new Intent(this,ListViewCustomizadaActivity.class);
        startActivity(intent);
    }

    public void AbrirListViewSimples(View view) {
        Intent intent = new Intent(this,ListViewSimplesActivity.class);
        startActivity(intent);
    }
}
