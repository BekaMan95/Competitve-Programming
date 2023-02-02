import java.util.*;

public class Akcija {
    private int n, d, sum=0, chip=0;
    Scanner sc = new Scanner(System.in);
    List<Integer> a = new ArrayList<>();

    public void main() {
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        if (n%3 == 0)
        {
            d=n/3;
            for (int i=0;i<a.size();i++)
            {
                sum = sum + a.get(i);
                for (int j=0;j<a.size();j++)
                {
                    if(a.get(j) < a.get(i))
                        chip = chip + a.get(j);
                }
            }
            System.out.println(sum-chip);
        }
        else
        {

        }
    }
}
