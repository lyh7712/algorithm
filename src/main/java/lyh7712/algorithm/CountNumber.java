package lyh7712.algorithm;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1 = Integer.parseInt(scan.nextLine().trim());
        int val2 = Integer.parseInt(scan.nextLine().trim());
        int val3 = Integer.parseInt(scan.nextLine().trim());

        int value = val1 * val2 * val3;
        int numArray[] = new int[10];

        while (value != 0) {
            int data = value % 10;
            numArray[data]++;

            value /= 10;
        }

        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }

    }


}
