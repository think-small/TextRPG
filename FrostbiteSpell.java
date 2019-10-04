import java.util.Random;

public class FrostbiteSpell implements Spells {

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
            System.out.println("You tried casting " + this.getSpellName() + " but didn't have enough mana!");
            return false;
        }
    }

    @Override
    public int calculateDamage() {
        int MIN = 2;
        int MAX = 4;

        return random.nextInt((MAX - MIN) + 1) + MIN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else if (!(o.getClass() == this.getClass())) {
            return false;
        }
        else {
            Spells casted = (Spells) o;
            return casted.getClass().getName().equals(this.getClass().getName());
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.getClass().getName().hashCode();
        return result;
    }

}