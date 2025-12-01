import java.util.Scanner;

public class Break {
    /*
        * Break Statement digunakan untuk menghentikan seluruh iterasi dalam loop
        * ketika kondisi tertentu terpenuhi, dan keluar dari loop tersebut.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ketik 'exit' untuk berhenti: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program berhenti.");
                break; //? keluar dari while(true)
            }

            System.out.println("Anda memasukkan: " + input);
        }

        scanner.close();
    }
}