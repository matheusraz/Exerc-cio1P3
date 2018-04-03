package br.ufpe.cin.if1001.rss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by mathe on 02/04/2018.
 */

public class CustomAdpt extends BaseAdapter {

    Context contexto;
    List<ItemRSS> itens;

    public CustomAdpt(Context contexto, List<ItemRSS> itens) {
        this.contexto = contexto;
        this.itens = itens;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int i) {
        return itens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v;
        ItemRSSHold holder;

        if (view == null) {
            v = LayoutInflater.from(contexto).inflate(R.layout.itemlista, viewGroup, false);
            holder = new ItemRSSHold(v);
            v.setTag(holder);
        } else {
            v = view;
            holder = (ItemRSSHold) v.getTag();
        }

        holder.titulo.setText(itens.get(i).getTitle());
        holder.data.setText(itens.get(i).getPubDate());

        return v;
    }
}
