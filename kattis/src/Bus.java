import java.util.Scanner;

public class Bus {
    public int n;
    Scanner sc = new Scanner(System.in);
    public void stop() {
        n = sc.nextInt();
        int [] a = null;
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]*2);
        }

    }
}
