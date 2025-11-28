import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your Month (1-12): ");
        int monthNumber = scanner.nextInt();

        //* Java 14+ Modern Switch Expression with Yield (Switch Lambda)
        String monthName = switch (monthNumber) {
            case 1 -> "January! (Capricorn)";
            case 2 -> "February! (Aquarius)";
            case 3 -> "March! (Aries)";
            case 4 -> "April! (Taurus)";
            case 5 -> "May! (Gemini)";
            case 6 -> "June! (Cancer)";
            case 7 -> "July! (Leo)";
            case 8 -> "August! (Virgo)";
            case 9 -> "September! (Libra)";
            case 10 -> "October! (Scorpio)";
            case 11 -> "November! (Sagittarius)";
            case 12 -> "December! (Capricorn)";
            default -> "Invalid month input (1-12)!";
        };
        if (monthNumber >= 1 && monthNumber < 13) {
            System.out.println("Your Month is %s, month-%d in the year.".formatted(monthName, monthNumber));
        } else {
            System.out.println(monthName);
        }
        

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
