public class Main {
    public static void main(String[] args) {
        int nilai = 50;

    String grade = switch (nilai / 10) {
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
    }
}