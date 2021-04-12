package lyh7712.algorithm;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num - i; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
