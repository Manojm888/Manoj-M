package problems;

import java.util.HashMap;

public class Problem4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    // increase count
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + countMap.get(i));
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
