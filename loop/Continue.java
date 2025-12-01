public class Continue {
    /*
        * Continue Statement digunakan untuk melewati iterasi tertentu dalam loop
        * ketika kondisi tertentu terpenuhi, dan melanjutkan ke iterasi berikutnya.
    */
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip angka genap
            }
            System.out.println(i);
        }
    }
}