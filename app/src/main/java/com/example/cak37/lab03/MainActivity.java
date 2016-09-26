package com.example.cak37.lab03;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/* Lab03
   Author: Carol Schott
   Class: CS 262
   Date: 23 September 2016
   Purpose: Input password to see image, if incorrect password, screen will display an error message
 */

public class MainActivity extends AppCompatActivity {

    //Variables:

    private EditText passwordTB;
    private ImageView imageA;
    private TextView incorrectP;


    @Override

    //Main:

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incorrectP = (TextView) findViewById(R.id.incorrectPass);
        incorrectP.setVisibility(View.GONE);
        imageA = (ImageView) findViewById(R.id.eggimage);
        imageA.setVisibility(View.GONE);
        passwordTB = (EditText) findViewById(R.id.passwordText);
        passwordTB.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionID, KeyEvent event) {
                String password = passwordTB.getText().toString();
                if (password.equals("cak37")) {
                    incorrectP.setVisibility(View.GONE);
                    imageA.setVisibility(View.VISIBLE);
                } else {
                    incorrectP.setVisibility(View.VISIBLE);
                    imageA.setVisibility(View.GONE);
                }

                return false;

            }

        });

    }
}