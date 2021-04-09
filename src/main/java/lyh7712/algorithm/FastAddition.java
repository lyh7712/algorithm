package lyh7712.algorithm;

import java.util.Scanner;

public class FastAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int a = 0;
        int b = 0;
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            result[i] = a + b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
