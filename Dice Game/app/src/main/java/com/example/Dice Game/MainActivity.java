package com.example.zaroyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView win;
    ImageView zar1,zar2;
    Button at;
    final int zarlar[]={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        win= findViewById(R.id.textView2);
        zar1= findViewById(R.id.imageView);
        zar2= findViewById(R.id.imageView2);
        at= findViewById(R.id.button);

        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rs1=new Random();
                int say1=rs1.nextInt(6);
                Random rs2=new Random();
                int say2= rs2.nextInt(6);

                if(say1>say2){
                    win.setText("Kazanan 1. Oyuncu");
                }
                else if (say2>say1){
                    win.setText("Kazanan 2. Oyuncu");
                }
                else {
                    win.setText("Berabere");
                }
                zar1.setImageResource(zarlar[say1]);
                zar2.setImageResource(zarlar[say2]);


            }
        });


    }
}


