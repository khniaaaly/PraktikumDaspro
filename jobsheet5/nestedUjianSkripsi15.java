package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan, bebasKompen;
        int bimbinganP1, bimbinganP2;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        bebasKompen = sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        bimbinganP1 = sc.nextInt();
        System.err.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian Skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
}