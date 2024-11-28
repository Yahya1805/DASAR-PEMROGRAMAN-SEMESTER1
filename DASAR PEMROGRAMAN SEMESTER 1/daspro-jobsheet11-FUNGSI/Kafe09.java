import java.util.Scanner;

public class Kafe09 {

    // Metode untuk menampilkan menu dan informasi awal
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
    }

    // Metode untuk menghitung total harga dengan diskon berdasarkan kode promo
    public static int hitungTotalharga09(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        // Hitung total harga awal
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        // Berikan diskon berdasarkan kode promo
        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }

    // Metode main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tampilkan menu
        Menu("Andi", true, "DISKON30");

        // Masukkan pesanan
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = scanner.nextInt();

        System.out.print("Masukkan jumlah item yang ingin Anda pesan: ");
        int banyakItem = scanner.nextInt();

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = scanner.next(); // Input kode promo dari pengguna

        // Hitung total harga
        int hargaTotal = hitungTotalharga09(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan Anda setelah diskon (jika ada): Rp" + hargaTotal);

        scanner.close();
    }
}
