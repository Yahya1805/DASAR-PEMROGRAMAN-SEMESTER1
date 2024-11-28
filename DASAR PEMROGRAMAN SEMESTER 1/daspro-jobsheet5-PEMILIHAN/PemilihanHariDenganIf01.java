import java.util.Scanner;

public class PemilihanHariDenganIf01 { // Gantilah "01" dengan nomor absen kamu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan angka (1-7): ");
        int angka = sc.nextInt();

        // Menggunakan if-else untuk menentukan jenis hari
        if (angka >= 1 && angka <= 5) {
            System.out.println("Weekday");
        } else if (angka == 6 || angka == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

        // Menutup Scanner
        sc.close();
    }
}
