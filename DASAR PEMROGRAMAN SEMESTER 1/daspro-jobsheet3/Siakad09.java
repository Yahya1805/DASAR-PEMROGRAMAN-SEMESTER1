import java.util.Scanner;

public class Siakad09 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama, nim;
    char Kelas;
    byte Absen;
    double nilaiKuis, nilaiTugas, nilaiUjian, nilaiuts, nilaiAkhir;
    char nilaiHuruf;
    String kualifikasi;
    System.out.print("NAMA: ");
    nama = sc.nextLine();
    System.out.print("NIM: ");
    nim = sc.nextLine();
    System.out.print("KELAS: ");
    Kelas = sc.nextLine().charAt(0);
    System.out.print("NOMOR ABSEN: ");
    Absen = sc.nextByte();
    System.out.print("NILAI KUIS (20/100): ");
    nilaiKuis = sc.nextDouble();
    System.out.print("NILAI TUGAS (15/100): ");
    nilaiTugas = sc.nextDouble();
    System.out.print("NILAI UJIAN TENGAH (30/100): ");
    nilaiuts = sc.nextDouble();
    System.out.print("NILAI UJIAN (35/100): ");
    nilaiUjian = sc.nextDouble();
    nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiuts * 0.30) + (nilaiUjian * 0.35);
    

    if (nilaiAkhir >= 80) {
        nilaiHuruf = 'A';
        kualifikasi = "Sangat Baik";
    } else if (nilaiAkhir >= 73) {
        nilaiHuruf = 'B+';
        kualifikasi = "Lebih dari Baik";
    } else if (nilaiAkhir >= 65) {
        nilaiHuruf = 'B';
        kualifikasi = "Baik";
    } else if (nilaiAkhir >= 60) {
        nilaiHuruf = 'C+';
        kualifikasi = "Lebih dari Cukup";
    } else if (nilaiAkhir >= 50) {
        nilaiHuruf = 'C';
        kualifikasi = "Cukup";
    } else if (nilaiAkhir >= 39) {
        nilaiHuruf = 'D';
        kualifikasi = "Kurang";
    } else {
        nilaiHuruf = 'E';
        kualifikasi = "Gagal";
    }

    // Output
    System.out.println("NAMA: " + nama + " NIM: " + nim);
    System.out.println("KELAS: " + Kelas + " ABSEN: " + Absen);
    System.out.println("NILAI AKHIR: " + nilaiAkhir);
    System.out.println("NILAI HURUF: " + nilaiHuruf);
    System.out.println("KUALIFIKASI: " + kualifikasi);   

    }

    }
    

}