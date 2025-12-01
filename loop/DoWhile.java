import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
            ! Do While Loop dipakai ketika blok kode harus dijalankan minimal satu kali sebelum pengecekan kondisi
            * Struktur Do While Loop
            * do {
            *    // blok kode yang akan diulang
            * } while (kondisi);
        */
        Scanner scanner = new Scanner(System.in);

        final String correctPassword = "java123";
        String inputPassword;

        do {
            // * Akan menjalankan blok kode terlebih dahulu sebelum cek kondisi
            System.out.println("Masukan password: ");
            inputPassword = scanner.nextLine();

            if (!inputPassword.equals(correctPassword)) {
                System.out.println("Password salah, coba lagi!");
            }
        } while (!inputPassword.equals(correctPassword)); // ! Cek kondisi setelah blok kode dijalankan, jika true maka ulangi blok kode.

        System.out.println("Akses diterima, selamat datang!");
        scanner.close();
    }
}