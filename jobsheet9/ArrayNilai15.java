package jobsheet9;

import java.util.Scanner;

public class ArrayNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        int i;

        for (i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " Lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + i + " Tidak Lulus!");
            }
        }
    }
}