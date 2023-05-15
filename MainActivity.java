package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton weight,length,temp,clock,fuel,angle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=(ImageButton) findViewById(R.id.imageButton);
        length=(ImageButton) findViewById(R.id.imageButton2);
        temp=(ImageButton) findViewById(R.id.imageButton3);
        clock=(ImageButton) findViewById(R.id.imageButton4);
        fuel=(ImageButton) findViewById(R.id.imageButton5);
        angle=(ImageButton) findViewById(R.id.imageButton6);

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,MainActivity2.class);
                intent2.putExtra("key",1);
                startActivity(intent2);

            }
        });
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,MainActivity2.class);
                intent3.putExtra("key",2);
                startActivity(intent3);
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,MainActivity2.class);
                intent4.putExtra("key",3);
                startActivity(intent4);
            }
        });
        clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivity.this,MainActivity2.class);
                intent5.putExtra("key",4);
                startActivity(intent5);
            }
        });
        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MainActivity.this,MainActivity2.class);
                intent6.putExtra("key",5);
                startActivity(intent6);
            }
        });
        angle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(MainActivity.this,MainActivity2.class);
                intent7.putExtra("key",6);
                startActivity(intent7);
            }
        });
    }
}