import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Game {
    public static void main(String[] args) {
        ArrayList<Novice> Novices = new ArrayList<Novice>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Fate Stay Night");
        System.out.print("Creat your name: ");
        String name = scanner.nextLine();
        Novices.add(new Novice(name));

        GamePlay i = new GamePlay(name);
        i.game();

    }
}