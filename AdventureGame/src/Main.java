import gameCharacter.Archer;
import gameCharacter.GameCharacter;
import gameCharacter.Knight;
import gameCharacter.Samurai;
import player.Game;
import player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new Samurai();
        String characters = "Characters\n";
        characters += gameCharacter + "\n";
        gameCharacter = new Archer();
        characters += gameCharacter+ "\n";
        gameCharacter = new Knight();
        characters += gameCharacter + "\n";
        System.out.println(characters);

        Scanner scan = new Scanner(System.in);
        System.out.println("[S]amurai - [A]rcher - [K]night - (Quit = [Q])");
        String temp;
        while(true) {
            temp = scan.nextLine();
            switch (temp) {
                case "S":
                    gameCharacter = new Samurai();
                    break;
                case "A":
                    gameCharacter = new Archer();
                    break;
                case "K":
                    gameCharacter = new Knight();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Incorrect Entry");
                    break;
            }
            if(temp.equals("S") || temp.equals("A") || temp.equals("K"))
                break;
            else if (temp.equals("Q"))
                System.exit(0);
        }
        System.out.println("Player Name ?");
        temp = scan.nextLine();
        Player player = new Player(temp);
        Game game = new Game(player, gameCharacter);
        game.start();
    }
}