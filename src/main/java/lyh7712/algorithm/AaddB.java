package lyh7712.algorithm;

import java.util.Scanner;

public class AaddB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.println("Case #" + i + ": " + (in.nextInt() + in.nextInt()));
        }

    }
}
