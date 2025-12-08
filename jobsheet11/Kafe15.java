package jobsheet11;

import java.util.Scanner;

public class Kafe15 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam   - Rp 15,000");
        System.out.println("2. Cappuccino   - Rp 20,000");
        System.out.println("3. Latte        - Rp 22,000");
        System.out.println("4. Teh Tarik    - Rp 12,000");
        System.out.println("5. Roti Bakar   - Rp 10,000");
        System.out.println("6. Mie Goreng   - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
        System.out.println("===== SILAHKAN PILIH MENU =====");
    }

    static int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Budi", true);

        double totalHargaAwal = 0;
        String pesanLagi;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int menu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int jumlah = sc.nextInt();
            sc.nextLine();

            int subtotal = hargaItems[menu - 1] * jumlah;
            totalHargaAwal += subtotal;

            System.out.println("Total pesanan ini: Rp " + subtotal);

            System.out.print("Pesan menu lain? (y/n): ");
            pesanLagi = sc.nextLine();

        } while (pesanLagi.equalsIgnoreCase("y"));

        System.out.print("\nMasukkan kode promo (DISKON50/DISKON30/kosong): ");
        String kodePromo = sc.nextLine();

        double potonganPromo = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            potonganPromo = totalHargaAwal * 0.5;
            System.out.println("\nDISCOUNT APPLIED: 50% (Rp " + potonganPromo + ")");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            potonganPromo = totalHargaAwal * 0.3;
            System.out.println("\nDISCOUNT APPLIED: 30% (Rp " + potonganPromo + ")");
        } else if (!kodePromo.equalsIgnoreCase("kosong") && !kodePromo.isEmpty()) {
            System.out.println("\nKode promo invalid! Tidak ada diskon promo.");
        }

        double potonganMember = totalHargaAwal * 0.10;
        System.out.println("MEMBER DISCOUNT (10%): Rp " + potonganMember);

        double totalPotongan = potonganPromo + potonganMember;

        double totalHarusBayar = totalHargaAwal - totalPotongan;

        System.out.println("\n------------------------------------");
        System.out.println("Total Harga Awal     : Rp " + totalHargaAwal);
        System.out.println("Total Potongan Diskon: Rp " + totalPotongan);
        System.out.println("Yang Harus Dibayar   : Rp " + totalHarusBayar);
        System.out.println("------------------------------------");
    }
}