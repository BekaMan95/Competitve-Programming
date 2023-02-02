import java.util.Scanner;

public class RectangleArea {
    double x1,x2,y1,y2,w,h;
    double o=0.000;
    Scanner sc = new Scanner(System.in);
    public void calc(){
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        if(x1<0&&x2>0)
            w = (-1)*x1 + x2;
        else if (x1>0&&x2<0)
            w = x1 + (-1)*x2;
        else {
            w = x1 - x2;
            if(w<0)
                w = (-1)*w;
            else
                w = w;
        }
        if(y1<0&&y2>0)
            h = (-1)*y1 + y2;
        else if (y1>0&&y2<0)
            h = y1 + (-1)*y2;
        else {
            h = y1 - y2;
            if(h<0)
                h = (-1)*h;
            else
                h = h;
        }
        o = w*h;
        System.out.printf("%.3f",o);
    }
}
//Done!