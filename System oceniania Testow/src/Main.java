import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("How much points did you get on the test?");
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();
        if (points < 50) {
            System.out.println("You have to practice more!");
        }
        else if (points > 50 ) {
            if (points < 100) {
                System.out.println("You are on the good way!");
            }
        }
        if (points == 100) {
            System.out.println("Great job!");
        }
        else {
            System.out.println("Enter real number of points!");
        }
        scanner.close();
    }
}
