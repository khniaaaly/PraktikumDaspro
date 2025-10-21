package jobsheet7;

import java.util.Scanner;

public class SiakadWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jumlah, i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = sc.nextInt();

        while (i < jumlah) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidka valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + "adalah A");
            }
        }
    }

}