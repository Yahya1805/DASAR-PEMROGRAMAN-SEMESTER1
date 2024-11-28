import java.util.Scanner;

public class TUGASno2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array 2 dimensi untuk menyimpan hasil survei (10 responden x 6 pertanyaan)
        int[][] surveyData = new int[10][6];
        String[][] ulasanData = new String[10][6]; // Array untuk menyimpan ulasan
        
        // Array untuk menyimpan pertanyaan
        String[] pertanyaan = new String[6];
        
        // Meminta pengguna untuk memasukkan pertanyaan survei
        System.out.println("Masukkan 6 pertanyaan survei:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Pertanyaan ke-" + (i + 1) + ": ");
            pertanyaan[i] = input.nextLine();
        }
        
        // a. Menyimpan hasil survey
        System.out.println("\nMasukkan hasil survey (nilai antara 1-5) dan ulasan untuk setiap pertanyaan:");
        for (int i = 0; i < 10; i++) { // Loop untuk setiap responden
            System.out.println("\nResponden ke-" + (i + 1) + ":");
            for (int j = 0; j < 6; j++) { // Loop untuk setiap pertanyaan
                System.out.println(pertanyaan[j]);
                System.out.print("Nilai (1-5): ");
                surveyData[i][j] = input.nextInt();
                input.nextLine(); // Membersihkan buffer input
                System.out.print("Ulasan: ");
                ulasanData[i][j] = input.nextLine();
            }
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nNilai rata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 6; j++) {
                sum += surveyData[i][j];
            }
            double average = (double) sum / 6;
            System.out.println("Rata-rata Responden ke-" + (i + 1) + ": " + average);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nNilai rata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += surveyData[i][j];
            }
            double average = (double) sum / 10;
            System.out.println("Rata-rata Pertanyaan ke-" + (j + 1) + ": " + average);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        int totalSum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalSum += surveyData[i][j];
            }
        }
        double overallAverage = (double) totalSum / (10 * 6);
        System.out.println("\nNilai rata-rata keseluruhan: " + overallAverage);

        // e. Menampilkan ulasan dari setiap responden
        System.out.println("\nUlasan yang diberikan oleh setiap responden:");
        for (int i = 0; i < 10; i++) {
            System.out.println("\nUlasan dari Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.println(pertanyaan[j]);
                System.out.println("Nilai: " + surveyData[i][j] + ", Ulasan: " + ulasanData[i][j]);
            }
        }

        input.close();
    }
}
