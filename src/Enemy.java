import java.util.Random;

public abstract class Enemy {
    protected String name;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int magicResist;
    protected int speed;
    protected static Random random = new Random();

    public Enemy(String name, int hp, int attack, int defense, int magicResist, int speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.magicResist = magicResist;
        this.speed = speed;
    }

    @Override
    public String toString() {
        String str = this.getClass().getName();
        str = str.replace("Enemy", "");
        str = str.replaceAll("(?<!^)([A-Z])", " $1");
        return str;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getMagicResist() {
        return this.magicResist;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setMagicResist(int magicResist) {
        this.magicResist = magicResist;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}