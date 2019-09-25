import java.util.Random;

public abstract class Spells {
    protected int MANA_COST;
    protected static Random random = new Random();

    abstract boolean cast(Player player, Enemy target);
    abstract int calculateDamage();

    boolean checkMana(Player player, int manaCost) {
        boolean enoughMana = (player.getMana() >= manaCost) ? true : false;
        return enoughMana;
    }

    void depleteMana(Player player, int manaCost) {
        player.setMana(player.getMana() - manaCost);
    };

    Random getRandom() {
        return this.random;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}