import java.util.Scanner;
/**
 * Tugas1
 */
public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        n = sc.nextInt();

        int total = 0;
        int nilaimhs[] = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaimhs[i] = sc.nextInt();
            total += nilaimhs[i];
            
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + ": " + nilaimhs[i]);
        }

        float ratarata = total / n;
        System.out.println("Total rata rata nilai mahasiswa: " + ratarata);

        int min, max;
        min=max=nilaimhs[0];
        for(int i = 1; i < n; i++) {
            if(nilaimhs[i] > max) {
                max = nilaimhs[i];
            }
            if (nilaimhs[i] < min) {
                min = nilaimhs[i];
            }
        }
        
        System.out.println("Nilai mahasiswa terbesar: " + max);
        System.out.println("Nilai mahasiswa terkecil: " + min);
       
    }
}