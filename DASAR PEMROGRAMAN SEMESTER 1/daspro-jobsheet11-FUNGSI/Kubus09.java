import java.util.Scanner;

public class Kubus09 {

    static int hitungvolume(int sisi) {
        return sisi * sisi * sisi;
    }

    static int hitungluaspermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V, l;

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        V = hitungvolume(sisi) ;
        System.out.println("Volume kubus adalah: " + V);

        l = hitungluaspermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah: " + l);
    }
}