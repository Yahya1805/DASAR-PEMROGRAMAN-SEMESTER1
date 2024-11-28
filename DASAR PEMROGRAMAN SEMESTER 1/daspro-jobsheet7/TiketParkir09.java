import java.util.Scanner;

public class TiketParkir09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        System.out.println("Jenis jenis kendaraan");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Keluar");
        System.out.print("Masukkan jenis kendaraan: ");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.print("Masukkan durasi: ");
            durasi = sc.nextInt();
            
            // Hitung biaya parkir berdasarkan durasi
            if (durasi > 5) {
                total += 12500;
            } else {
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }

            // Tampilkan detail transaksi
            System.out.println("\n=== Detail Transaksi ===");
            String tipeKendaraan = (jenis == 1) ? "Mobil" : "Motor";
            System.out.println("Jenis Kendaraan  : " + tipeKendaraan);
            System.out.println("Durasi Parkir    : " + durasi + " jam");
            System.out.println("Total Biaya Parkir: Rp " + total);
        } else if (jenis == 0) {
            System.out.println("Anda memilih keluar. Terima kasih.");
        } else {
            System.out.println("Jenis kendaraan tidak valid!");
        }

        sc.close();
    }
}
