
package Numerical_System_Converter;

import java.util.ArrayList;
import java.util.Collections;

public class Octal {
    public String O2B (long n){
        int d=4,c=0,cc=0;
        long t=n, nn=0;
        ArrayList <Integer> a = new ArrayList <Integer> ();
        while(t!=0){
            t/=10;
            c++;
        }
        for (int x = 0 ; x<c ; x++){
            nn=nn*10+n%10;
            n/=10;
        }
        for (int x = 0 ; x<c ; x++){
            t=nn%10;
            nn/=10;
            while (cc<3){
                cc++;
                if (t>=d){
                    a.add(1);
                    t-=d;
                    d/=2; 
                }
                else {
                    a.add(0);
                    d/=2;
                }
            }
            cc=0;
            d=4;
        }
        long b=0;
        for (int x = 0 ; x<a.size() ; x++){
            b=b*10+a.get(x);
        }
        String ss;
        ss=Long.toString(b);
        return ss;
    }
    public String O2D (long n){
        Octal o1 = new Octal();
        String x;
        x=o1.O2B(n);
        Binary b1 = new Binary();
       String z;
       z=b1.B2D(Long.parseLong(x));
       return z ;
    }
    public String O2H (long n){
        Octal o1 = new Octal();
        String x;
        x=o1.O2B(n);
        Binary b1 = new Binary();
       String hh ;
       hh=b1.B2H(Long.parseLong(x));
        return hh ;
    }
}
