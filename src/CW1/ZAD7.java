package CW1;

import java.util.Scanner;

public class ZAD7 {

    public static void start(){
        int n = readN();
        printN(n);
    }

    public static int readN(){
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while( n < 5 || (n % 2 == 0)){
            System.out.print("Podaj nieparzysta liczbe wieksza lub rowna 5: " );
            n = scanner.nextInt();
        }

        scanner.close();
        return n;
    }

    public static void printN(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i == 0 || j == 0 || i+1 == n || j + 1 == n || i == j ) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
