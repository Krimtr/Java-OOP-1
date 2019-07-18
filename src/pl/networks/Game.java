package pl.networks;


import java.util.Random;
import java.util.Scanner;

public class Game {
    private int secretNumber;

    public Game()
    {
        Random rand = new Random();
        this.secretNumber = rand.nextInt(100);
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void startGame()
    {
        System.out.println("Welcome, try to guess number from 1-100");
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        int numberGuess = 0;
        boolean win = false;
        //10 tries to guess
        for (int i = 10 ; i >=1; i--) {
            System.out.println("Remaining tries " + i);
            System.out.println("Your number: ");
            numberGuess = Integer.parseInt(scanner.nextLine());
            if (numberGuess == game.getSecretNumber())
            {
                System.out.println("You WON!!");
                win = true;
                break;
            }
            else if (numberGuess > game.getSecretNumber())
            {
                System.out.println("Number is smaller than " + numberGuess);
            }
            else
            {
                System.out.println("Number is larger than " + numberGuess);
            }
        }
        if (!win)
        {
            System.out.println("You Loose, better luck next time");
        }

    }
}
