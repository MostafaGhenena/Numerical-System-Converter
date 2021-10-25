
package Numerical_System_Converter;

import java.util.ArrayList;

public class Decimal {
    public String D2B (long n){
        int d=1,c=0;
        ArrayList <Integer> a = new ArrayList <Integer> ();
        while (d<n){
            d*=2;
            c++;
        }
        d/=2;
        for (int x = 0 ; x<c ; x++){
            if (n>=d){
                n-=d;
                a.add(1);
                d/=2;
            }
            else {
                d/=2;
                a.add(0);
            }
        }
        long b=0;
        for (int x = 0 ; x<a.size() ; x++){
            b=b*10+a.get(x);
        }
        String ss;
        ss = Long.toString(b);
        return ss;
    }
    public String D2O (long n){
        Decimal d1 = new Decimal();
        String x;
        x=d1.D2B(n);
        Binary b1 = new Binary();
        String z;
        z=b1.B2O(Long.parseLong(x));
        return z;
    }
    public String D2H (long n){
        Decimal d1 = new Decimal();
        String x;
        x=d1.D2B(n);
        Binary b1 = new Binary();
        String hh;
       hh=b1.B2H(Long.parseLong(x));
        return hh;
    }
}
