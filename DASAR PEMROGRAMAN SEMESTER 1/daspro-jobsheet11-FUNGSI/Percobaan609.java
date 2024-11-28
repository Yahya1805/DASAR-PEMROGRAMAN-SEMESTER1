import java.util.Scanner;

public class Percobaan609 {

    static  int hitungLuas (int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int Volume = hitungLuas(a, b) * tinggi;
        return Volume;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang:");
        p = sc.nextInt();
        System.out.print("Masukkan lebar:");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi:");
        t = sc.nextInt();

        L =hitungLuas (p, l);
        System.out.println("Luas Persegi panjang adalah " + L);

        vol =hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);
    }

}