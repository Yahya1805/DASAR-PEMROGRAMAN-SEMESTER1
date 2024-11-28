import java.util.Scanner;

public class BioskopWithScanner09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();  // Membaca sisa baris

            switch (pilihan) {
                case 1:
                    inputDataPenonton(penonton, sc);
                    break;
                case 2:
                    tampilkanDaftarPenonton(penonton);
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    public static void inputDataPenonton(String[][] penonton, Scanner sc) {
        String nama;
        int baris, kolom;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan baris: ");
        baris = sc.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = sc.nextInt();
        sc.nextLine();  // Membersihkan sisa baris

        // Cek apakah nomor kursi valid
        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
            System.out.println("Nomor baris/kolom tidak tersedia.");
            return;
        }

        // Cek apakah kursi sudah terisi
        if (penonton[baris - 1][kolom - 1] != null) {
            System.out.println("Kursi sudah terisi oleh penonton lain. Silakan pilih kursi lain.");
        } else {
            penonton[baris - 1][kolom - 1] = nama;
            System.out.println("Data penonton berhasil dimasukkan.");
        }
    }

    public static void tampilkanDaftarPenonton(String[][] penonton) {
        System.out.println("Daftar penonton:");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.print((penonton[i][j] == null ? "***" : penonton[i][j]) + "\t");
            }
            System.out.println();
        }
    }
}
