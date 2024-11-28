
import java.util.Scanner;

public class hitungTotalharga09 {

    public static int hitungTotalharga09(int pilihanMenu, int banyakItem){
        int[] hargaItems= {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan:");
        int pilihanMenu = scanner.nextInt();
        System.out.print("Masukkan jumlah item yang ingin Anda pesan:");
        int banyakItem = scanner.nextInt();

        int hargaTotal = hitungTotalharga09(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp" + hargaTotal);
        }
}
