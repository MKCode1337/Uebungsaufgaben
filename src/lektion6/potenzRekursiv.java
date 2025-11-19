package lektion6;

import java.util.Scanner;

public class potenzRekursiv {
    public static double potenz(double x,int n){
        if(n==0) return x=1;
        else if (n>0)
            return x*potenz(x,n-1);

        else
            return 1/potenz(x,(-n));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Geben Sie eine Basis ein: ");
        int x=sc.nextInt();
        System.out.println("Geben Sie eine Potenz ein: ");
        int n=sc.nextInt();
        System.out.println(x+ " hoch "+n+" ergibt "+potenz(x,n));
    }
}
