import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int HARGA_PER_TIKET = 50000;
        int totalPenjualan = 0;
        
        while (true) {
            // Meminta input jumlah tiket
            System.out.print("Masukkan jumlah tiket yang dibeli (atau -1 untuk keluar): ");
            int jumlahTiket = scanner.nextInt();
            
            // Cek apakah ingin keluar
            if (jumlahTiket == -1) {
                break;
            }
            
            // Cek validitas input
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, masukkan ulang.");
                continue;
            }
            
            // Hitung harga total
            int totalHarga = jumlahTiket * HARGA_PER_TIKET;
            
            // Terapkan diskon berdasarkan jumlah tiket
            if (jumlahTiket > 10) {
                totalHarga -= totalHarga * 0.15;  // Diskon 15%
            } else if (jumlahTiket > 4) {
                totalHarga -= totalHarga * 0.10;  // Diskon 10%
            }
            
            // Tambahkan ke total penjualan
            totalPenjualan += totalHarga;
        }
        
        // Tampilkan total penjualan
        System.out.println("Total penjualan tiket hari ini adalah: Rp " + totalPenjualan);
        scanner.close();
    }
}
