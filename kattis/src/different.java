import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

public class different {
    public void differ() {
        List <String> an = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        do {
            an.add(sc.next());
        }
            while (an.contains(null));
        while (an.iterator().hasNext()){
            int i=0;
            BigInteger a = new BigInteger(an.get(i));
            BigInteger b = new BigInteger(an.get(i++));
            BigInteger bigDiff = a.subtract(b);
            if(bigDiff.intValue()<0) {
                System.out.println(bigDiff.negate());
            }
            else
                System.out.println(bigDiff);
            i = i+2;
        }
        /*an = sc.next();
        bn = sc.next();
        BigInteger a = new BigInteger(an);
        BigInteger b = new BigInteger(bn);
        BigInteger bigDiff = a.subtract(b);
        */

    }
}
//Waitng for answer