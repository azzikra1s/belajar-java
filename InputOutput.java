import java.util.Scanner; //! Import Scanner class for user input

public class InputOutput {
    public static void main(String[] args) {
        //! Create Scanner object to read input 
        //* Note: you can use scanner or input as variable name for standarization
        Scanner scanner = new Scanner(System.in); 
        
        // Declare variables
        String name;
        int age;
        double gpa;

        // Input from user
        System.out.print("Enter your name: ");
        name = scanner.nextLine(); //* input string for name
        System.out.print("Enter your age: ");
        age = scanner.nextInt(); //* input integer for age
        System.out.print("Enter your GPA: ");
        gpa = scanner.nextDouble(); //* input double for GPA

        // Output to console
        String data = """
        Thank you for your participation!
        Here's your data:
            Name    : %s
            Age     : %d
            GPA     : %.2f
        """.formatted(name, age, gpa);

        System.out.println(data);

        //! Close scanner for resource management
        scanner.close();
    }
}