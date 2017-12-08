package com.fju.mid2;

import android.media.Image;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {

    int[] dies = {R.drawable.d1,
                    R.drawable.d2,
                    R.drawable.d3,
                    R.drawable.d4,
                    R.drawable.d5,
                    R.drawable.d6};
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void roll(View view){
        int i = new Random().nextInt(6)+1;
//        new AlertDialog.Builder(this)
//                .setTitle("Message")
//                .setMessage("Number: "+i)
//                .setPositiveButton("OK" , null)
//                .show();
        imageView.setImageResource(dies[i-1]);

    }

}
