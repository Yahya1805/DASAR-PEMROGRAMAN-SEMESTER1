import java.util.Scanner;

public class Pemilihan2Percobaan109 {
    public static void main(String[] args) {
        Scanner Absen = new Scanner(System.in);

        //INPUT
        System.out.println("Masukkan Tahun : ");
        int Tahun = Absen.nextInt();

        if ((Tahun % 4) == 0){
            if ((Tahun % 100) !=0)
                System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");

    }
}
