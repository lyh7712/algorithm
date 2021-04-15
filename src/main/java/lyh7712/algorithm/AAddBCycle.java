package lyh7712.algorithm;

import java.util.Scanner;

public class AAddBCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fn = sc.nextInt();
        int cnt = 0;
        int x = fn;

        while (true) {
            if (x < 10) {
                x = 10 * x + x;
                cnt++;
            } else {
                x = ((x % 10 + x / 10) % 10) + 10 * (x % 10);
                cnt++;
            }
            if (x == fn) break;
        }
        System.out.println(cnt);
    }

}
