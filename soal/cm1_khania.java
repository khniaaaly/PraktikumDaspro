import java.util.Scanner;

public class cm1_khania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uts1, uas1, tugas1, uts2, uas2, tugas2;
        double nilaiAkhir1, nilaiAkhir2, nilaiAkhir, totalNilai;
        String huruf1 = "";
        String huruf2 = "";
        String status1, status2;

        System.out.println("========== INPUT DATA MAHASISWA ==========");
        System.out.println("Nama \t: Riska Putri");
        System.out.println("NIM \t: 254107020236");

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS\t: ");
        uts1 = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        uas1 = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        tugas1 = sc.nextInt();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS\t: ");
        uts2 = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        uas2 = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        tugas2 = sc.nextInt();

        nilaiAkhir1 = (0.30 * uts1) + (0.40 * uas1) + (0.30 * tugas1);
        nilaiAkhir2 = (0.30 * uts2) + (0.40 * uas2) + (0.30 * tugas2);

        if (nilaiAkhir1 > 80 && nilaiAkhir1 <= 100) {
            huruf1 = "A";
        } else if (nilaiAkhir1 > 73 && nilaiAkhir1 <= 80) {
            huruf1 = "B+";
        } else if (nilaiAkhir1 > 65 && nilaiAkhir1 <= 73) {
            huruf1 = "B";
        } else if (nilaiAkhir1 > 60 && nilaiAkhir1 <= 65) {
            huruf1 = "C+";
        } else if (nilaiAkhir1 > 50 && nilaiAkhir1 <= 60) {
            huruf1 = "C";
        } else if (nilaiAkhir1 > 39 && nilaiAkhir1 <= 50) {
            huruf1 = "D";
        } else if (nilaiAkhir1 <= 39) {
            huruf1 = "E";
        } else {
            System.out.println("Nilai Yang Anda Masukkan Salah");
        }

        if (nilaiAkhir1 >= 60) {
            status1 = "Lulus";
        } else {
            status1 = "Tidak Lulus";
        }

        if (nilaiAkhir2 > 80 && nilaiAkhir2 <= 100) {
            huruf1 = "A";
        } else if (nilaiAkhir2 > 73 && nilaiAkhir2 <= 80) {
            huruf2 = "B+";
        } else if (nilaiAkhir2 > 65 && nilaiAkhir2 <= 73) {
            huruf2 = "B";
        } else if (nilaiAkhir2 > 60 && nilaiAkhir2 <= 65) {
            huruf2 = "C+";
        } else if (nilaiAkhir2 > 50 && nilaiAkhir2 <= 60) {
            huruf2 = "C";
        } else if (nilaiAkhir2 > 39 && nilaiAkhir2 <= 50) {
            huruf2 = "D";
        } else if (nilaiAkhir2 <= 39) {
            huruf2 = "E";
        } else {
            System.out.println("Nilai Yang Anda Masukkan Salah");
        }

        if (nilaiAkhir2 >= 60) {
            status2 = "Lulus";
        } else {
            status2 = "Tidak Lulus";
        }

        System.out.println("\n========== HASIL PENILAIAN AKADEMIK =========");
        System.out.println("Nama \t: Riska Putri");
        System.out.println("NIM \t: 254107020236");
        System.out.println("\nMata Kuliah\t\t\tUTS\tUAS\tTugas\t\t\tNilai AKhir\t\tNilai Huruf\t\tStatus");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\n%-30s \t%-5.1f \t%-5.1f \t%-7.1f \t\t%-13.2f \t\t%-7s \t\t%-15s\n",
                "Algoritma dan Pemrograman", uts1, uas1, tugas1, nilaiAkhir1, huruf1, status1);
        System.out.printf("%-30s \t%-5.1f \t%-5.1f \t%-7.1f \t\t%-13.2f \t\t%-7s \t\t%-15s\n",
                "Struktur Data", uts2, uas2, tugas2, nilaiAkhir2, huruf2, status2);

        nilaiAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2;
        if (nilaiAkhir1 >= 60 && nilaiAkhir2 >= 60) {
        } else if (nilaiAkhir >= 70) {
            System.out.println("\nKeterangan : Lulus");
        } else if (nilaiAkhir < 70) {
            System.out.println("\nKeterangan : Tidak Lulus");
        } else {
            System.out.println("\nKeterangan : Tidak Lulus");
        }

        totalNilai = (nilaiAkhir1 + nilaiAkhir2) / 2;
        System.out.printf("\nrata-rata nilai akhir :" + totalNilai);

        if (totalNilai >= 70) {
            System.out.println("\nStatus Semester : Lulus");
        } else {
            System.out.println("\nStatus semester : Tidak Lulus");
        }
    }
}
