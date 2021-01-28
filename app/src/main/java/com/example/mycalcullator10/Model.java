package com.example.mycalcullator10;

import java.util.List;

public class Model {

    private String temp;
    private String leftValue;
    private String rightValue;
    private char action;
    private ViewerActivity viewer;
    private  ExpressionParser expressionParser;

    public Model(ViewerActivity viewer) {
        this.viewer = viewer;
        temp = "";
        leftValue = "";
        rightValue = "";
        action = '@';
        expressionParser = new ExpressionParser();
    }

    public void doAction(String value) {
        if (value.equals("AC")) {
            temp = "";
            leftValue = "";
            rightValue = "";
            action = '@';
        } else if (value.equals("PM")) {
            temp = temp + "";
        } else if (value.equals("%")) {
            temp = temp + "";
        } else if (value.equals("/")) {
            leftValue = temp;
            action = '/';
            temp = "";
            return;
        } else if (value.equals("1")) {
            temp = temp + "1";
        } else if (value.equals("2")) {
            temp = temp + "2";
        } else if (value.equals("3")) {
            temp = temp + "3";
        } else if (value.equals("*")) {
            leftValue = temp;
            action = '*';
            temp = "";
            return;
        } else if (value.equals("4")) {
            temp = temp + "4";
        } else if (value.equals("5")) {
            temp = temp + "5";
        } else if (value.equals("6")) {
            temp = temp + "6";
        } else if (value.equals("-")) {
            leftValue = temp;
            action = '-';
            temp = "";
            return;
        } else if (value.equals("7")) {
            temp = temp + "7";
        } else if (value.equals("8")) {
            temp = temp + "8";
        } else if (value.equals("9")) {
            temp = temp + "9";
        } else if (value.equals("+")) {
            leftValue = temp;
            action = '+';
            temp = "";
            return;
        } else if (value.equals("0")) {
            temp = temp + "0";
        } else if (value.equals(".")) {
            temp = temp + ".";
        } else if (value.equals("=")) {
            rightValue = temp;
            String answer = leftValue + " " + action + " " + rightValue;
            List<String> expression = expressionParser.parse(answer);
            temp = expression.toString();

            boolean flag = expressionParser.getFlag();
            if (flag) {
                for (String x : expression) System.out.print(x + " ");
                System.out.println();
                temp = "" + Ideone.calc(expression);
                System.out.println(temp);

            }
        }
        viewer.update(temp);
    }
}
