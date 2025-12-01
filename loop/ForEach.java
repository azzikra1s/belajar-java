public class ForEach {
    public static void main(String[] args) {
        /*
            * Struktur For Each Loop
            * for (tipeData variabel : array/collection) {
            *    // blok kode yang akan diulang
            * }
            ! For Each Loop digunakan untuk iterasi pada array atau collection
        */
        /*
            * Dari asalnya:
            * for (var i = 0; i < fruits.length; i++) {
            *    System.out.println(fruits[i]);
            * }
            ? Bisa ditulis menjadi For Each Loop seperti dibawah: 
        */

        String[] fruits = {"apple", "banana", "cherry"};
        
        for (var f : fruits) {
            System.out.println(f);
        }
    }
}