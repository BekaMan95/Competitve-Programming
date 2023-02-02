import java.util.Scanner;

public class Nsum {
    public void maina() {
        int n,o=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] ar = new int[n];
        for (int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
            o = o + ar[i];
        }
        System.out.println(o);
    }
}
//Done!