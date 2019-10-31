package com.example.myprimeraappseba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int[] arrayDeEnteros;
    arrayDeEnteros = new int[5];

    arrayDeEnteros[0] = 1;
    arrayDeEnteros[1] = 3;
    arrayDeEnteros[2] = 5;
    arrayDeEnteros[3] = 7;
    arrayDeEnteros[4] = 9;

            System.out.println(arrayDeEnteros[0]);
            System.out.println(arrayDeEnteros[1]);
            System.out.println(arrayDeEnteros[3]);


}

