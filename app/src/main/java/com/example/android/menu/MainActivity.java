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


        /**
         * Get the TextView with findViewById.
         * Use the getter called getText to get the text. Another method called toString must be used to convert the result (which is a CharSequence) returned from getText into a String. It’s complicated, we know. Sometimes you will need to massage the data you can get from a getter into the right type and the only way to know is by reading the documentation.
         * Then use the method Log.v to print the log. You could have used any of the Logging methods to print the log, we chose verbose.
         */


    }


}
