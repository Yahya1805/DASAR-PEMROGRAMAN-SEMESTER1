import java.util.Scanner;

public  class PemilihanBilangan09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        //OPERATOR TERNARY
        String hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        
        System.out.println("Angka " + angka + " Termasuk " + hasil);
        
    }
}