package br.com.toolbox.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewCustomizadaActivity extends AppCompatActivity {
    // TAG do XML, oq aparece na tela
    ListView list_view_contatos;
    //onde vai ter as informações que serão jogadas na tela
    List<Contato> lstContatos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_customizada);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        list_view_contatos = (ListView) findViewById(R.id.list_view_contatos);

        //Preencher contatos na lista
        lstContatos.add(new Contato("Chaves","Foi sem querer, querendo", R.drawable.ft_chaves));
        lstContatos.add(new Contato("Chiquinha","vou contar p meu pai",R.drawable.ft_chiquinha));
        lstContatos.add(new Contato("Dn Florinda","n se misture com essa gentalha",R.drawable.ft_florinda));
        lstContatos.add(new Contato("Prof Girafales","ta ta ta",R.drawable.ft_girafales));
        lstContatos.add(new Contato("Sr. Madruga","ja chegou o disco voador ? ",R.drawable.ft_madruga));
        lstContatos.add(new Contato("Quico","vc n vai com a minha cara?",R.drawable.ft_quico));


        // montar adapter customizado
        ContatoAdapter adapter = new ContatoAdapter(this,R.layout.list_view_item_contatos,lstContatos);

        list_view_contatos.setAdapter(adapter);
    }

}
