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
        char grade;
        boolean isGraduated;

        // Input from user
        //* input string for name
        System.out.print("Enter your name: ");
        name = scanner.nextLine(); 
        //* input integer for age
        System.out.print("Enter your age: ");
        //? age = scanner.nextInt(); lebih dianjurkan yg dibawah:
        age = Integer.valueOf(scanner.nextLine());
        //* input double for GPA
        System.out.print("Enter your GPA: ");
        //? gpa = scanner.nextDouble(); 
        gpa = Double.valueOf(scanner.nextLine());
        //* input char for grade
        System.out.println("Enter your grade (A, B, C, D): ");
        grade = scanner.nextLine().charAt(0);
        //* input boolean for graduation status
        System.out.print("Are you graduated? (true/false): ");
        //? isGraduated = scanner.nextBoolean();
        isGraduated = Boolean.valueOf(scanner.nextLine());

        // Output to console
        String data = """
        Thank you for your participation!
        Here's your data:
            Name    : %s
            Age     : %d
            GPA     : %.2f
            Grade   : %c
            Graduated: %b
        """.formatted(name, age, gpa, grade, isGraduated);

        System.out.println(data);

        //! Close scanner for resource management
        scanner.close();
    }
}