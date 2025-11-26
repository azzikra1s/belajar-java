/*
    !LATIHAN 4 — Hitung luas lingkaran

    *Gunakan:
        *radius → float atau double
        *phi = 3.14 (double)
        *luas = phi * r * r
*/

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner inputRadius = new Scanner(System.in);
        int r;
        double phi;

        System.out.println("Enter the radius of the circle: ");
        r = inputRadius.nextInt();
        System.out.println("Circle radius: " + r);

        if (r % 7 == 0) {
            phi = 22.0 / 7.0;
        } else {
            phi = 3.14;
        }

        double luasLingkaran = phi * r * r;
        System.out.println("Circle area: " + luasLingkaran);
    }
}