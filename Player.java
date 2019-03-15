package Task5;

import java.util.Objects;
import java.util.Random;

public class Player {
    private int damage;
    private int chanceToDoubleDamage;
    private int hp;
    private String playerName;
    private Random random;

    public Player(int damage, int chanceToDoubleDamage, int hp, String playerName) {
        this.damage = damage;
        this.chanceToDoubleDamage = chanceToDoubleDamage;
        this.hp = hp;
        this.playerName = playerName;
        this.random = new Random();
    }

    public void playerAttack(Monster monster){
        int hit = random.nextInt(100);
        if (hit<=chanceToDoubleDamage){
            monster.setHp(monster.getHp()-2*damage);
        }
        else {
            monster.setHp(monster.getHp()-damage);
        }

    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getChanceToDoubleDamage() {
        return chanceToDoubleDamage;
    }

    public void setChanceToDoubleDamage(int chanceToDoubleDamage) {
        this.chanceToDoubleDamage = chanceToDoubleDamage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return damage == player.damage &&
                chanceToDoubleDamage == player.chanceToDoubleDamage &&
                hp == player.hp &&
                Objects.equals(playerName, player.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(damage, chanceToDoubleDamage, hp, playerName);
    }
}
