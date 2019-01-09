package com.example.lawre.week1day3homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{

    TextView output;
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.output);
        input = (EditText) findViewById(R.id.input);
        submit = (Button) findViewById(R.id.submit);
    }

    public void onClick(View v)
    {
        System.out.println("Clicked");
        Editable inputText = input.getText();
        System.out.println(inputText);
        output.setText(inputText);
    }
}
