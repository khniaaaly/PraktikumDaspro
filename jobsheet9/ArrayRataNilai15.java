package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double rata2;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        int jumlahLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total / nilaiMhs.length;

        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Banyaknya mahasiswa yang lulus (>70) = " + jumlahLulus);
    }
}