package com.example.mycalcullator10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ViewerActivity extends AppCompatActivity {

    private Controller controller;
    private TextView textView;

    public ViewerActivity() {
        controller = new Controller(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.editTextNumber);

        Button buttonDel = (Button) findViewById(R.id.buttonAC);
        buttonDel.setOnClickListener(controller);
        Button buttonPM = (Button) findViewById(R.id.buttonPM);
        buttonPM.setOnClickListener(controller);
        Button buttonPr = (Button) findViewById(R.id.buttonProc);
        buttonPr.setOnClickListener(controller);
        Button buttonSplit = (Button) findViewById(R.id.buttonSplit);
        buttonSplit.setOnClickListener(controller);
        Button buttonone = (Button) findViewById(R.id.button1);
        buttonone.setOnClickListener(controller);
        Button buttontwo = (Button) findViewById(R.id.button2);
        buttontwo.setOnClickListener(controller);
        Button buttonthree = (Button) findViewById(R.id.button3);
        buttonthree.setOnClickListener(controller);
        Button buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonMult.setOnClickListener(controller);
        Button buttonfour = (Button) findViewById(R.id.button4);
        buttonfour.setOnClickListener(controller);
        Button buttonfive = (Button) findViewById(R.id.button5);
        buttonfive.setOnClickListener(controller);
        Button buttonsix = (Button) findViewById(R.id.button6);
        buttonsix.setOnClickListener(controller);
        Button buttonMinus = (Button) findViewById(R.id.buttonMin);
        buttonMinus.setOnClickListener(controller);
        Button buttonseven = (Button) findViewById(R.id.button7);
        buttonseven.setOnClickListener(controller);
        Button buttoneigth = (Button) findViewById(R.id.button8);
        buttoneigth.setOnClickListener(controller);
        Button buttonnine = (Button) findViewById(R.id.button9);
        buttonnine.setOnClickListener(controller);
        Button buttonPlus = (Button) findViewById(R.id.buttonPl);
        buttonPlus.setOnClickListener(controller);
        Button buttonZero = (Button) findViewById(R.id.buttonZer);
        buttonZero.setOnClickListener(controller);
        Button buttonPoint = (Button) findViewById(R.id.buttonPt);
        buttonPoint.setOnClickListener(controller);
        Button buttonEqual = (Button) findViewById(R.id.buttonEq);
        buttonEqual.setOnClickListener(controller);
    }

    public void update(String text) {
        textView.setText(text);
    }
}
