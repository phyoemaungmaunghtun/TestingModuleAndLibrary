package com.example.testingmoduleandlibrary;

import static com.example.mymoduleone.MainActivity.testString;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String test = testString;
        Log.d("##show string",test);
    }
}