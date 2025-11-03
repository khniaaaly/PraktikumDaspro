package jobsheet8;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahCabang;
        int totalPelangganSemua = 0;
        int totalItemSemua = 0;

        System.out.println("=== SISTEM PENJUALAN HARIAN KOPI SENJA ===");
        System.out.print("Masukkan jumlah cabang: ");
        jumlahCabang = sc.nextInt();

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang ke-" + i + " ---");
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Masukkan jumlah item yang dipesan oleh pelanggan ke-" + j + ": ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang ke-" + i + " melayani " + jumlahPelanggan + " pelanggan.");
            System.out.println("Total item terjual di cabang ini: " + totalItemCabang);

            totalPelangganSemua += jumlahPelanggan;
            totalItemSemua += totalItemCabang;
        }

        System.out.println("\n===== RINGKASAN PENJUALAN SELURUH CABANG =====");
        System.out.println("Total pelanggan dari semua cabang : " + totalPelangganSemua);
        System.out.println("Total item terjual dari semua cabang : " + totalItemSemua);
        System.out.println("========================================================");
    }
}