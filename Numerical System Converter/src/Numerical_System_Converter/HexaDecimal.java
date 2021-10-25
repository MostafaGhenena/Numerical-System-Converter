
package Numerical_System_Converter;

import java.util.ArrayList;

public class HexaDecimal {
    
    public String H2B (String nn){
        ArrayList <Integer> a = new ArrayList <Integer> ();
        int l=nn.length(),c=0;
        char s;
        for (int x = 0 ; x<l ;x++ ){
            s=nn.toCharArray()[x];
            if (Character.compare('0', s)==0){
                a.add(0);
            }
            else if (Character.compare('1', s)==0){
                a.add(0);
                a.add(0);
                a.add(0);
                a.add(1);
            }
            else if (Character.compare('2', s)==0){
                a.add(0);
                a.add(0);
                a.add(1);
                a.add(0);
            }
            else if (Character.compare('3', s)==0){
                a.add(0);
                a.add(0);
                a.add(1);
                a.add(1);
            }
            else if (Character.compare('4', s)==0){
                a.add(0);
                a.add(1);
                a.add(0);
                a.add(0);
            }
            else if (Character.compare('5', s)==0){
                a.add(0);
                a.add(1);
                a.add(0);
                a.add(1);
            }
            else if (Character.compare('6', s)==0){
                a.add(0);
                a.add(1);
                a.add(1);
                a.add(0);
            }
            else if (Character.compare('7', s)==0){
                a.add(0);
                a.add(1);
                a.add(1);
                a.add(1);
            }
            else if (Character.compare('8', s)==0){
                a.add(1);
                a.add(0);
                a.add(0);
                a.add(0);
            }
            else if (Character.compare('9', s)==0){
                a.add(1);
                a.add(0);
                a.add(0);
                a.add(1);
            }
            else if (Character.compare('A', s)==0){
                a.add(1);
                a.add(0);
                a.add(1);
                a.add(0);
            }
            else if (Character.compare('B', s)==0){
                a.add(1);
                a.add(0);
                a.add(1);
                a.add(1);
            }
            else if (Character.compare('C', s)==0){
                a.add(1);
                a.add(1);
                a.add(0);
                a.add(0);
            }
            else if (Character.compare('D', s)==0){
                a.add(1);
                a.add(1);
                a.add(0);
                a.add(1);
            }
            else if (Character.compare('E', s)==0){
                a.add(1);
                a.add(1);
                a.add(1);
                a.add(0);
            }
            else if (Character.compare('F', s)==0){
                a.add(1);
                a.add(1);
                a.add(1);
                a.add(1);
            }
            else {
                c=5;
            }
        }
        long b=0;
        for (int x = 0 ; x<a.size() ; x++){
            b=b*10+a.get(x);
        }
        String ss;
        ss=Long.toString(b);
        if (c==5){
            return "Errore";
        }
        else {
        return ss; 
        }
    }
    
    public String H2D (String nn){
       HexaDecimal h1 = new HexaDecimal();
       String x;
       if(h1.H2B(nn)=="Errore"){
           return "Errore";
       }
       else {
           x=h1.H2B(nn);
       Binary b1 = new Binary();
       String z;
       z=b1.B2D(Long.parseLong(x));
        return z ;
       }
    }
    public String H2O (String nn){
       HexaDecimal h1 = new HexaDecimal();
       String x;
       if(h1.H2B(nn)=="Errore"){
           return "Errore";
       }
       else {
           x=h1.H2B(nn);
       Binary b1 = new Binary();
       String z;
       z=b1.B2O(Long.parseLong(x));
        return z ;
       }
    }
}
