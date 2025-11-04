package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahsiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Jumlah mahasiswa yang lulus = " + lulus);
    }
}