package jobsheet8;

import java.util.Scanner;

public class Star15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

}
