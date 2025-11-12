package lektion6;

import java.util.Scanner;

public class potenzRekursiv {
    public static int potenz(int x,int n){
        if(n==0) return x=1;
        return x*potenz(x,n-1);
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
