package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Engine engine = new Engine();

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: {
                Cli.welcomePack();
                break;
            }
            case 2:
                Even evenGame = new Even();
                engine.playGame(evenGame);
                break;
            case 3:
                Calc calculatorGame = new Calc();
                engine.playGame(calculatorGame);
                break;
            case 4:
                GCD gcdGame = new GCD();
                engine.playGame(gcdGame);
                break;
            case 5:
                Progression progressionGame = new Progression();
                engine.playGame(progressionGame);
                break;
            case 6:
                Prime primeGame = new Prime();
                engine.playGame(primeGame);
                break;
            default:
                System.out.println("Please enter the correct game number");
                break;
        }
    }
}
