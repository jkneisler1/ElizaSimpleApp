import java.util.Scanner;

public class ElizaSimpleApp {
    public static void main(String[] args) {
        String greeting = "Good day.  What is your problem?  ";
        String userPrompt = "Enter your response here or enter Q to quit: ";
        boolean sessionActive = true;
        Scanner key = new Scanner(System.in);
        String userQu;

        System.out.print(greeting);

        while(sessionActive) {
            System.out.println(userPrompt);
            userQu = key.nextLine();

            if (userQu.equalsIgnoreCase("q")) {
                sessionActive = false;
                System.out.println(">>> END");
            }
            else {
                System.out.println(userQu);
            }
        }
    }
}
