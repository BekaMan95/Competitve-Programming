import java.util.Scanner;

import static java.lang.Math.pow;

public class printer {
    public void print() {
        int n, o = 0, p = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (pow(2, p) >= n) {
                o = p + 1;
            } else
                p++;
        }
        System.out.println(o);
    }
}
//Done!