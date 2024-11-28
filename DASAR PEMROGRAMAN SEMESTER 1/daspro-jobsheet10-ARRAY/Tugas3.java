import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        // Inisialisasi menu makanan
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"
        };
        
        Scanner scanner = new Scanner(System.in);
        
        // Input nama makanan yang ingin dicari
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cari = scanner.nextLine().trim(); // Menghapus spasi di awal dan akhir input
        
        // Linear search untuk mencari makanan
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }
        
        // Output hasil pencarian
        if (ditemukan) {
            System.out.println("Makanan \"" + cari + "\" tersedia di menu.");
        } else {
            System.out.println("Maaf, makanan \"" + cari + "\" tidak tersedia di menu.");
        }
        
        scanner.close();
    }
}
