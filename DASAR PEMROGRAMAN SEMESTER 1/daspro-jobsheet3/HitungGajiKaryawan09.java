import java.util.Scanner;  // Mengimpor kelas Scanner untuk input

public class HitungGajiKaryawan09 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);
        
        //INPUT
        int jamKerja, upahPerJam;
        double Persenbonus = 0.1, Persenpajak = 0.05;
        
        jamKerja = sc.nextInt();
        upahPerJam = sc.nextInt();

        double totalGaji = jamKerja * upahPerJam;
        double bonus = totalGaji * Persenbonus;
        double pajak = Persenpajak * (totalGaji + bonus);
        double Gajibersih = (totalGaji * bonus) - pajak;

        //OUTPUT
        System.out.println("total gaji: " + totalGaji);
        System.out.println("bonus: " + bonus);
        System.out.println("pajak: " + pajak);
        System.out.println("gaji bersih: " + Gajibersih);
        

    }
}
