package com.example.myapps;

import android.app.ListActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.core.util.ObjectsCompat;

public class SEKOLAH extends ListActivity {
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listPOL = new String[]{"SMAN 1 Pekanbaru","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listPOL));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);

    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("SMAN 1 Pekanbaru")) {
                a = new Intent(this, SMAN1Pekanbaru.class);

            }else if (pilihan.equals("Exit")){
                System.exit(0);
            }
            startActivity(a);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
