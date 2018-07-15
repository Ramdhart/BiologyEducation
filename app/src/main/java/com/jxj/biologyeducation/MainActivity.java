package com.jxj.biologyeducation;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Button materi;
//    Button quiz;
    RelativeLayout quiz, discus, article, maps ;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button materi = (Button)findViewById(R.id.materi);
//        Button quiz = (Button)findViewById(R.id.quiz);
        RelativeLayout quiz = (RelativeLayout)findViewById(R.id.quiz);
        RelativeLayout discus = (RelativeLayout)findViewById(R.id.discus);
        RelativeLayout article = (RelativeLayout)findViewById(R.id.article);
        RelativeLayout maps = (RelativeLayout)findViewById(R.id.maps);
        ImageView logo = (ImageView)findViewById(R.id.logo);

    }

    public void article(View view){
        Intent intent = new Intent(this, MateriMenu.class);
        startActivity(intent);
    }

    public void quiz (View view){
        Toast.makeText(getApplicationContext(),"Wait next Update",Toast.LENGTH_SHORT).show();
    }

    public void discus (View view){
        Intent discus = new Intent(this, Login.class);
        startActivity(discus);
    }

    public void maps (View view){
        Intent maps = new Intent(this, MapsActivity.class);
        startActivity(maps);
    }

    public void about (View view){
        Intent about = new Intent(this, AboutUs.class);
        startActivity(about);
    }
}
