import java.util.Scanner;

public class NinetyNineProblems {
    Scanner sc = new Scanner(System.in);
    private Integer n;
    private String Nine = "";
    public void main(){
        n = sc.nextInt();
        String o = n.toString(), z = n.toString().substring(1);
        String lead = String.valueOf(o.charAt(0));
        int s = z.length();
        for (int i=0;i<s;i++)
        {
            Nine = Nine.concat(String.valueOf(9));
        }

        System.out.println(lead+Nine);
    }
}
