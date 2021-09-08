package com.company;

public class Main {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        circleArea();
        System.out.println("boo!") + 7;


    }
}
/* 1.
java: method circleArea in class com.company.Main cannot be applied to given types;
  required: double
  found:    no arguments
  reason: actual and formal argument lists differ in length

  Result of 'Main.circleArea()' is ignored
 */
/* 2.
java: not a statement

  Operator '+' cannot be applied to 'void', 'int'
 */