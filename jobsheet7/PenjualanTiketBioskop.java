package jobsheet7;

import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int totalTiket = 0;
        int jumlahTransaksi, hitung = 1;
        int jumlahTiket;
        double totalPendapatan = 0;
        double totalHarga, diskon = 0;

        System.out.print("Total Transaksi Hari Ini: ");
        jumlahTransaksi = sc.nextInt();

        while (hitung <= jumlahTransaksi) {
            while (true) {
                System.out.print("Jumlah Tiket Pelanggan ke-" + hitung + ": ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Input Tidak Valid! Jumlah Tiket Tidak Boleh Negatif. Silahkan Input Ulang.");
                    continue; // kembali ke awal while
                }
                break; // keluar dari while jika input valid
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHarga -= totalHarga * diskon;
            totalTiket += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.println("Total Harga Transaksi ke-" + hitung + ": Rp." + totalHarga);
            if (diskon > 0) {
                System.out.println("Diskon diterapkan: " + (int) (diskon * 100) + "%");
            }
            System.out.println();

            hitung++;
        }
        System.out.println("===============================");
        System.out.println("Total Tiket Terjual : " + totalTiket);
        System.out.println("Total Pendapatan    : Rp " + totalPendapatan);
        System.out.println("===============================");
    }
}