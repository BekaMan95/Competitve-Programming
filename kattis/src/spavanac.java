import java.util.Scanner;

public class spavanac {
    static void rewind() {
        int m, h, min, hr;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();
        if (h<1)
            hr = 23;
        else
            hr = h-1;
        if (m<45)
            min = m+15;
        else {
            hr = h;
            min = m - 45;
        }
        System.out.println(hr+" "+min);
    }
}
//Done!