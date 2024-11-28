import java.util.Scanner;

public class TokoPakaian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int HARGA_PER_PAKAIAN = 75000;
        int jumlahPakaian;
        double totalBiaya = 0;

        System.out.print("Masukkan jumlah pakaian yang dibeli: ");
        jumlahPakaian = input.nextInt();

        // Periksa apakah input valid (tidak boleh negatif)
        if (jumlahPakaian < 0) {
            System.out.println("Input jumlah pakaian tidak valid!");
            return; // Keluar dari program jika input tidak valid
        }

        // Gunakan perulangan 'for' untuk menghitung total biaya
        for (int i = 1; i <= jumlahPakaian; i++) {
            totalBiaya += HARGA_PER_PAKAIAN;
        }

        // Berikan diskon jika jumlah pakaian lebih dari 3 atau 7
        if (jumlahPakaian > 7) {
            totalBiaya -= totalBiaya * 0.10; // Diskon 10%
        } else if (jumlahPakaian > 3) {
            totalBiaya -= totalBiaya * 0.05; // Diskon 5%
        }

        // Tampilkan hasil akhir
        System.out.println("Total biaya setelah diskon: Rp " + (int) totalBiaya);

        input.close();
    }
}
