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
        String message = "Captain's Log, Stardate 43125.8. We have entered a spectacular binary star system in the Kavis Alpha sector on a most critical mission of astrophysical research.";
        Log.i("MainActivity.java", message);


        // Find second menu item TextView and print the text to the logs
        TextView textv = (TextView) findViewById(R.id.menu_item_2);
        String message2 = "This is it";
        Log.v("MainActivity",message2);


        // Find third menu item TextView and print the text to the logs
        TextView tview = (TextView) findViewById(R.id.menu_item_3);
        String message3 = "It has been done after all";
        Log.w("MainActivity",message3);


    }


}
