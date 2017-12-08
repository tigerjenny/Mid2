package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {

    private TextView txNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }

    public void roll(View view){
        int i = new Random().nextInt(6)+1;
        new AlertDialog.Builder(this)
                .setTitle("Message")
                .setMessage("Number: "+i)
                .setPositiveButton("OK" , null)
                .show();
    }

}
