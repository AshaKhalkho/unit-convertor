package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Spinner sp1, sp2;
    EditText before;
    TextView after;
    Button convert;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sp1 = findViewById(R.id.spinner);
        sp2 = findViewById(R.id.spinner2);
        before = findViewById(R.id.editTextNumber);
        after = findViewById(R.id.editTextText);
        convert= findViewById(R.id.button);
        back=findViewById(R.id.imageButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

       int key= getIntent().getIntExtra("key",0);

       if (key==1) {
           String[] from = {"ounce(oz)", "pounds(lb)", "kilogram(kg)", "gram(g)"};
           ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
           sp1.setAdapter(ad);

           String[] to = {"ounce(oz)", "pounds(lb)", "kilogram(kg)", "gram(g)"};
           ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
           sp2.setAdapter(ad1);

           convert.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   double total;
                   double initial = Double.parseDouble(before.getText().toString());

                   if (sp1.getSelectedItem().toString() == "ounce(oz)" && sp2.getSelectedItem().toString() == "pounds(lb)") {
                       total = initial * 0.0625;
                       after.setText(total + "pounds(lb)");
                   } else if (sp1.getSelectedItem().toString() == "ounce(oz)" && sp2.getSelectedItem().toString() == "ounce(oz)") {
                       total = initial;
                       after.setText(total + "ounce(oz)");
                   } else if (sp1.getSelectedItem().toString() == "ounce(oz)" && sp2.getSelectedItem().toString() == "kilogram(kg)") {
                       total = initial * 0.0283495;
                       after.setText(total + "kilogram(kg)");
                   } else if (sp1.getSelectedItem().toString() == "ounce(oz)" && sp2.getSelectedItem().toString() == "gram(g)") {
                       total = initial * 28.3495;
                       after.setText(total + "gram(g)");
                   } else if (sp1.getSelectedItem().toString() == "pounds(lb)" && sp2.getSelectedItem().toString() == "ounce(oz)") {
                       total = initial * 16;
                       after.setText(total + "ounce(oz)");
                   } else if (sp1.getSelectedItem().toString() == "pounds(lb)" && sp2.getSelectedItem().toString() == "pounds(lb)") {
                       total = initial;
                       after.setText(total + "pounds(lb)");
                   } else if (sp1.getSelectedItem().toString() == "pounds(lb)" && sp2.getSelectedItem().toString() == "kilogram(kg)") {
                       total = initial * 0.453592;
                       after.setText(total + "kilogram(kg)");
                   } else if (sp1.getSelectedItem().toString() == "pounds(lb)" && sp2.getSelectedItem().toString() == "gram(g)") {
                       total = initial * 453.592;
                       after.setText(total + "gram(g)");
                   } else if (sp1.getSelectedItem().toString() == "kilogram(kg)" && sp2.getSelectedItem().toString() == "ounce(oz)") {
                       total = initial * 35.274;
                       after.setText(total + "ounce(oz)");
                   } else if (sp1.getSelectedItem().toString() == "kilogram(kg)" && sp2.getSelectedItem().toString() == "kilogram(kg)") {
                       total = initial;
                       after.setText(total + "kilogram(kg)");
                   } else if (sp1.getSelectedItem().toString() == "kilogram(kg)" && sp2.getSelectedItem().toString() == "pounds(lb)") {
                       total = initial * 2.20462;
                       after.setText(total + "pounds(lb)");
                   } else if (sp1.getSelectedItem().toString() == "kilogram(kg)" && sp2.getSelectedItem().toString() == "gram(g)") {
                       total = initial * 1000;
                       after.setText(total + "gram(g)");
                   } else if (sp1.getSelectedItem().toString() == "gram(g)" && sp2.getSelectedItem().toString() == "ounce(oz)") {
                       total = initial * 0.035274;
                       after.setText(total + "ounce(oz)");
                   } else if (sp1.getSelectedItem().toString() == "gram(g)" && sp2.getSelectedItem().toString() == "gram(g)") {
                       total = initial;
                       after.setText(total + "gram(g)");
                   } else if (sp1.getSelectedItem().toString() == "gram(g)" && sp2.getSelectedItem().toString() == "pounds(lb)") {
                       total = initial * 0.00220462;
                       after.setText(total + "pounds(lb)");
                   } else if (sp1.getSelectedItem().toString() == "gram(g)" && sp2.getSelectedItem().toString() == "kilogram(kg)") {
                       total = initial * 0.001;
                       after.setText(total + "kilogram(kg)");
                   }
               }
           });
       }
       else if(key==2) {
           String[] from = {"kilometers", "meters", "centimeters", "inches", "feets", "yards", "miles"};
           ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
           sp1.setAdapter(ad);

           String[] to = {"kilometers", "meters", "centimeters", "inches", "feets", "yards", "miles"};
           ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
           sp2.setAdapter(ad1);

           convert.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   double total;
                   double initial = Double.parseDouble(before.getText().toString());

                   if (sp1.getSelectedItem().toString() == "kilometers" && sp2.getSelectedItem().toString() == "meters") {
                       total = initial * 1000;
                       after.setText(total + "meters");
                   } else if (sp1.getSelectedItem().toString() == "kilometers" && sp2.getSelectedItem().toString() == "centimeters") {
                       total = initial * 100000;
                       after.setText(total + "centimeters");
                   } else if (sp1.getSelectedItem().toString() == "kilometers" && sp2.getSelectedItem().toString() == "kilometers") {
                       total = initial;
                       after.setText(total + "kilometers");
                   } else if (sp1.getSelectedItem().toString() == "kilometers" && sp2.getSelectedItem().toString() == "inches") {
                       total = initial * 3937.079;
                       after.setText(total + "inches");
                   } else if (sp1.getSelectedItem().toString() == "kilometers" && sp2.getSelectedItem().toString() == "feets") {
                       total = initial * 3280.84;
                       after.setText(total + "feets");
                   } else if (sp1.getSelectedItem().toString() == "kilometers" && sp2.getSelectedItem().toString() == "yards") {
                       total = initial * 1093.61;
                       after.setText(total + "yards");
                   } else if (sp1.getSelectedItem().toString() == "kilometers" && sp2.getSelectedItem().toString() == "miles") {
                       total = initial * 0.621371;
                       after.setText(total + "miles");
                   } else if (sp1.getSelectedItem().toString() == "meters" && sp2.getSelectedItem().toString() == "kilometers") {
                       total = initial * 0.001;
                       after.setText(total + "kilometers");
                   } else if (sp1.getSelectedItem().toString() == "meters" && sp2.getSelectedItem().toString() == "meters") {
                       total = initial;
                       after.setText(total + "meters");
                   } else if (sp1.getSelectedItem().toString() == "meters" && sp2.getSelectedItem().toString() == "centimeters") {
                       total = initial * 100;
                       after.setText(total + "centimeters");
                   } else if (sp1.getSelectedItem().toString() == "meters" && sp2.getSelectedItem().toString() == "inches") {
                       total = initial * 39.3701;
                       after.setText(total + "inches");
                   } else if (sp1.getSelectedItem().toString() == "meters" && sp2.getSelectedItem().toString() == "feets") {
                       total = initial * 3.28084;
                       after.setText(total + "feets");
                   } else if (sp1.getSelectedItem().toString() == "meters" && sp2.getSelectedItem().toString() == "yards") {
                       total = initial * 1.09361;
                       after.setText(total + "yards");
                   } else if (sp1.getSelectedItem().toString() == "meters" && sp2.getSelectedItem().toString() == "miles") {
                       total = initial * 0.000621;
                       after.setText(total + "miles");
                   } else if (sp1.getSelectedItem().toString() == "centimeters" && sp2.getSelectedItem().toString() == "kilometers") {
                       total = initial * 0.00001;
                       after.setText(total + "kilometers");
                   } else if (sp1.getSelectedItem().toString() == "centimeters" && sp2.getSelectedItem().toString() == "centimeters") {
                       total = initial;
                       after.setText(total + "centimeters");
                   } else if (sp1.getSelectedItem().toString() == "centimeters" && sp2.getSelectedItem().toString() == "meters") {
                       total = initial * 0.01;
                       after.setText(total + "meters");
                   } else if (sp1.getSelectedItem().toString() == "centimeters" && sp2.getSelectedItem().toString() == "inches") {
                       total = initial * 0.393701;
                       after.setText(total + "inches");
                   } else if (sp1.getSelectedItem().toString() == "centimeters" && sp2.getSelectedItem().toString() == "feets") {
                       total = initial * 0.0328084;
                       after.setText(total + "feets");
                   } else if (sp1.getSelectedItem().toString() == "centimeters" && sp2.getSelectedItem().toString() == "yards") {
                       total = initial * 0.0109361;
                       after.setText(total + "yards");
                   } else if (sp1.getSelectedItem().toString() == "centimeters" && sp2.getSelectedItem().toString() == "miles") {
                       total = initial / 160900;
                       after.setText(total + "miles");
                   } else if (sp1.getSelectedItem().toString() == "inches" && sp2.getSelectedItem().toString() == "inches") {
                       total = initial;
                       after.setText(total + "inches");
                   } else if (sp1.getSelectedItem().toString() == "inches" && sp2.getSelectedItem().toString() == "kilometers") {
                       total = initial / 39370;
                       after.setText(total + "kilometers");
                   } else if (sp1.getSelectedItem().toString() == "inches" && sp2.getSelectedItem().toString() == "meters") {
                       total = initial * 0.0254;
                       after.setText(total + "meters");
                   } else if (sp1.getSelectedItem().toString() == "inches" && sp2.getSelectedItem().toString() == "centimeters") {
                       total = initial * 2.54;
                       after.setText(total + "centimeters");
                   } else if (sp1.getSelectedItem().toString() == "inches" && sp2.getSelectedItem().toString() == "feets") {
                       total = initial * 0.0833;
                       after.setText(total + "feets");
                   } else if (sp1.getSelectedItem().toString() == "inches" && sp2.getSelectedItem().toString() == "yards") {
                       total = initial * 0.0277778;
                       after.setText(total + "yards");
                   } else if (sp1.getSelectedItem().toString() == "inches" && sp2.getSelectedItem().toString() == "miles") {
                       total = initial / 63360;
                       after.setText(total + "miles");
                   } else if (sp1.getSelectedItem().toString() == "feets" && sp2.getSelectedItem().toString() == "kilometers") {
                       total = initial * 0.0003048;
                       after.setText(total + "kilometers");
                   } else if (sp1.getSelectedItem().toString() == "feets" && sp2.getSelectedItem().toString() == "feets") {
                       total = initial;
                       after.setText(total + "feets");
                   } else if (sp1.getSelectedItem().toString() == "feets" && sp2.getSelectedItem().toString() == "meters") {
                       total = initial * 0.3048;
                       after.setText(total + "meters");
                   } else if (sp1.getSelectedItem().toString() == "feets" && sp2.getSelectedItem().toString() == "centimeters") {
                       total = initial * 30.48;
                       after.setText(total + "centimeters");
                   } else if (sp1.getSelectedItem().toString() == "feets" && sp2.getSelectedItem().toString() == "inches") {
                       total = initial * 12;
                       after.setText(total + "inches");
                   } else if (sp1.getSelectedItem().toString() == "feets" && sp2.getSelectedItem().toString() == "yards") {
                       total = initial * 0.333333;
                       after.setText(total + "yards");
                   } else if (sp1.getSelectedItem().toString() == "feets" && sp2.getSelectedItem().toString() == "miles") {
                       total = initial / 5280;
                       after.setText(total + "miles");
                   } else if (sp1.getSelectedItem().toString() == "yards" && sp2.getSelectedItem().toString() == "kilometers") {
                       total = initial / 1094;
                       after.setText(total + "kilometers");
                   } else if (sp1.getSelectedItem().toString() == "yards" && sp2.getSelectedItem().toString() == "yards") {
                       total = initial;
                       after.setText(total + "yards");
                   } else if (sp1.getSelectedItem().toString() == "yards" && sp2.getSelectedItem().toString() == "meters") {
                       total = initial * 0.9144;
                       after.setText(total + "meters");
                   } else if (sp1.getSelectedItem().toString() == "yards" && sp2.getSelectedItem().toString() == "centimeters") {
                       total = initial * 91.44;
                       after.setText(total + "centimeters");
                   } else if (sp1.getSelectedItem().toString() == "yards" && sp2.getSelectedItem().toString() == "inches") {
                       total = initial * 36;
                       after.setText(total + "inches");
                   } else if (sp1.getSelectedItem().toString() == "yards" && sp2.getSelectedItem().toString() == "feets") {
                       total = initial * 3;
                       after.setText(total + "feets");
                   } else if (sp1.getSelectedItem().toString() == "yards" && sp2.getSelectedItem().toString() == "miles") {
                       total = initial / 1760;
                       after.setText(total + "miles");
                   } else if (sp1.getSelectedItem().toString() == "miles" && sp2.getSelectedItem().toString() == "yards") {
                       total = initial * 1760;
                       after.setText(total + "yards");
                   } else if (sp1.getSelectedItem().toString() == "miles" && sp2.getSelectedItem().toString() == "miles") {
                       total = initial;
                       after.setText(total + "miles");
                   } else if (sp1.getSelectedItem().toString() == "miles" && sp2.getSelectedItem().toString() == "feets") {
                       total = initial * 5280;
                       after.setText(total + "feets");
                   } else if (sp1.getSelectedItem().toString() == "miles" && sp2.getSelectedItem().toString() == "inches") {
                       total = initial * 63360;
                       after.setText(total + "inches");
                   } else if (sp1.getSelectedItem().toString() == "miles" && sp2.getSelectedItem().toString() == "centimeters") {
                       total = initial * 160934;
                       after.setText(total + "centimeters");
                   } else if (sp1.getSelectedItem().toString() == "miles" && sp2.getSelectedItem().toString() == "meters") {
                       total = initial * 1609.34;
                       after.setText(total + "meters");
                   } else if (sp1.getSelectedItem().toString() == "miles" && sp2.getSelectedItem().toString() == "kilometers") {
                       total = initial * 1.60934;
                       after.setText(total + "kilometers");
                   }

               }
           });
       }
       else if(key==3) {
           String[] from = {"fahrenheit", "celsius", "kelvin"};
           ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
           sp1.setAdapter(ad);

           String[] to = {"fahrenheit", "celsius", "kelvin"};
           ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
           sp2.setAdapter(ad1);

           convert.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   double total;
                   double initial = Double.parseDouble(before.getText().toString());

                   if (sp1.getSelectedItem().toString() == "fahrenheit" && sp2.getSelectedItem().toString() == "celsius") {
                       total = (initial - 32) * 5 / 9;
                       after.setText(total + "celsius");
                   } else if (sp1.getSelectedItem().toString() == "fahrenheit" && sp2.getSelectedItem().toString() == "fahrenheit") {
                       total = initial;
                       after.setText(total + "fahrenheit");
                   } else if (sp1.getSelectedItem().toString() == "fahrenheit" && sp2.getSelectedItem().toString() == "kelvin") {
                       total = (initial - 32) * (5 / 9) + 273.15;
                       after.setText(total + "kelvin");
                   } else if (sp1.getSelectedItem().toString() == "celsius" && sp2.getSelectedItem().toString() == "fahrenheit") {
                       total = initial * (9 / 5) + 32;
                       after.setText(total + "fahrenheit");
                   } else if (sp1.getSelectedItem().toString() == "celsius" && sp2.getSelectedItem().toString() == "kelvin") {
                       total = initial + 273.15;
                       after.setText(total + "kelvin");
                   } else if (sp1.getSelectedItem().toString() == "celsius" && sp2.getSelectedItem().toString() == "celsius") {
                       total = initial;
                       after.setText(total + "celsius");
                   } else if (sp1.getSelectedItem().toString() == "kelvin" && sp2.getSelectedItem().toString() == "fahrenheit") {
                       total = (initial - 273.15) * (9 / 5) + 32;
                       after.setText(total + "fahrenheit");
                   } else if (sp1.getSelectedItem().toString() == "kelvin" && sp2.getSelectedItem().toString() == "celsius") {
                       total = initial - 273.15;
                       after.setText(total + "celsius");
                   } else if (sp1.getSelectedItem().toString() == "kelvin" && sp2.getSelectedItem().toString() == "kelvin") {
                       total = initial;
                       after.setText(total + "kelvin");
                   }
               }
           });
       }
       else if (key==4) {
           String[] from = {"seconds", "minutes", "hours", "days", "years"};
           ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
           sp1.setAdapter(ad);

           String[] to = {"seconds", "minutes", "hours", "days", "years"};
           ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
           sp2.setAdapter(ad1);

           convert.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   double total;
                   double initial = Double.parseDouble(before.getText().toString());

                   if (sp1.getSelectedItem().toString() == "seconds" && sp2.getSelectedItem().toString() == "minutes") {
                       total = initial / 60;
                       after.setText(total + "minutes");
                   } else if (sp1.getSelectedItem().toString() == "seconds" && sp2.getSelectedItem().toString() == "seconds") {
                       total = initial;
                       after.setText(total + "seconds");
                   } else if (sp1.getSelectedItem().toString() == "seconds" && sp2.getSelectedItem().toString() == "hours") {
                       total = initial / (60 * 60);
                       after.setText(total + "hours");
                   } else if (sp1.getSelectedItem().toString() == "seconds" && sp2.getSelectedItem().toString() == "days") {
                       total = initial / (60 * 60 * 24);
                       after.setText(total + "days");
                   } else if (sp1.getSelectedItem().toString() == "seconds" && sp2.getSelectedItem().toString() == "years") {
                       total = initial / (60 * 60 * 24 * 365);
                       after.setText(total + "years");
                   } else if (sp1.getSelectedItem().toString() == "minutes" && sp2.getSelectedItem().toString() == "seconds") {
                       total = initial * 60;
                       after.setText(total + "seconds");
                   } else if (sp1.getSelectedItem().toString() == "minutes" && sp2.getSelectedItem().toString() == "minutes") {
                       total = initial;
                       after.setText(total + "minutes");
                   } else if (sp1.getSelectedItem().toString() == "minutes" && sp2.getSelectedItem().toString() == "hours") {
                       total = initial / 60;
                       after.setText(total + "hours");
                   } else if (sp1.getSelectedItem().toString() == "minutes" && sp2.getSelectedItem().toString() == "days") {
                       total = initial / (60 * 24);
                       after.setText(total + "days");
                   } else if (sp1.getSelectedItem().toString() == "minutes" && sp2.getSelectedItem().toString() == "years") {
                       total = initial / (60 * 24 * 365);
                       after.setText(total + "years");
                   } else if (sp1.getSelectedItem().toString() == "hours" && sp2.getSelectedItem().toString() == "seconds") {
                       total = initial * 60 * 60;
                       after.setText(total + "seconds");
                   } else if (sp1.getSelectedItem().toString() == "hours" && sp2.getSelectedItem().toString() == "hours") {
                       total = initial;
                       after.setText(total + "hours");
                   } else if (sp1.getSelectedItem().toString() == "hours" && sp2.getSelectedItem().toString() == "minutes") {
                       total = initial * 60;
                       after.setText(total + "minutes");
                   } else if (sp1.getSelectedItem().toString() == "hours" && sp2.getSelectedItem().toString() == "days") {
                       total = initial / 24;
                       after.setText(total + "days");
                   } else if (sp1.getSelectedItem().toString() == "hours" && sp2.getSelectedItem().toString() == "years") {
                       total = initial / (24 * 365);
                       after.setText(total + "years");
                   } else if (sp1.getSelectedItem().toString() == "days" && sp2.getSelectedItem().toString() == "seconds") {
                       total = initial * 24 * 60 * 60;
                       after.setText(total + "seconds");
                   } else if (sp1.getSelectedItem().toString() == "days" && sp2.getSelectedItem().toString() == "days") {
                       total = initial;
                       after.setText(total + "days");
                   } else if (sp1.getSelectedItem().toString() == "days" && sp2.getSelectedItem().toString() == "minutes") {
                       total = initial * 24 * 60;
                       after.setText(total + "minutes");
                   } else if (sp1.getSelectedItem().toString() == "days" && sp2.getSelectedItem().toString() == "hours") {
                       total = initial * 24;
                       after.setText(total + "hours");
                   } else if (sp1.getSelectedItem().toString() == "days" && sp2.getSelectedItem().toString() == "years") {
                       total = initial / 365;
                       after.setText(total + "years");
                   } else if (sp1.getSelectedItem().toString() == "years" && sp2.getSelectedItem().toString() == "seconds") {
                       total = initial * 365 * 24 * 60 * 60;
                       after.setText(total + "seconds");
                   } else if (sp1.getSelectedItem().toString() == "years" && sp2.getSelectedItem().toString() == "years") {
                       total = initial;
                       after.setText(total + "years");
                   } else if (sp1.getSelectedItem().toString() == "years" && sp2.getSelectedItem().toString() == "minutes") {
                       total = initial * 365 * 24 * 60;
                       after.setText(total + "minutes");
                   } else if (sp1.getSelectedItem().toString() == "years" && sp2.getSelectedItem().toString() == "hours") {
                       total = initial * 365 * 24;
                       after.setText(total + "hours");
                   } else if (sp1.getSelectedItem().toString() == "years" && sp2.getSelectedItem().toString() == "days") {
                       total = initial * 365;
                       after.setText(total + "days");
                   }
               }
           });
       }
       else if(key==5) {
           String[] from = {"litres", "gallons"};
           ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, from);
           sp1.setAdapter(ad);

           String[] to = {"litres", "gallons"};
           ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, to);
           sp2.setAdapter(ad1);

           convert.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   double total;
                   double initial = Double.parseDouble(before.getText().toString());

                   if (sp1.getSelectedItem().toString() == "litres" && sp2.getSelectedItem().toString() == "gallons") {
                       total = initial * 0.21997;
                       after.setText(total + "gallons");
                   } else if (sp1.getSelectedItem().toString() == "liters" && sp2.getSelectedItem().toString() == "litres") {
                       total = initial;
                       after.setText(total + "litres");
                   } else if (sp1.getSelectedItem().toString() == "gallons" && sp2.getSelectedItem().toString() == "litres") {
                       total = initial * 4.546;
                       after.setText(total + "litres");
                   } else if (sp1.getSelectedItem().toString() == "gallons" && sp2.getSelectedItem().toString() == "gallons") {
                       total = initial;
                       after.setText(total + "gallons");
                   }
               }
           });
       }
       else if(key==6)
       {
           String[] from = {"radians","degrees"};
           ArrayAdapter ad =new ArrayAdapter<String>( this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
           sp1.setAdapter(ad);

           String[] to ={"radians","degrees"};
           ArrayAdapter ad1 =new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
           sp2.setAdapter(ad1);

           convert.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   double total;
                   double initial = Double.parseDouble(before.getText().toString());

                   if (sp1.getSelectedItem().toString() == "radians" && sp2.getSelectedItem().toString() == "degrees")
                   {
                       total = initial * (180/3.14);
                       after.setText( total +"degrees");
                   }
                   else if (sp1.getSelectedItem().toString() == "radians" && sp2.getSelectedItem().toString() == "radians")
                   {
                       total = initial ;
                       after.setText( total +"radians");
                   }
                   else if (sp1.getSelectedItem().toString() == "degrees" && sp2.getSelectedItem().toString() == "radians")
                   {
                       total = initial * (3.14/180);
                       after.setText( total +"radians");
                   }
                   else if (sp1.getSelectedItem().toString() == "degrees" && sp2.getSelectedItem().toString() == "degrees")
                   {
                       total = initial ;
                       after.setText( total +"degrees");
                   }
               }
           });
       }
       }
    }

