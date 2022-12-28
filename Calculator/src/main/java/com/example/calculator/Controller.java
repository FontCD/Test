package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static com.example.calculator.LogCreator.*;

public class Controller {

    public String expression = "";
    public String firstMember = "";
    public String secondMember = "";
    public String operation = "";
    public int opCount = 0;
    public int number1;
    public int number2;
    public int temp;



    @FXML
    Label displayLabel;

    @FXML
    public void write0() {
        expression = expression + "0";
        if (opCount == 0) {
            firstMember = firstMember + "0";
        } else {
            secondMember = secondMember + "0";
        }
        displayLabel.setText(expression);
        updateLog("0 was clicked");
    }

    @FXML
    public void write1() {
        expression = expression + "1";
        if (opCount == 0) {
            firstMember = firstMember + "1";
        } else {
            secondMember = secondMember + "1";
        }
        displayLabel.setText(expression);
        updateLog("1 was clicked");
    }

    @FXML
    public void write2() {
        expression = expression + "2";
        if (opCount == 0) {
            firstMember = firstMember + "2";
        } else {
            secondMember = secondMember + "2";
        }
        displayLabel.setText(expression);
        updateLog("2 was clicked");
    }

    @FXML
    public void write3() {
        expression = expression + "3";
        if (opCount == 0) {
            firstMember = firstMember + "3";
        } else {
            secondMember = secondMember + "3";
        }
        displayLabel.setText(expression);
        updateLog("3 was clicked");
    }

    @FXML
    public void write4() {
        expression = expression + "4";
        if (opCount == 0) {
            firstMember = firstMember + "4";
        } else {
            secondMember = secondMember + "4";
        }
        displayLabel.setText(expression);
        updateLog("4 was clicked");
    }

    @FXML
    public void write5() {
        expression = expression + "5";
        if (opCount == 0) {
            firstMember = firstMember + "5";
        } else {
            secondMember = secondMember + "5";
        }
        displayLabel.setText(expression);
        updateLog("5 was clicked");
    }

    @FXML
    public void write6() {
        expression = expression + "6";
        if (opCount == 0) {
            firstMember = firstMember + "6";
        } else {
            secondMember = secondMember + "6";
        }
        displayLabel.setText(expression);
        updateLog("6 was clicked");
    }

    @FXML
    public void write7() {
        expression = expression + "7";
        if (opCount == 0) {
            firstMember = firstMember + "7";
        } else {
            secondMember = secondMember + "7";
        }
        displayLabel.setText(expression);
        updateLog("7 was clicked");
    }

    @FXML
    public void write8() {
        expression = expression + "8";
        if (opCount == 0) {
            firstMember = firstMember + "8";
        } else {
            secondMember = secondMember + "8";
        }
        displayLabel.setText(expression);
        updateLog("8 was clicked");
    }

    @FXML
    public void write9() {
        expression = expression + "9";
        if (opCount == 0) {
            firstMember = firstMember + "9";
        } else {
            secondMember = secondMember + "9";
        }
        displayLabel.setText(expression);
        updateLog("9 was clicked");
    }

    @FXML
    public void canc() {
        expression = "";
        firstMember = "";
        secondMember = "";
        operation = "";
        opCount = 0;
        displayLabel.setText(expression);
        updateLog("CANC was clicked");
    }

    @FXML
    public void add() {
        if (opCount == 0 && !expression.isEmpty()) {
            expression = expression + " + ";
            operation = "+";
            displayLabel.setText(expression);
            opCount++;
        }
        updateLog("+ was clicked");
    }

    @FXML
    public void sub() {
        if (opCount == 0 && !expression.isEmpty()) {
            expression = expression + " - ";
            operation = "-";
            displayLabel.setText(expression);
            opCount++;
        }
        updateLog("- was clicked");
    }

    @FXML
    public void mult() {
        if (opCount == 0 && !expression.isEmpty()) {
            expression = expression + " x ";
            operation = "x";
            displayLabel.setText(expression);
            opCount++;
        }
        updateLog("x was clicked");
    }

    @FXML
    public void div() {
        if (opCount == 0 && !expression.isEmpty()) {
            expression = expression + " / ";
            operation = "/";
            displayLabel.setText(expression);
            opCount++;
        }
        updateLog("/ was clicked");
    }

    @FXML
    public void solve() {
        if (opCount == 1 && !firstMember.isEmpty() && !secondMember.isEmpty()) {
            number1 = Integer.parseInt(firstMember);
            number2 = Integer.parseInt(secondMember);

            if (operation.equals("+")) {
                temp = number1 + number2;
                firstMember = "";
                secondMember = "";
                opCount = 0;
                operation = "";
                firstMember = firstMember + temp;
                displayLabel.setText(firstMember);
            }
            if (operation.equals("-")) {
                temp = number1 - number2;
                firstMember = "";
                secondMember = "";
                opCount = 0;
                operation = "";
                firstMember = firstMember + temp;
                displayLabel.setText(firstMember);
            }
            if (operation.equals("x")) {
                temp = number1*number2;
                firstMember = "";
                secondMember = "";
                opCount = 0;
                operation = "";
                firstMember = firstMember + temp;
                displayLabel.setText(firstMember);
            }
            if (operation.equals("/")) {
                if (number2 == 0) {
                    displayLabel.setText("ERROR");
                } else {
                    temp = number1/number2;
                    firstMember = "";
                    secondMember = "";
                    opCount = 0;
                    operation = "";
                    firstMember = firstMember + temp;
                    displayLabel.setText(firstMember);
                }
            }
        }
        updateLog("= was clicked");
    }

    public void exit() {
        closeLog(finalRecord);
        System.exit(0);
    }

}
