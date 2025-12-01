import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input nilai (1-100): ");
        int nilai = Integer.valueOf(scanner.nextLine());

        //* Java 14+ Modern Switch Expression with Yield (Switch Lambda)
        String grade = switch (nilai/10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> {
                System.out.println("Butuh remedial!");
                yield "E";
            }
        };
        
        System.out.println("Grade Anda: " + grade);

        //* Traditional Switch Statement
        /*
            *switch (expression) {
                *case value1:
                    kode 1;
                *break;
                *case value2:
                    kode 2;
                *break;
                *default:
                    kalau tidak ada yang sesuai, maka default akan dijalankan
            *}; //! Note: Wajib ; setelah kurung tutup switch!
        */
    }
}
