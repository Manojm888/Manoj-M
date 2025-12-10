package problems;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int a = sc.nextInt();

        if (a <= 0) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        for (int i = 0; i < a; i++) {
            int odd = 2 * i + 1;
            if (i == a - 1) {
                System.out.print(odd);
            } else {
                System.out.print(odd + ", ");
            }
        }

        System.out.println();
        sc.close();
    }
}
