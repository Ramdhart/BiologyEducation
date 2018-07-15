package com.jxj.biologyeducation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MateriMenu extends Activity {
//    Button artikel, video;
    RelativeLayout artikel, video;



    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_materi);
//        Button artikel = (Button) findViewById(R.id.artikel);
//        Button video = (Button) findViewById(R.id.video);
        RelativeLayout artikel = (RelativeLayout)findViewById(R.id.artikel);
        RelativeLayout video = (RelativeLayout)findViewById(R.id.video);
    }


    public void materi (View view){
        Intent intent = new Intent(this,MainArtikel.class);
        startActivity(intent);
    }
    public void videoMateri(View view){
        Intent intent = new Intent(this,VideoActivity.class);
        startActivity(intent);
    }
}
