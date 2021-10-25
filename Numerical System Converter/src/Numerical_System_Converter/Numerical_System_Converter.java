
package Numerical_System_Converter;

import java.util.Scanner;

public class Numerical_System_Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d;
        int n;
        String nn;
        Binary b1 = new Binary();
        Decimal d1 = new Decimal();
        Octal o1 = new Octal();
        HexaDecimal h1 = new HexaDecimal();
        System.out.println("Da Binary a Decimal inserisci 1");
        System.out.println("Da Binary a Octal inserisci 2");
        System.out.println("Da Binary a HexaDecimal inserisci 3");
        System.out.println("Da Decimal a Binary inserisci 4");
        System.out.println("Da Decimal a Octal inserisci 5");
        System.out.println("Da Decimal a HexaDecimal inserisci 6");
        System.out.println("Da Octal a Binary inserisci 7");
        System.out.println("Da Octal a Decimal inserisci 8");
        System.out.println("Da Octal a HexaDecimal inserisci 9");
        System.out.println("Da HexaDecimal a Binary inserisci 10");
        System.out.println("Da HexaDecimal a Decimal inserisci 11");
        System.out.println("Da HexaDecimal a Octal inserisci 12");
        System.out.print("Inserisci la tua scelta : ");
        d=sc.nextInt();
        if (d==1){
            System.out.print("Inserici il codice : ");
            n=sc.nextInt();
            System.out.println(b1.B2D(n));
        }
        else if (d==2){
            System.out.print("Inserici il codice : ");
            n=sc.nextInt();
            System.out.println(b1.B2O(n));
        }
        else if (d==3){
            System.out.print("Inserici il codice : ");
            n=sc.nextInt();
            System.out.println(b1.B2H(n));
        }
        else if (d==4){
            System.out.print("Inserici il codice : ");
            n=sc.nextInt();
            System.out.println(d1.D2B(n));
        }
        else if (d==5){
            System.out.print("Inserici il codice : ");
            n=sc.nextInt();
            System.out.println(d1.D2O(n));
        }
        else if (d==6){
            System.out.print("Inserici il codice : ");
            n=sc.nextInt();
            System.out.println(d1.D2H(n));
        }
        else if (d==7){
            System.out.print("Inserici il codice : ");
            n=sc.nextInt();
            System.out.println(o1.O2B(n));
        }
        else if (d==8){
            System.out.print("Inserici il codice : ");
            n=sc.nextInt();
            System.out.println(o1.O2D(n));
        }
        else if (d==9){
            System.out.print("Inserici il codice : ");
            n=sc.nextInt();
            System.out.println(o1.O2H(n));
        }
        else if (d==10){
            System.out.print("Inserici il codice : ");
            nn=sc.next();
            System.out.println(h1.H2B(nn));
        }
        else if (d==11){
            System.out.print("Inserici il codice : ");
            nn=sc.next();
            System.out.println(h1.H2D(nn));
        }
        else if (d==12){
            System.out.print("Inserici il codice : ");
            nn=sc.next();
            System.out.println(h1.H2O(nn));
        }
    }

    
}
