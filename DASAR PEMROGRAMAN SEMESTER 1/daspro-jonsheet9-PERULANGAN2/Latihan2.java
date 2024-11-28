public class Latihan2 {
    public static void main(String[] args) {
        char huruf = 'a'; // Huruf awal
        int baris = 5; // Jumlah baris

        for (int i = 1; i <= baris; i++) {
            // Cetak spasi agar bentuk piramida
            for (int spasi = baris - i; spasi > 0; spasi--) {
                System.out.print(" ");
            }

            // Cetak huruf untuk setiap baris
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(huruf);
                huruf++;
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
