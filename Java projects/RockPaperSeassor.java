import java.util.*;

public class RockPaperSeassor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Now we will play rock, paper, and scissors:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        int sysWin = 0;
        int userWin = 0;
        System.out.println("how many times you want to play");
        int z = sc.nextInt();
        for (int i = 0; i < z; i++) {

            int num = ran.nextInt(3) + 1;
            String play;

            if (num == 1) {
                play = "rock";
            } else if (num == 2) {
                play = "paper";
            } else {
                play = "scissors";
            }

            System.out.print("Enter your number: ");
            int user = sc.nextInt();

            if (num == user) {
                System.out.println("It's a tie!\n");
            } else if ((user == 1 && num == 2) || (user == 2 && num == 3) || (user == 3 && num == 1)) {
                System.out.println("System wins!\n");
                sysWin++;
            } else {
                System.out.println("You won!\n");
                userWin++;
            }
        }

        if (sysWin == 3) {
            System.out.println("Hence, the system wins the game.");
        } else if (sysWin == userWin) {
            System.out.println("The match is tied.");
        } else {
            System.out.println("You won the final game!");
        }
    }
}
