package jobsheet9;

import java.util.Scanner;

public class Tugas315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
                "Nasi Goreng",
                "Mie Goreng",
                "Roti Bakar",
                "Kentang Goreng",
                "Teh Tarik",
                "Cappucino",
                "Chocolate Ice"
        };

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String key = sc.nextLine();

        boolean ditemukan = false;
        int index = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                ditemukan = true;
                index = i;
                break;
            }
        }

        System.out.println();

        if (ditemukan) {
            System.out.println("Makanan \"" + key + "\" tersedia di menu (posisi ke-" + (index + 1) + ").");
        } else {
            System.out.println("Makanan \"" + key + "\" tidak ditemukan di menu.");
        }
    }
}
