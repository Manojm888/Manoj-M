package problems;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for (int i = 1, count = 0; count < a; i += 2) {
            System.out.print(i);
            if (count < a - 1) {
                System.out.print(", ");
            }
            count++;
        }

        sc.close();
    }
}
