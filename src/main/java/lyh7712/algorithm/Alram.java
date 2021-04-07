package lyh7712.algorithm;

import java.util.Scanner;

public class Alram {

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        int t, m;
        t = id.nextInt();
        m = id.nextInt();

        if (m >= 45) {
            m = m - 45;
            System.out.printf("%d %d", t, m);

        } else if (m < 45) {
            if (t > 0) {
                t = t - 1;
                m = m + 15;
                System.out.printf("%d %d", t, m);

            } else if (t == 0) {
                t = 23;
                m = m + 15;
                System.out.printf("%d %d", t, m);
            }
        }
    }
}
