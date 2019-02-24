import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class GamePlay extends Item{
    private int anw;
    private String name;
    private int HP;
    private int Atk;
    private int HPDemon;
    private int AtkDemon;
    private int Level;

    public GamePlay(String _name){
        anw = 0;
        name = _name;
        HP = 100;
        Atk = 10;
        HPDemon = 150;
        AtkDemon = 15;
        Level = 1;
    }
    public void game(){
        System.out.println("----------------------------------------");
        System.out.println("Please choose Knight classes servant");
        System.out.println("1.Saber");
        System.out.println("2.Archer");
        System.out.println("3.Lancer");

        Scanner scanner = new Scanner(System.in);
        System.out.print(">: ");
        anw  = scanner.nextInt();
        System.out.println("-----------------------------------------");
        ClassServant c = new ClassServant();
        System.out.println(name + " " + c.choosClassServant(anw));
        Item i = new Item();
        i.print(0, 0, 0);
        System.out.println("Your Status");
        System.out.println("Level: " + Level);
        System.out.println("HP: " + HP);
        System.out.println("Atk: " + Atk);
        System.out.println("-----------------------------------------");
        System.out.println(name + " VS Demon Night" );
        while(HP > 0 && HPDemon > 0){
            System.out.println("-----------------------------------------");
            System.out.println(name + " " + c.choosClassServant(anw));
            i.print(0, 0, 0);
            System.out.println("Your Status");
            System.out.println("Level: " + Level);
            System.out.println("HP: " + HP);
            System.out.println("Atk: " + Atk);
            System.out.println("-----------------------------------------");
            System.out.println("-------------------------------------------");
            System.out.println("Names: Demon Night");
            System.out.println("Level: 1");    
            System.out.println("HP: " + HPDemon);
            System.out.println("Atk: " + AtkDemon);
            System.out.println("-------------------------------------------");
            System.out.println("1.Attack");
            System.out.println("2.Use firstAid");
            System.out.println("3.Use bandages");
            System.out.println("4.Use bufAttack");
            int choice  = scanner.nextInt();
            if(choice == 1){
                HP -= 15;
                HPDemon -= Atk;
            }else if(choice == 2){
                HP += 100;
                HP -= 15;
                i.print(1, 0, 0);
            }else if(choice == 3){
                HP += 20;
                HP -= 15;
                i.print(0, 1, 0);
            }else{
                Atk += 5;
                HP -= 15;
                i.print(0, 0, 1);
            }
        }
        if(HP > 0){
            System.out.println("Congrat!!!");
        }else System.out.println("You lost!!!");
    }
}