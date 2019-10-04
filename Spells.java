import java.util.Random;

public interface Spells {
    Random random = new Random();

    boolean cast(Player player, Enemy target);
    int calculateDamage();

    default boolean checkMana(Player player, int manaCost) {
        boolean enoughMana = (player.getMana() >= manaCost) ? true : false;
        return enoughMana;
    }

    default void depleteMana(Player player, int manaCost) {
        player.setMana(player.getMana() - manaCost);
    };

    default Random getRandom() {
        return this.random;
    }

    default String getSpellName() {
        return this.getClass().getName();
    }
}