/*
    !LATIHAN 1 — Hitung luas lingkaran

    *Gunakan:
        *radius → float atau double
        *phi = 3.14 (double)
        *luas = phi * r * r
*/

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ! Declare variable
        int r;
        double phi;
        double luasLingkaran;

        // * Input radius
        System.out.println("Program penghitung luas lingkaran, silakan masukkan jari-jari lingkaran: ");
        r = scanner.nextInt();

        System.out.println("Diketahui jari-jari yang diinput: " + r);

        // * Phi value jika habis dibagi 7 maka phi 22/7, selain itu 3.14
        if (r % 7 == 0) {
            phi = 22.0 / 7.0;
        } else {
            phi = 3.14;
        }

        // ! Hitung luas lingkaran
        luasLingkaran = phi * r * r;

        System.out.println("Luas lingkaran adalah: " + luasLingkaran);
    }
}