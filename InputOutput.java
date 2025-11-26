import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declare variables
        String name;
        int age;
        double gpa;

        // Input from user
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your GPA: ");
        gpa = input.nextDouble();

        // Output to console
        String data = """
        Thank you for your participation!
        Here's your data:
            Name    : %s
            Age     : %d
            GPA     : %.2f
        """.formatted(name, age, gpa);

        System.out.println(data);
    }
}