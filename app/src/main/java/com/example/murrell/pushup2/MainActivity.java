package com.example.murrell.pushup2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void testup(){
        int i = 1 + 1;
        int ii = i + 2;
        int iii = i + ii;
    }
}
