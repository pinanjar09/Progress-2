package com.helloworld.ridwan.myapplication;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static Object ma;
    ListView listView;
    Intent intent;
    String[] Perusahaan = {"Latar Belakang","Visi & Misi","Pegawai","Produk"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listyar);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Perusahaan);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {
            Intent intent = new Intent(getApplicationContext(), MainLatar.class);
            intent.putExtra("Position", position);
            intent.putExtra("title", "Sejarah Perusahaan");
            intent.putExtra("gambar", R.drawable.a);
            intent.putExtra("detail", " Latar Belakang Perusahaan  ");
            startActivity(intent);
        }
        if (position == 1) {
            Intent intent = new Intent(getApplicationContext(), MainMisiVisi.class);

            startActivity(intent);
        }
        if (position == 2) {
            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);

            startActivity(intent);
        }
        if (position == 3) {
            Intent intent = new Intent(getApplicationContext(), MainLatar.class);

            startActivity(intent);
        }
   }
}
