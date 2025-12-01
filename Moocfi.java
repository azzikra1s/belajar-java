import java.util.Scanner;

public class Moocfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        int b;
        double c;
        boolean d;

        System.out.println("Give a string: ");
        a = scanner.nextLine();
        System.out.println("Give an integer: ");
        b = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double: ");
        c = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        d = Boolean.valueOf(scanner.nextLine());

        System.out.println("You gave the string " + a);
        System.out.println("You gave the integer " + b);
        System.out.println("You gave the double " + c);
        System.out.println("You gave the boolean " + d);
    }
}