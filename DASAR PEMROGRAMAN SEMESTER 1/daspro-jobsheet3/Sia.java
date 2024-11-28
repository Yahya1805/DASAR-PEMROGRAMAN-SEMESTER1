import java.util.Scanner;

public class Sia {

    public static void main(String[] args) {
        // Membuat Scanner untuk input
        Scanner sc = new Scanner(System.in);  
        
        String nama, nim;
        char Kelas;
        byte Absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiuts, nilaiAkhir;

        // Input data
        System.out.print("NAMA: ");
        nama = sc.nextLine();
        System.out.print("NIM: ");
        nim = sc.nextLine();
        System.out.print("KELAS: ");
        Kelas = sc.nextLine().charAt(0);  // Mengambil karakter pertama dari input
        System.out.print("NOMOR ABSEN: ");
        Absen = sc.nextByte();
        sc.nextLine();  // Membersihkan newline setelah nextByte()
        
        // Input nilai
        System.out.print("NILAI KUIS (20/100): ");
        nilaiKuis = sc.nextDouble();
        sc.nextLine();  // Membersihkan newline setelah nextDouble()

        System.out.print("NILAI TUGAS (15/100): ");
        nilaiTugas = sc.nextDouble();
        sc.nextLine();  // Membersihkan newline setelah nextDouble()

        System.out.print("NILAI UJIAN TENGAH (30/100): ");
        nilaiuts = sc.nextDouble();
        sc.nextLine();  // Membersihkan newline setelah nextDouble()

        System.out.print("NILAI UJIAN (35/100): ");
        nilaiUjian = sc.nextDouble();
        sc.nextLine();  // Membersihkan newline setelah nextDouble()

        // Menghitung nilai akhir berdasarkan bobot
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiuts * 0.30) + (nilaiUjian * 0.35);

        // Menampilkan data dan nilai akhir
        System.out.println("NAMA: " + nama + " NIM: " + nim);
        System.out.println("KELAS: " + Kelas + " ABSEN: " + Absen);
        System.out.println("NILAI AKHIR: " + nilaiAkhir);
        
        sc.close();  // Menutup Scanner untuk menghindari kebocoran resource
    }
}
