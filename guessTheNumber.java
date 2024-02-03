import java.util.*;

class guessingGame {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int system;
    int guessed;
    int noOfGuesses;

    guessingGame() {
        system = random.nextInt(100) + 1;
        System.out.println("hey lets play guess the number challange !");
        System.out.println(noOfGuesses);
        guessed();
    }

    void guessed() {
        System.out.println("enter the number from 1 to 100");
        guessed = sc.nextInt();
        start();
    }

    void start() {
        if (guessed < system) {
            System.out.println("your number is too small, guess again with bigger number!!!");
            noOfGuesses++;
            guessed();
        } else if (guessed > system) {
            System.out.println("your number is too large,guess again with shorter number!!!");
            noOfGuesses++;
            guessed();

        } else {
            System.out.println("you entered the correct number : kudos🙌🙌");
            noOfGuesses++;
        }
    }

    @Override
    public String toString() {
        return "guessingGame [system=" + system + ", guessed=" + guessed + ", noOfGuesses=" + noOfGuesses + "]";
    }

    

}

public class guessTheNumber {
    public static void main(String[] args) {

        guessingGame guess = new guessingGame();
        System.out.println(guess);
        

    }
}






// import java.util.*;


// class guessTheNo {
//     Random ran = new Random();
//     Scanner sc = new Scanner(System.in);
//     private int compNumber;
//     private int userInput;
//     private int noOfGuesses = 0;

//     public guessTheNo() {
//         this.compNumber = ran.nextInt(100) + 1;
//     }

//     public void setnum() {
//         System.out.println(" Guess the number bw 1 and 100");
//         userInput = sc.nextInt();
//         noOfGuesses++;

//         if (userInput < compNumber) {
//             System.out.println("your no is less than the actual number");

//         } else if (userInput > compNumber) {
//             System.out.println("your no is greater than the actual number");

//         } else {
//             System.out.format("you guessed the correct number which is %d and you did it in %d no. of times ", compNumber,noOfGuesses);

//            }

//     }

//     public boolean setNoOfGuesses() {
//         if (userInput == compNumber) {
//             return true;
//         } else
//             return false;

//     }

// }



// public class guessTheNumber {
//     public static void main(String[] args) {

//         guessTheNo game = new guessTheNo();

//         while (true) {
//             game.setnum();

//             if (game.setNoOfGuesses()) {
//                 break;
//             }

//         }

//     }
// }



