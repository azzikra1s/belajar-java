import java.util.Scanner;

public class ConditionIf {
    public static void main(String[] args) {
        //! Basic Syntax of if Statement
        //* if (condition) {
        //*   // code to be executed if condition is true
        //* }
        //! Note: if can be nested

        //? Example
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer: ");
        number = scanner.nextInt();
        if (number %2 == 0) {
            System.out.println(number + " is an even number.");
        } else if (number < 1) {
            System.out.println("Invalid input, please enter a N (Natural) number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}