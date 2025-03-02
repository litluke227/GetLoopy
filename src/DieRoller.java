import java.util.Random;
import java.util.Scanner;
public class DieRoller {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String response;
        do {
            int rollNumber = 1;
            System.out.println("Roll  Die1  Die2  Die3  Sum");
            System.out.println("--------------------------");
            while (true) {
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.println(rollNumber + "     " + die1 + "     " + die2 + "     " + die3 + "     " + sum);
                if (die1 == die2 && die2 == die3) {
                    System.out.println("Triple found! " + die1 + " " + die2 + " " + die3);
                    break;
                }
                rollNumber++;
            }
            System.out.print("Roll again? (yes/no): ");
            response = scanner.next().toLowerCase();
        } while (response.equals("yes"));
        System.out.println("Game over.");
        scanner.close();
    }
}
