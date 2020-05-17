package com.example.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView tomImageView = findViewById(R.id.tomImageView);


    }



    public void eraseTom(View view) {
        ImageView jerryImageView = findViewById(R.id.jerryImageView);
        ImageView tomImageView = findViewById(R.id.tomImageView);
        if(tomImageView.getAlpha() != 0){
            tomImageView.animate().alpha(0).rotation(tomImageView.getRotation() + 3600).scaleY(0).scaleX(0).setDuration(3000);
            jerryImageView.animate().alpha(1).rotation(jerryImageView.getRotation() + 3600).scaleY(1).scaleX(1).setDuration(3000);
            //tomImageView.setRotation(0);
        }else{
            tomImageView.animate().alpha(1).rotation(tomImageView.getRotation() + 3600).scaleY(1).scaleX(1).setDuration(3000);
            jerryImageView.animate().alpha(0).rotation(jerryImageView.getRotation() + 3600).scaleY(0).scaleX(0).setDuration(3000);
            //jerryImageView.setRotation(0);
        }
    }
}
