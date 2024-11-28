import java.util.Scanner;

public class SIAKAD09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah siswa dan mata kuliah
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        // Deklarasi array dengan ukuran dinamis
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // Input nilai dan hitung rata-rata per siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }

            // Rata-rata nilai per siswa
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalPersiswa / jumlahMatkul);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        // Hitung rata-rata per mata kuliah
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }

        sc.close();
    }
}
