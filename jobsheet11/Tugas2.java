package jobsheet11;

import java.util.Scanner;

public class Tugas2 {

    public static void isianArray(Scanner sc, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] arr) {
        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + arr[i]);
        }
    }

    public static int hitTot(int[] arr) {
        int total = 0;
        for (int v : arr)
            total += v;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();
        int[] nilai = new int[N];

        isianArray(sc, nilai);
        tampilArray(nilai);

        double total = hitTot(nilai);
        System.out.println("Total nilai seluruh mahasiswa: " + total);
    }
}