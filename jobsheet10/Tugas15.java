package jobsheet10;

import java.util.Scanner;

public class Tugas15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] suhu = new double[5][7];

        String[] namaKota = { "Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha" };

        int kota, hari;
        double tempSuhu;
        String next;

        while (true) {
            System.out.println("\n=== INPUT SUHU ===");
            System.out.println("Kota:");
            System.out.println("0. Tokyo");
            System.out.println("1. Osaka");
            System.out.println("2. Sapporo");
            System.out.println("3. Fukuoka");
            System.out.println("4. Naha");

            System.out.print("Masukkan nomor kota (0-4): ");
            kota = sc.nextInt();

            System.out.print("Masukkan hari ke (0-6): ");
            hari = sc.nextInt();

            System.out.print("Masukkan suhu: ");
            tempSuhu = sc.nextDouble();

            suhu[kota][hari] = tempSuhu;

            sc.nextLine();

            System.out.print("Input data lagi? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\n=== PROGRAM SELESAI ===");
    }
}