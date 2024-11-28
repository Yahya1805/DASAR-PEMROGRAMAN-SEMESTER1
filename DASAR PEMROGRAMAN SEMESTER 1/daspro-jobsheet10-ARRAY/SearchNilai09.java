import java.util.Scanner;

public class SearchNilai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah elemen array
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        int[] arrNilai = new int[jumlahNilai];

        // Meminta input nilai mahasiswa
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        // Meminta input nilai yang ingin dicari (key)
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        // Inisialisasi variabel untuk menyimpan hasil pencarian
        int hasil = -1;

        // Melakukan pencarian linear
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; // Jika ditemukan, simpan indeksnya
                break; // Keluar dari loop jika nilai ditemukan
            }
        }

        // Menampilkan hasil pencarian
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
