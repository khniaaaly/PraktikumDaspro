package jobsheet9;

import java.util.Scanner;

public class SearchNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = sc.nextInt();

        int[] arrNilai = new int[jumlah];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasilIndex = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasilIndex = i;
                break;
            }
        }

        System.out.println();

        if (hasilIndex != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasilIndex + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}