package com.example.button_counter_alex_wizes;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";
    private Button clear;
    private Button increase;
    private Button decrease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        clear = findViewById(R.id.button2);
        clear.setText("Clear");
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello World", Snackbar.LENGTH_SHORT).show();
                        Log.i(TAG, "I pressed clear");
            }

        });
        increase = findViewById(R.id.button_first);
        increase.setText("Plus 1");
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello World", Snackbar.LENGTH_SHORT).show();
                Log.i(TAG, "I pressed increase");
            }
        });
        decrease = findViewById(R.id.button_second);
        decrease.setText("Minus 1");
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello World", Snackbar.LENGTH_SHORT).show();
                Log.i(TAG, "I pressed decrease");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "I entered into onStart()");
    }


    /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}