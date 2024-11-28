import java.util.Scanner;

/**
 * Tugas2
 */
public class Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        int n;
        System.out.print("Masukkan jumlah pesanan: ");
        n = sc.nextInt();

        String menu[] = new String[n];
        int harga[] = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan menu ke-" + (i + 1) + ": ");
            menu[i] = sc1.nextLine();
            System.out.print("Masukkan harga menu ke-" + (i + 1) + ": ");
            harga[i] = sc.nextInt();
        }
        System.out.println("-------------------------");

        for (int i = 0; i < n; i++) {
            total += harga[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Menu ke-" + (i + 1) + ": " + menu[i]);
            System.out.println("Harga menu ke-" + (i + 1) + ": " + harga[i]);
        }
        System.out.println("-------------------------");
        System.out.println("Total harga: " + total);
    }
}