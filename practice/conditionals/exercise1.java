/*
    !LATIHAN 1 — Cek tahun kabisat

    *Aturan:
        *Tahun kabisat jika: 
        *habis dibagi 4
        *tidak habis dibagi 100
        *dan atau habis dibagi 400
*/

import java.util.Scanner;

public class exercise1 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        int year;
        System.out.print("Masukkan tahun (contoh: 2024): ");
        year = scanner.nextInt();

        // * Cek tahun kabisat
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " adalah tahun kabisat.");
        } else {
            System.out.println(year + " bukan tahun kabisat.");
        }
    }
}