package jobsheet7;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;
        int biaya;

        System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
        jenis = sc.nextInt();

        while (jenis != 0) {
            String namaKendaraan = "";

            if (jenis == 1) {
                namaKendaraan = "Mobil";
            } else if (jenis == 2) {
                namaKendaraan = "Motor";
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                System.out.print("\nMasukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
                jenis = sc.nextInt();
                continue;
            }

            System.out.print("Masukkan durasi parkir untuk " + namaKendaraan + " (jam): ");
            durasi = sc.nextInt();

            // Hitung biaya
            if (durasi > 5) {
                biaya = 12500;
            } else if (jenis == 1) {
                biaya = durasi * 3000;
            } else {
                biaya = durasi * 2000;
            }

            // Tampilkan biaya kendaraan saat ini
            System.out.println(namaKendaraan + " parkir selama " + durasi + " jam = Rp " + biaya);

            // Tambahkan ke total keseluruhan
            total += biaya;

            System.out.println("-------------------------------------------------------------------");
            System.out.print("Masukkan jenis kendaraan berikutnya (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();
        }

        System.out.println("\n====================================================================");
        System.out.println("Total pembayaran parkir seluruh kendaraan: Rp " + total);
        System.out.println("Terima kasih telah menggunakan layanan parkir!");
        System.out.println("======================================================================");
    }
}