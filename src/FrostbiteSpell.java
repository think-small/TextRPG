import java.util.Random;

public class FrostbiteSpell extends Spells {

    private final int MANA_COST = 4;

    @Override
    public boolean cast(Player player, Enemy target) {
    /*
      Single target freeze spell
      return type: boolean, true if player has enough mana and damage is done, false if player lacks sufficient mana.

      TODO: create chance to give enemy "frozen" status
    */
        int damage;

        if (checkMana(player, this.MANA_COST)) {
            damage = calculateDamage();
            target.setHp(target.getHp() - damage);
            depleteMana(player, this.MANA_COST);
            System.out.println("You whistle for your dog Frostbite to come to your assistance.");
            System.out.println("Frostbite bites " + target.getName() + " for " + damage + " damage.");
            return true;
        }
        else {
            System.out.println("You tried casting " + this.toString() + " but didn't have enough mana!");
            return false;
        }
    }

    @Override
    public int calculateDamage() {
        int MIN = 2;
        int MAX = 4;

        return random.nextInt((MAX - MIN) + 1) + MIN;
    }

}