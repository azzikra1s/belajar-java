import java.util.Scanner;

public class Break {
    /*
        * Break Statement digunakan untuk menghentikan seluruh iterasi dalam loop
        * ketika kondisi tertentu terpenuhi, dan keluar dari loop tersebut.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String password = "java123";
        String input;
        int attempts = 0;

        while (true) {
            System.out.print("Masukkan password: ");
            input = scanner.nextLine();

            if (input.equals(password)) {
                System.out.println("Login berhasil!");
                break; // stop loop → lanjut ke program utama
            }

            attempts++;
            if (attempts >= 3) {
                System.out.println("Akses ditolak! Anda hanya mendapat kesempatan 3 kali.");
                break; // stop loop → lanjut ke program utama
            }

            System.out.println("Password salah, coba lagi.\n");
        }

        scanner.close();
    }
}