package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 1;
            int b = 0;
            divisionOfTwoNumbers(a, b);
        } catch (MyException e) {
            System.out.println(e.getError());
        }
    }

    public static void divisionOfTwoNumbers(int a, int b) throws MyException {
        try {
            int quotient = a / b;
            System.out.println(quotient);
        } catch (Exception e) {
            throw new MyException("Error dividing by 0");
        }

    }

}
