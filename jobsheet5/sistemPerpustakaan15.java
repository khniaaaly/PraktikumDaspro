package jobsheet5;

import java.util.Scanner;

public class sistemPerpustakaan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kartuMahasiswa, registrasiOnline;

        System.out.println("---Izin Masuk Perpustakaan---");
        System.out.println("Apakah mahasiswa membawa kartu mahasiswa? (True/False) ");
        kartuMahasiswa = sc.nextBoolean();
        System.out.println("Apakah mahasiswa sudah registrasi online? (True/False) ");
        registrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Mahasiswa Boleh Masuk");
        } else {
            System.out.println("Mahasiswa Ditolak Masuk");
        }
    }
}
