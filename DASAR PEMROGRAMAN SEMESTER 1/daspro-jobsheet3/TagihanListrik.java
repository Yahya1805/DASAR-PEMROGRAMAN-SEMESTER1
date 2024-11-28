import java.util.Scanner;

public class TagihanListrik {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jumlahPenggunaanListrik, tarif = 1500, totalTagihan;
    boolean statusTagihan;

    //INPUT
    jumlahPenggunaanListrik = sc.nextInt();

    //HITUNG TOTAL
    
    totalTagihan = jumlahPenggunaanListrik * tarif;
    statusTagihan = jumlahPenggunaanListrik > 500;

    //OUTPUT
    System.out.println("total tagihan: " + totalTagihan);
    System.out.println("status tagihan: " + statusTagihan);

    }
}