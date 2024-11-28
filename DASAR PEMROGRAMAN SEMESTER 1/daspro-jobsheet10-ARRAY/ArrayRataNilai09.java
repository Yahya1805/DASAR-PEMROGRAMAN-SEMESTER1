import java.util.Scanner;
/**
 * ArrayRataNilai09
 */
public class ArrayRataNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();

        int [] nilaiMhs = new int [jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : "); 
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        }

        if (lulus > 0) {
            System.out.println("Jumlah mahasiswa yang lulus adalah " + (totalLulus / lulus));
        }else{
            System.out.println("Jumlah mahasiswa yang lulus adalah 0");
        }

        if (tidakLulus > 0) {
            System.out.println("Jumlah mahasiswa yang lulus adalah " + (totalTidakLulus / tidakLulus));
        }else{
            System.out.println("Jumlah mahasiswa yang lulus adalah 0");
        }
    }
}