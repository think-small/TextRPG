import java.util.Random;

public class PaperSwordWeaponItem extends Items implements WeaponItems {

    private int ATTACK_MODIFIER;
    private Random rand = new Random();

    public PaperSwordWeaponItem() {
        super("Paper Sword", "A piece of paper that was folded several times - it sort of resembles a sword.", 2);
        this.setAttackModifier();
    }

    @Override
    public String use() {
        increaseAttack(player);
        return String.format("Increased attack by %d!", this.ATTACK_MODIFIER);
    }

    @Override
    public void increaseAttack(Player player) {
        player.setAttack(player.getAttack() + this.getAttackModifier());
    }

    @Override
    public void setAttackModifier() {
        int min = 0, max = 2;
        this.ATTACK_MODIFIER = min + (int) ( Math.random() * ( (max - min ) + 1) );
    }

    public int getAttackModifier() {
        return this.ATTACK_MODIFIER;
    }
}
