package com.helloworld.ridwan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMisiVisi extends AppCompatActivity {
    ImageView imgv;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_misi_visi);

        String txtTitle = getIntent().getStringExtra("title"); // panggil
        this.setTitle(txtTitle);
        tv1 = (TextView) findViewById(R.id.tv);
        Intent i = this.getIntent();
        tv1.setText(getIntent().getExtras().getString("detail"));
        imgv = (ImageView) findViewById(R.id.image);
        int ling = i.getIntExtra("gambar", 0);
        imgv.setImageResource(ling);
    }
}
