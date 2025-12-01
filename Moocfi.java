import java.util.Scanner;

public class Moocfi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main Character called?");
        String characterName = scanner.nextLine();
        System.out.println("What is the character's job?");
        String characterJob = scanner.nextLine();
        System.out.println("Here is the story: Once upon a time there was a " + characterName + ", who was a " + characterJob + ". On the way to work, " + characterName + " often pondered what being a " + characterJob + " really meant.");
    }
}