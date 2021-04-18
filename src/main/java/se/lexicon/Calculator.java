package se.lexicon;


import java.util.Scanner;

public class Calculator {

    public static void main(String[]args) {

        char operator;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("What Operator do u want to use (+, -, *, /) and then Enter");
        operator = input.next().charAt(0);

        System.out.println("Enter the two numbers");

        num1 = input.nextDouble();
        num2 = input.nextDouble();

        input.close();

        switch (operator) {
            case '+':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 + num2));
                break;

            case '-':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 - num2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;

            case '/':
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                break;


        }


    }



    }

