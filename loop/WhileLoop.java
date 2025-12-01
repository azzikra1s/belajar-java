import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*  
            ! While Loop dipakai ketika jumlah iterasi belum diketahui sebelumnya
            * Struktur While Loop
            * while (kondisi) {
            *    // blok kode yang akan diulang
            * }
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka awal: ");
        int i = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Hitung mundur dimulai...");

        while (i > 0) {
            System.out.println(i);
            i--;
        }
        
        System.out.println("START!");
        scanner.close();
    }
}