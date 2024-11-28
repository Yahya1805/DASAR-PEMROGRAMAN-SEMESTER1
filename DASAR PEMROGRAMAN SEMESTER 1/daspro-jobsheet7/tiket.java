import java.util.Scanner;

public class tiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmltiket, hargatiket, diskon, totaltiket = 0, totalHarga = 0;
        boolean islanjut = true;

        while (islanjut) {
            System.out.print("Input jumlah tiket: ");
            jmltiket = sc.nextInt();
            
            if (jmltiket <= 0) {
                System.out.println("Input invalid");
                continue; 
            } else {
                hargatiket = jmltiket * 50000;
                
                // Diskon jika jumlah tiket lebih dari 10
                if (jmltiket > 10) {
                    diskon = (int) (0.15 * hargatiket);
                } else if (jmltiket >= 4) {
                    diskon = (int) (0.1 * hargatiket);
                } else {
                    diskon = 0;
                }

                hargatiket = hargatiket - diskon;
                totaltiket = totaltiket + jmltiket;
                totalHarga = totalHarga + hargatiket;

                System.out.println("Harga tiket setelah diskon: " + hargatiket);
            }

            System.out.print("Lanjut membeli tiket? (true/false): ");
            islanjut = sc.nextBoolean();
        }

        System.out.println("Total tiket: " + totaltiket);
        System.out.println("Total harga: " + totalHarga);
    }
}
