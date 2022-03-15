package com.example.myapps;

import android.app.ListActivity;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.core.util.ObjectsCompat;


public class RS extends ListActivity {
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[]{"Rumah Sakit Awal Bross", "Rumah Sakit Eka Hospital", "Rumah Sakit Jiwa Tampan", "Rumah sakitTabrani","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);

    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a =null;
            if (pilihan.equals("Rumah Sakit Awal Bross")){

                a = new Intent(this,RSAwalBross.class);

            }else if (pilihan.equals("Rumah Sakit Eka Hospital"))
            {
            }else if (pilihan.equals("Rumah Sakit Jiwa Tampan"))
            {
            }else if (pilihan.equals("Rumah sakitTabrani"))
            {
            }else if (pilihan.equals("Exit")) {
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


