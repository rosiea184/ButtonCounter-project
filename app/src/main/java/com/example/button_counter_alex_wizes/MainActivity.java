package com.example.button_counter_alex_wizes;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.Display;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";
    private Button clear;
    private Button increase;
    private Button decrease;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.displayId);

        clear = findViewById(R.id.button2);
        //clear.setText("Clear");
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Hello World", Snackbar.LENGTH_SHORT).show();
                        Log.i(TAG, "I pressed clear");
                        resetCounter();
            }

        });
        increase = findViewById(R.id.incButtonId);
        //increase.setText("Plus 1");
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Hello World", Snackbar.LENGTH_SHORT).show();
                Log.i(TAG, "I pressed increase");
                //count here
                incrementCounter();
            }
        });
        decrease = findViewById(R.id.decButtonId);
        //decrease.setText("Minus 1");
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Hello World", Snackbar.LENGTH_SHORT).show();
                Log.i(TAG, "I pressed decrease");
                decrementCounter();
            }
        });
    }

    private void incrementCounter(){
        int currentValue = Integer.valueOf(display.getText().toString());
        currentValue++;
        display.setText(String.valueOf(currentValue));
    }

    private void decrementCounter(){
        int currentValue = Integer.valueOf(display.getText().toString());
        currentValue--;
        display.setText(String.valueOf(currentValue));
    }
    private void resetCounter(){
        int currentValue = Integer.valueOf(display.getText().toString());
        currentValue = 0;
        display.setText(String.valueOf(currentValue));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "I entered into onStart()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        String counterValue = display;
        outState.putString("display", counterValue);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String counterValue = savedInstanceState.getString("display");
        display.setText(counterValue);
    }
}