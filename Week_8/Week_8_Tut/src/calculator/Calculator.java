package calculator;

import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        CalculatorFrame myCalc = new CalculatorFrame();
        myCalc.setSize(600,400);
        myCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myCalc.setVisible(true);// always last, after everything is added
    }
}
