
package Numerical_System_Converter;

import java.util.ArrayList;
import java.util.Collections;


public class Binary {
    public String B2B (long n){
        int s=0,x=0, c=0;
        long no=n, m;
        while (c==0){
            m=no%10;
            no/=10;
            if (m!=1 && m!=0){
                c=5;
                n=0;
            }
            if (no==0){
                c=1;
            }
        }
        if (c==5){
            n=0;
            return "Errore";
        }
        else {
            return Long.toString(n);
        }
    }
    public String B2D (long n){
        int s=0,x=0,c=0;
        long no=n, m;
        while (c==0){
            m=no%10;
            no/=10;
            if (m!=1 && m!=0){
                c=5;
            }
            if (no==0){
                c=1;
            }
        }
        String ss;
        while (n!=0){
            s+= (n%10)*Math.pow(2, x);
            n/=10;
            x++;
        }
        if (c==5){
            ss="Errore";
        }
        else {
            ss=Integer.toString(s);
        }
        
        return ss;
    }
    public String B2O(long n){
        ArrayList <Integer> a = new ArrayList <Integer> ();
        int s=0,x=0,c=0;
        long no=n, m;
        while (c==0){
            m=no%10;
            no/=10;
            if (m!=1 && m!=0){
                c=5;
                n=0;
            }
            if (no==0){
                c=1;
            }
        }
        String ss;
        while (n!=0){
            s+= (n%10)*Math.pow(2, x);
            n/=10;
            if (x==2){
                x=-1;
                a.add(s);
                s=0;
            }
            if(n==0){
                a.add(s);
            }
            x++;
        }
        Collections.reverse(a);
        long b=0;
        for (int z = 0 ; z<a.size() ; z++){
            b=b*10+a.get(z);
        }
        if (c==5){
            ss="Errore";
        }
        else {
            ss=Long.toString(b);
        }
        
        return ss;
    }
    public String B2H(long n){
        
        ArrayList <String> a = new ArrayList <String> ();
        int s=0,x=0,c=0;
        long no=n, m;
        while (c==0){
            m=no%10;
            no/=10;
            if (m!=1 && m!=0){
                c=5;
                n=0;
            }
            if (no==0){
                c=1;
            }
        }
        String ss;
        while (n!=0){
            s+= (n%10)*Math.pow(2, x);
            n/=10;
            if (x==3){
                x=-1;
                if(s==10){
                    a.add("A");
                }
                else if(s==11){
                    a.add("B");
                }
                else if(s==12){
                    a.add("C");
                }
                else if(s==13){
                    a.add("D");
                }
                else if(s==14){
                    a.add("E");
                }
                else if(s==15){
                    a.add("F");
                }
                else{
                    a.add(Integer.toString(s));
                }
                s=0;
            }
            if(n==0){
                if(s==10){
                    a.add("A");
                }
                else if(s==11){
                    a.add("B");
                }
                else if(s==12){
                    a.add("C");
                }
                else if(s==13){
                    a.add("D");
                }
                else if(s==14){
                    a.add("E");
                }
                else if(s==15){
                    a.add("F");
                }
                else{
                    a.add(Integer.toString(s));
                }
            }
            x++;
        }
        Collections.reverse(a);
        String aa="";
        for(int y=0 ; y<a.size();y++){
        aa=aa+a.get(y);
        }
        if (c==5){
            ss="Errore";
        }
        else {
            ss=aa;
        }
        return ss;
    }
}
