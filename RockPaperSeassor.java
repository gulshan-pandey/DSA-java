import java.util.Random;
import java.util.Scanner;

public class RockPaperSeassor {
   
    public static void main(String[] args) {
        

        
    // ROCK, PAPER ,SEASOR    GAME

        System.out.println("LETS PLAY ROCK PAPER SEASOR \n\n\n");

        Random ran = new Random();
        Scanner sc= new Scanner(System.in);
        System.out.println("now we will play rock paper and sessor:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        int syswin = 0;
        int uwin = 0;

        for (int i = 0; i < 6; i++) {
            int numb = ran.nextInt(3 - 1 + 1) + 1;
            String play;
            if (numb == 1) {
                play = "rock";
            } else if (numb == 2) {
                play = "paper";
            } else {
                play = "seassor";
            }
            System.out.print("enter your number : ");
            int user = sc.nextInt();

            if (numb == user) {
                System.out.println("tie hogya jiiii ! \n\n");
            } else if ((user == 1 && numb == 2) || (user == 2 && numb == 3) || (user == 3 && numb == 1)) {
                System.out.println("system wins !\n\n");

                syswin = syswin + 1;
            } else {
                System.out.println("you won !!!");

                uwin = uwin + 1;
            }
        }
        if (syswin == 3) {
            System.out.println("hence the system wins");
        } else if (syswin == uwin) {
            System.out.println("the mathch is tied");
        } else {
            System.out.println("you won the final game !!!!");
        }

    }
    
}