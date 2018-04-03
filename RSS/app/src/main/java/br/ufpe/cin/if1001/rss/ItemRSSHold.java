package br.ufpe.cin.if1001.rss;

import android.view.View;
import android.widget.TextView;

/**
 * Created by mathe on 02/04/2018.
 */

public class ItemRSSHold {
    TextView titulo;
    TextView data;

    public ItemRSSHold(View row){
        this.titulo = (TextView) row.findViewById(R.id.item_titulo);
        this.data = (TextView) row.findViewById(R.id.item_data);
    }
}
