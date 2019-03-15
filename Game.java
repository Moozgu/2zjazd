package Task5;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Monster monster = new Monster(100,100,100, "Imp");
        Player player = new Player(100,0,100, "Hero");

        System.out.println("Podaj ilosc rund");
        int rounds = scanner.nextInt();

        for (int i = 1; (i<=rounds)&&(monster.getHp()>0)&&(player.getHp()>0);i++){
            player.playerAttack(monster);
            if(monster.getHp()<=0){
                break;
            }
            monster.monsterAttack(player);
            System.out.println("zycie gracza "+player.getHp());
            System.out.println("zycie potwora "+monster.getHp());

        }
            if((player.getHp()>monster.getHp())&&player.getHp()>0||monster.getHp()>0){
                System.out.println("Gracz wygral majac "+player.getHp()+" hp");
            }
            else if(monster.getHp()>player.getHp()){
                System.out.println("Potwor wygral majac "+monster.getHp()+" hp");
            }
            else {
                System.out.println("Remis!");
            }


    }

}
