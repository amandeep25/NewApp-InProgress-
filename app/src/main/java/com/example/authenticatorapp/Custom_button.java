package com.example.authenticatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Custom_button extends AppCompatActivity {

    EditText textView5, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16;
    String txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9;
    Button button_custom, button_nav, one, two, three, four, five, six, seven, eight, nine;

    private void findViewByIds() {

        button_custom = findViewById(R.id.button_custom);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView5 = findViewById(R.id.textView5);
        one = findViewById(R.id.button0);
        two = findViewById(R.id.button1);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);
        button_nav = findViewById(R.id.button_nav);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_button);

        button_custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt1 = textView10.getText().toString();
                txt2 = textView13.getText().toString();
                txt3 = textView9.getText().toString();
                txt4 = textView14.getText().toString();
                txt5 = textView5.getText().toString();
                txt6 = textView12.getText().toString();
                txt7 = textView16.getText().toString();
                txt8 = textView11.getText().toString();
                txt9 = textView15.getText().toString();

                one.setText(txt1);
                two.setText(txt2);
                three.setText(txt3);
                four.setText(txt4);
                five.setText(txt5);
                six.setText(txt6);
                seven.setText(txt7);
                eight.setText(txt8);
                nine.setText(txt9);

            }
        });

        button_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });

    }

    /*public void openMainAct() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }*/

}