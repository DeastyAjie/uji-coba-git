package Java;

import java.util.Scanner;
import java.util.Random;
public class blabla {
    Scanner gg = new Scanner(System.in);
    Random random = new Random();

    void battle() throws InterruptedException{
        System.out.println("Battling...");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int HP = random.nextInt(50)+50;
        int enemyHP = random.nextInt(50)+50;
        do {
            System.out.println("HP: "+HP+"\nEnemy HP: "+enemyHP);
            Thread.sleep(3000);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1.Attack\n2.Defense\n3.Dodge");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int option = gg.nextInt();
            switch (option) {
                case 1: int Attack = random.nextInt(10)+10; int enemy = random.nextInt(10);
                System.out.println("You attack the enemy!");
                Thread.sleep(2000);
                if (enemy >=0 && enemy <=3) {
                System.out.println("~~~~~~~~~~~~~~~~");
                }
            }
        } while (false);
    }
}
