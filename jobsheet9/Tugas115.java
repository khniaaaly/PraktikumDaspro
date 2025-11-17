package jobsheet9;

import java.util.Scanner;

public class Tugas115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        double total = 0;
        for (int n : nilai) {
            total += n;
        }
        double rataRata = total / nilai.length;

        int max = nilai[0];
        int min = nilai[0];

        for (int n : nilai) {
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }

        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nRata-rata nilai = " + rataRata);
        System.out.println("Nilai tertinggi = " + max);
        System.out.println("Nilai terendah  = " + min);
    }
}