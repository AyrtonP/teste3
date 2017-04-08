package br.com.toolbox.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewSimplesActivity extends AppCompatActivity {
    ListView lst_view_simples;
    List<String> lstFrutas = new ArrayList<>();
    Context context;
    ArrayAdapter<String> adapter;
    SearchView.OnQueryTextListener listennerBusca = new SearchView.OnQueryTextListener() {
        @Override
        // é executado quando termina a busca e clica em pesquisar
        public boolean onQueryTextSubmit(String query) {
            return false;
        }

        @Override
        // é executado a cada letra clicada
        public boolean onQueryTextChange(String newText) {
            Log.d("OnQueryTextListener",newText);

            // filtragem do adapter
            adapter.getFilter().filter(newText);

            return false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_simples);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        context = this;
        lst_view_simples = (ListView) findViewById(R.id.lst_view_simples);

        preencherAdapter();
    }

    private void preencherAdapter() {

        lstFrutas.add("banana");
        lstFrutas.add("uva");
        lstFrutas.add("melancia");
        lstFrutas.add("morango");
        lstFrutas.add("pêssego");
        lstFrutas.add("alalla");

        adapter = new ArrayAdapter<String>(
                context,android.R.layout.simple_list_item_1,lstFrutas

        );
        lst_view_simples.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_lista,menu);

        //id do icone
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setQueryHint("Pesquisar..");
        searchView.setOnQueryTextListener(



        );
        return true;
    }
}
