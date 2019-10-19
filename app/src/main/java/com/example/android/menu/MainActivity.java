package com.example.android.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView tv = (TextView) findViewById(R.id.menu_item_1);
        String menuItem1 =  tv.getText().toString();
        Log.i("MainActivity.java", menuItem1);


        // Find second menu item TextView and print the text to the logs
        TextView textv = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2 = textv.getText().toString();
        Log.v("MainActivity",menuItem2);


        // Find third menu item TextView and print the text to the logs
        TextView tview = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3 = tview.getText().toString();
        Log.w("MainActivity",menuItem3);


    }


}
