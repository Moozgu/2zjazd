package Task5;

import java.util.Random;

public class Monster {
    private int damage;
    private int chanceToHit;
    private int hp;
    private String monsterName;
    private Random random;

    public Monster(int damage, int chanceToHit, int hp, String monsterName) {
        this.damage = damage;
        this.chanceToHit = chanceToHit;
        this.hp = hp;
        this.monsterName = monsterName;
        this.random = new Random();
    }
    public void monsterAttack(Player player){
        int hit = random.nextInt(100);
        if (hit<=chanceToHit){
            player.setHp(player.getHp()-damage);
        }


    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getChanceToHit() {
        return chanceToHit;
    }

    public void setChanceToHit(int chanceToHit) {
        this.chanceToHit = chanceToHit;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setName(String monsterName) {
        this.monsterName = monsterName;
    }
}
