package jobsheet11;

import java.util.Scanner;

public class Tugas3 {
    public static void inputPenjualan(Scanner sc, int[][] data, String[] namaMenu) {
        System.out.println("\n----- Input Data Penjualan -----");
        for (int m = 0; m < data.length; m++) {
            System.out.println("\nMenu: " + namaMenu[m]);
            for (int h = 0; h < data[0].length; h++) {
                System.out.print("Penjualan hari ke-" + (h + 1) + ": ");
                data[m][h] = sc.nextInt();
            }
        }
    }

    public static void tampilDataPerHari(String[] namaMenu, int[][] data) {
        System.out.println("\n----- Rekap Data Penjualan per Hari -----");
        for (int m = 0; m < namaMenu.length; m++) {
            System.out.println("\nMenu: " + namaMenu[m]);
            for (int h = 0; h < data[m].length; h++) {
                System.out.println("Penjualan Hari ke-" + (h + 1) + ": " + data[m][h]);
            }
        }
    }

    public static void tampilTabel(int[][] data, String[] namaMenu) {
        System.out.println("\n===== DATA PENJUALAN =====\n");
        System.out.printf("%-12s", "Menu");
        for (int h = 0; h < data[0].length; h++) {
            System.out.printf("Hari %-3d", (h + 1));
        }
        System.out.println();

        for (int m = 0; m < data.length; m++) {
            System.out.printf("%-12s", namaMenu[m]);
            for (int h = 0; h < data[0].length; h++) {
                System.out.printf("%-8d", data[m][h]);
            }
            System.out.println();
        }
    }

    public static void menuTertinggi(String[] namaMenu, int[][] data) {
        int maxTotal = -1;
        int idxMax = 0;

        for (int m = 0; m < data.length; m++) {
            int sum = 0;
            for (int h = 0; h < data[m].length; h++) {
                sum += data[m][h];
            }

            if (sum > maxTotal) {
                maxTotal = sum;
                idxMax = m;
            }
        }

        System.out.println("\n==== MENU DENGAN PENJUALAN TERTINGGI ====");
        System.out.println("Menu\t\t\t: " + namaMenu[idxMax]);
        System.out.println("Total penjualan (" + data[idxMax].length + " hari): " + maxTotal);
    }

    public static void rataRataMenu(String[] namaMenu, int[][] data) {
        System.out.println("\n==== RATA-RATA PENJUALAN PER MENU ====");
        for (int m = 0; m < data.length; m++) {
            int sum = 0;
            for (int h = 0; h < data[0].length; h++) {
                sum += data[m][h];
            }

            int rata = (int) sum / data[0].length;
            System.out.printf("%-10s : %.1s per-hari\n", namaMenu[m], rata);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jm = sc.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        int jh = sc.nextInt();

        String[] namaMenu = new String[jm];
        int[][] data = new int[jm][jh];

        System.out.println("\n===== Nama Menu =====");
        for (int i = 0; i < jm; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            namaMenu[i] = sc.next();
        }

        inputPenjualan(sc, data, namaMenu);
        tampilDataPerHari(namaMenu, data);
        tampilTabel(data, namaMenu);
        menuTertinggi(namaMenu, data);
        rataRataMenu(namaMenu, data);
    }
}
