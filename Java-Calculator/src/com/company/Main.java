package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Insert a number corresponding to the required operation:\n1-add\t2-sub\n3-multiple\t4-divide\n5-Exit");
            int op = in.nextInt();
            if(op == 5){
                break;
            }
            System.out.print("Insert 1st Number: ");
            int a = in.nextInt();
            System.out.print("Insert 2nd Number: ");
            int b = in.nextInt();
            while (op == 4 && b == 0) {
                System.out.println("Invalid Input! Cannot Divide by Zero");
                System.out.print("Insert 1st Number: ");
                a = in.nextInt();
                System.out.print("Insert 2nd Number: ");
                b = in.nextInt();
            }
            if (op == 1) {
                System.out.println("Answer: " + add(a, b));
            } else if (op == 2) {
                System.out.println("Answer: " + add(a, -1* b));
            } else if(op == 3){
                System.out.println("Answer: " + multiply(a, b));
            } else if(op == 4){
                System.out.println("Answer: " + divide(a, b));
            }

        }
    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static double divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double)((double)a/(double)b);
    }
}
