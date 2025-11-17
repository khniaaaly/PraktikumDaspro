package jobsheet9;

import java.util.Scanner;

public class Tugas215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk \"" + namaPesanan[i] + "\": ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();
        }

        int total = 0;
        for (int harga : hargaPesanan) {
            total += harga;
        }

        System.out.println("\n=== DAFTAR PESANAN ANDA ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("\nTotal biaya seluruh pesanan: Rp " + total);
    }
}