package jobsheet5;

import java.util.Scanner;

public class aksesWifiKampus15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pengguna, dosen, mahasiswa;
        int SKS;

        System.out.println("---Akses WiFI Kampus---");
        System.out.println("Masukkan jenis pengguna (dosen, mahasiswa) ");
        pengguna = sc.nextLine().trim();

        if (pengguna == "dosen") {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (pengguna == "mahasiswa") {
            System.out.println("Masukkan Jumlah SKS yang diambil: ");
            SKS = sc.nextInt();

            if (pengguna == "mahasiswa" && SKS >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else if (pengguna == "mahasiswa" && SKS < 12) {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses Ditolak");
        }
    }

}
