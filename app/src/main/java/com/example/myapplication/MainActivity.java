package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //this line connect over java code to xml file
        //after this line we can perform any action of xml
        //now we will place the reference of a particular id in a variable, we use variable because java support variable object and method only.
        TextView txt;
        EditText edtweight, heightininch, heightinft;
        Button edtbtn;
        ConstraintLayout clmain;

        //now we will assign value to our variable
        edtweight=findViewById(R.id.edtweight);
        heightininch=findViewById(R.id.heightininch);
        heightinft=findViewById(R.id.heightinft);
        edtbtn=findViewById(R.id.edtbtn);
        txt=findViewById(R.id.txt);
        clmain=findViewById(R.id.clmain);

        //we have to perform an action when we click on button
        //we have to place a object of onclicklistner by creating object by using new keyword
        edtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //we will get values bu using get -> from editable we have to convert it into a string-> by usining INTEGER Parse int it conver the value in integer->Now we will store our value in a variable
              int weight= Integer.parseInt(edtweight.getText().toString());
            int ft=Integer.parseInt(heightinft.getText().toString());
                int inch=Integer.parseInt(heightininch.getText().toString());
                int totalin=ft*12 +inch;
                double totalcm =totalin*2.53;
                double totalm=totalcm/100;
                double bmi=weight/(totalm*totalm);
                if(bmi>25){
                    txt.setText("You're Overweight");
                    clmain.setBackgroundColor(getResources().getColor(R.color.colorow));
                }
                else if(bmi<18){
                    txt.setText("You're Underweight");
                    clmain.setBackgroundColor(getResources().getColor(R.color.coloruw));
                }else{
                    txt.setText("You're Healthy");
                    clmain.setBackgroundColor(getResources().getColor(R.color.colorh));
                }

            }
        });


    }
}