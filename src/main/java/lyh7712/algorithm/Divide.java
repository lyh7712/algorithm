package lyh7712.algorithm;

import java.util.Scanner;

public class Divide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] number = new int[1000];

        int a = 42;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            num[i] = n % a;
        }

        for (int i = 0; i < num.length; i++) {
            number[num[i]]++;
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}

