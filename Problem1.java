package problems;

import java.util.Scanner;

class Calculator {
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}

public class Problem1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter value of a: ");
    double a = sc.nextDouble();

    System.out.print("Enter value of b: ");
    double b = sc.nextDouble();

    System.out.print("Enter operation (+, -, *, /): ");
    String op = sc.next();

    Calculator c = new Calculator();
    double result = 0;

    if (op.equals("+")) {
        result = c.add(a, b);
    } else if (op.equals("-")) {
        result = c.subtract(a, b);
    } else if (op.equals("*")) {
        result = c.multiply(a, b);
    } else if (op.equals("/")) {
        result = c.divide(a, b);
    } else {
        System.out.println("Invalid operation");
        sc.close();
        return;
    }

    System.out.println("Result: " + result);
    sc.close();
  }
}

