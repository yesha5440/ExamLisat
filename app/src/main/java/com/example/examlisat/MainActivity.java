package com.example.examlisat;

import static com.example.examlisat.R.drawable.image1;
import static com.example.examlisat.R.drawable.image10;
import static com.example.examlisat.R.drawable.image2;
import static com.example.examlisat.R.drawable.image3;
import static com.example.examlisat.R.drawable.image4;
import static com.example.examlisat.R.drawable.image5;
import static com.example.examlisat.R.drawable.image6;
import static com.example.examlisat.R.drawable.image7;
import static com.example.examlisat.R.drawable.image8;
import static com.example.examlisat.R.drawable.image9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   int image[] = {image1,image2,image3,image4,image5,image6,image7,image8,image9,image10};
   String title[] = {};
   String date[] = {};
   String Dis[] = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}