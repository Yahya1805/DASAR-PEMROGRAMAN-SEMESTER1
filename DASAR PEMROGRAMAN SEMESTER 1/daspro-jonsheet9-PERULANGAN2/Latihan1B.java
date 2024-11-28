public class Latihan1B {
    public static void main(String[] args) {
        int n = 10; // Jumlah baris

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
