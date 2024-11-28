import java.util.Scanner;

public class PorseniAtletTanpaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar cabang olahraga
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};

        System.out.println("=== Input Nama Atlet Porseni 2024 ===");
        
        // Perulangan untuk setiap cabang olahraga
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Cabang: " + cabangOlahraga[i]);

            // Perulangan untuk input nama atlet di setiap cabang
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                String namaAtlet = scanner.nextLine();

                // Langsung tampilkan nama atlet yang baru dimasukkan
                System.out.println("Atlet ke-" + (j + 1) + ": " + namaAtlet);
            }

            System.out.println(); // Tambah spasi antar cabang
        }

        scanner.close();
    }
}
