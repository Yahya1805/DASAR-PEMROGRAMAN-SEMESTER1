import java.util.Scanner;

public class Tokojajan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_PER_BUNGKUS = 12000;
        int jmljajan;
        double totalBiaya = 0;

        System.out.print("Masukkan jumlah jajan yang dibeli: ");
        jmljajan = sc.nextInt();

        if (jmljajan < 0){
            System.out.println("jumlah yang anda input tidak valid masukkan jumalah yang valid");
            return;
        }


        for (int i = 1; i <=jmljajan; i++){
            totalBiaya += HARGA_PER_BUNGKUS;
        }

        if (jmljajan > 10){
            totalBiaya -= totalBiaya * 0.08;
        }else if (jmljajan > 5){
            totalBiaya -= totalBiaya * 0.05;
        }

        System.out.println("total biaya setelah diskon: Rp. " + (int)totalBiaya);
    }    
}
