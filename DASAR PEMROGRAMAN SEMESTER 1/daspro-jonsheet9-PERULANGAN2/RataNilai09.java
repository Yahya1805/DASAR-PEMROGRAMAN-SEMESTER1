import java.util.Scanner;

public class RataNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNilai;
        float rataNilai;

        // Looping untuk 5 mahasiswa
        for (int i = 1; i <= 5; i++) {
            totalNilai = 0; // Reset total nilai setiap mahasiswa baru

            System.out.println("Input Nilai Mahasiswa ke " + i);

            // Input 5 nilai per mahasiswa
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                int nilai = sc.nextInt(); // Input nilai
                totalNilai += nilai; // Tambahkan ke total
            }

            // Hitung rata-rata dan tampilkan
            rataNilai = (float) totalNilai / 5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            System.out.println(); // Tambahkan baris kosong agar rapi
        }
    }
}
