import java.util.Scanner;

public class JudgingMoose {
    private int l,r;
    Scanner sc = new Scanner(System.in);
    public void judge(){
        l= sc.nextInt();
        r = sc.nextInt();
        if(l==0&&r==0)
            System.out.println("Not a moose");
        else if (l>r)
            System.out.println("Odd "+l*2);
        else if (r>l)
            System.out.println("Odd "+r*2);
        else
            System.out.println("Even "+(r+l));
    }
}
//Done!