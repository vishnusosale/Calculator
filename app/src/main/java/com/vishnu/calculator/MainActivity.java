/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Vishnu Sosale
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.vishnu.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numAEditText, numBEditText;
    Button addButton, subButton, divButton, mulButton;
    TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        handleButtonClickEvents();

    }

    private void initViews() {
        numAEditText = (EditText) findViewById(R.id.numAEditText);
        numBEditText = (EditText) findViewById(R.id.numBEditText);

        addButton = (Button) findViewById(R.id.addButton);
        subButton = (Button) findViewById(R.id.subButton);
        divButton = (Button) findViewById(R.id.divButton);
        mulButton = (Button) findViewById(R.id.mulButton);

        answerTextView = (TextView) findViewById(R.id.answerTextView);
    }

    private void handleButtonClickEvents() {

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmptyEditText()) {
                    Toast.makeText(getApplicationContext(), "Enter 2 numbers", Toast.LENGTH_SHORT).show();
                } else {
                    answerTextView.setVisibility(View.VISIBLE);
                    answerTextView.setText("Answer: " + addNumbers());
                }
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmptyEditText()) {
                    Toast.makeText(getApplicationContext(), "Enter 2 numbers", Toast.LENGTH_SHORT).show();
                } else {
                    answerTextView.setVisibility(View.VISIBLE);
                    answerTextView.setText("Answer: " + subNumbers());
                }
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmptyEditText()) {
                    Toast.makeText(getApplicationContext(), "Enter 2 numbers", Toast.LENGTH_SHORT).show();
                } else {
                    answerTextView.setVisibility(View.VISIBLE);
                    answerTextView.setText("Answer: " + divNumbers());
                }
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmptyEditText()) {
                    Toast.makeText(getApplicationContext(), "Enter 2 numbers", Toast.LENGTH_SHORT).show();
                } else {
                    answerTextView.setVisibility(View.VISIBLE);
                    answerTextView.setText("Answer: " + mulNumbers());
                }
            }
        });
    }

    private double addNumbers() {
        return Double.parseDouble(numAEditText.getText().toString()) + Double.parseDouble(numBEditText.getText().toString());
    }

    private double subNumbers() {
        return Double.parseDouble(numAEditText.getText().toString()) - Double.parseDouble(numBEditText.getText().toString());
    }

    private double divNumbers() {
        return Double.parseDouble(numAEditText.getText().toString()) / Double.parseDouble(numBEditText.getText().toString());
    }

    private double mulNumbers() {
        return Double.parseDouble(numAEditText.getText().toString()) * Double.parseDouble(numBEditText.getText().toString());
    }

    private boolean isEmptyEditText() {
        return (!(!numAEditText.getText().toString().trim().isEmpty() && !numBEditText.getText().toString().trim().isEmpty()));
    }

}
