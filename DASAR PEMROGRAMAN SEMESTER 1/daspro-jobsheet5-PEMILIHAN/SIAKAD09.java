import java.util.Scanner;

public class SIAKAD09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi variabel
        String nama, nim;
        char Kelas;
        byte Absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUTS, nilaiAkhir;
        String nilaiHuruf, kualifikasi;

        // Input data
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
        nilaiUTS = sc.nextDouble();
        System.out.print("NILAI UJIAN (35/100): ");
        nilaiUjian = sc.nextDouble();

        // Perhitungan nilai akhir
        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUjian * 0.35);

        // Menentukan nilai huruf dan kualifikasi berdasarkan nilai akhir
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
                kualifikasi = "Lebih dari Baik";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
                kualifikasi = "Baik";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
                kualifikasi = "Lebih dari Cukup";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
                kualifikasi = "Cukup";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
                kualifikasi = "Kurang";
                } else {
                    nilaiHuruf = "E";
                    kualifikasi = "Gagal";
                }

        // Output hasil
        System.out.println("\nHASIL PERHITUNGAN:");
        System.out.println("NAMA         : " + nama);
        System.out.println("NIM          : " + nim);
        System.out.println("KELAS        : " + Kelas);
        System.out.println("ABSEN        : " + Absen);
        System.out.println("NILAI AKHIR  : " + nilaiAkhir);
        System.out.println("NILAI HURUF  : " + nilaiHuruf);
        System.out.println("KUALIFIKASI  : " + kualifikasi);
    }
}