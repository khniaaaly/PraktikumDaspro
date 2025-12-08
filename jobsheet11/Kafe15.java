package jobsheet11;

import java.util.Scanner;

public class Kafe15 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int hargaAkhir = hargaTotal;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            double potongan = hargaTotal * 0.5;
            System.out.println("DISCOUNT APPLIED: 50% (Rp " + potongan + ")");
            hargaAkhir -= potongan;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            double potongan = hargaTotal * 0.3;
            System.out.println("DISCOUNT APPLIED: 30% (Rp " + potongan + ")");
            hargaAkhir -= potongan;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid! Tidak ada diskon yang diterapkan.");
        }

        return hargaAkhir;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan kode promo (DISKON50/DISKON30/kosong): ");
        String kodePromo = sc.nextLine();

        double totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}