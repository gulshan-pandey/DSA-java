import java.util.*;

class guessTheNo {
    Random ran = new Random();
    Scanner sc = new Scanner(System.in);
    private int compNumber;
    private int userInput;
    private int noOfGuesses = 0;

    public guessTheNo() {
        this.compNumber = ran.nextInt(100) + 1;
    }

    public void setName() {
        System.out.println(" Guess the number bw 1 and 100");
        userInput = sc.nextInt();
        noOfGuesses++;

        if (userInput < compNumber) {
            System.out.println("your no is less than the actual number");

        } else if (userInput > compNumber) {
            System.out.println("your no is greater than the actual number");

        } else {
            System.out.format("you guessed the correct number which is %d and you did it in %d no. of times ", compNumber,noOfGuesses);

           }

    }

    public boolean setNoOfGuesses() {
        if (userInput == compNumber) {
            return true;
        } else
            return false;

    }

}

public class guessTheNumber {
    public static void main(String[] args) {

        guessTheNo game = new guessTheNo();

        while (true) {
            game.setName();

            if (game.setNoOfGuesses()) {
                break;
            }

        }

    }
}

// import java.util.Random;
// import java.util.Scanner;

// class Games{
// public int number;
// public int inputNumber;
// public int noOfGuesses = 0;

// Games(){
// Random rand = new Random();
// this.number = rand.nextInt(100);
// }

// void takeUserInput(){
// System.out.println("Guess the number");
// Scanner sc = new Scanner(System.in);
// inputNumber = sc.nextInt();
// }
// boolean isCorrectNumber(){
// noOfGuesses++;
// if (inputNumber==number){
// System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d
// attempts", number, noOfGuesses);
// return true;
// }
// else if(inputNumber<number){
// System.out.println("Too low...");
// }
// else if(inputNumber>number){
// System.out.println("Too high...");
// }
// return false;
// }

// }
// public class qqq {
// public static void main(String[] args) {
// /*
// Create a class Game, which allows a user to play "Guess the Number"
// game once. Game should have the following methods:
// 1. Constructor to generate the random number
// 2. takeUserInput() to take a user input of number
// 3. isCorrectNumber() to detect whether the number entered by the user is true
// 4. getter and setter for noOfGuesses
// Use properties such as noOfGuesses(int), etc to get this task done!
// */

// Games g = new Games();
// boolean b= false;
// while(!b){
// g.takeUserInput();
// b = g.isCorrectNumber();
// }

// }
// }
