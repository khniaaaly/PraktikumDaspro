package jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double rata2;
        int jumlahMhs;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahsiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        if (jumlahLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + (totalLulus / jumlahLulus));
        } else {
            System.out.println("Rata-rata nilai lulus = 0");
        }

        if (jumlahTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / jumlahTidakLulus));
        } else {
            System.out.println("Rata-rata nilai tidak lulus = 0");
        }
    }
}