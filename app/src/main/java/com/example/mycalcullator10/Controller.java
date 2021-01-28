package com.example.mycalcullator10;

import android.view.View;

public class Controller implements View.OnClickListener {

    private Model model;

    public Controller(ViewerActivity viewer) {
        model = new Model(viewer);
    }

    @Override
    public void onClick(View v) {

        String argument = "";
        switch (v.getId()) {

            case R.id.buttonAC:
                argument = "AC";
                break;
            case R.id.buttonPM:
                argument = "PM";
                break;
            case R.id.buttonProc:
                argument = "%";
                break;
            case R.id.buttonSplit:
                argument = "/";
                break;
            case R.id.button1:
                argument = "1";
                break;
            case R.id.button2:
                argument = "2";
                break;
            case R.id.button3:
                argument = "3";
                break;
            case R.id.buttonMult:
                argument = "*";
                break;
            case R.id.button4:
                argument = "4";
                break;
            case R.id.button5:
                argument = "5";
                break;
            case R.id.button6:
                argument = "6";
                break;
            case R.id.buttonMin:
                argument = "-";
                break;
            case R.id.button7:
                argument = "7";
                break;
            case R.id.button8:
                argument = "8";
                break;
            case R.id.button9:
                argument = "9";
                break;
            case R.id.buttonPl:
                argument = "+";
                break;
            case R.id.buttonZer:
                argument = "0";
                break;
            case R.id.buttonPt:
                argument = ".";
                break;
            case R.id.buttonEq:
                argument = "=";
                break;
            default:
        }
        model.doAction(argument);
    }
}
