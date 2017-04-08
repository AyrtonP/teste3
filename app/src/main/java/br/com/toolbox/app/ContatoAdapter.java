package br.com.toolbox.app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by 15251365 on 13/03/2017.
 */

public class ContatoAdapter extends ArrayAdapter<Contato>{

    int resource;

    public ContatoAdapter(Context context, int resource, List<Contato> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // inflagem de layout
        View v = convertView;
        if(v == null){
            v = LayoutInflater.from(getContext())
                    .inflate(resource /*resource é o layout do item da lista*/,null);
        }
        Contato item = getItem(position);// pegar o item que esta sendo carregado

        if(item != null){
            ImageView img_contato = (ImageView) v.findViewById(R.id.imag_view_contatos);
            TextView nome_contato =(TextView) v.findViewById(R.id.nome_item_contato);
            TextView status_contato = (TextView) v.findViewById(R.id.status_item_contato);

            //img_contato.setImageResource(item.getImagem());
            nome_contato.setText(item.getNome());
            status_contato.setText(item.getStatus());
            Picasso.with(getContext())
                    .load(item.getImagem()) // pega a imagem e carrega ela na image view
                    .transform(new CircleTransform()) // classe do android para deixar a imagem redonda
                    .into(img_contato); // a img view q vai carregar a imagem
        }
        return v;
    }
}
