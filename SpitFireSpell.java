public class SpitFireSpell implements Spells {

    private final int MANA_COST = 5;

    @Override
    public boolean cast(Player player, Enemy target) {
    /*
      Single target fire spell
      return type: boolean, true if player has enough mana and damage is done, false if player lacks sufficient mana.

      TODO: create DOT effect if spells are stacked
    */
        int damage;

        if (checkMana(player, this.MANA_COST)) {
            damage = calculateDamage();
            target.setHp(target.getHp() - damage);
            depleteMana(player, this.MANA_COST);
            System.out.println("A random stranger drops a wild beat, and you begin to spit fire at your opponent.");
            System.out.println("Your sick rhymes do " + damage + " damage to " + target.getName());
            return true;
        }
        else {
            System.out.println("You tried casting " + this.getSpellName() + " but didn't have enough mana!");
            return false;
        }
    }

    @Override
    public int calculateDamage() {
        int MIN = 1;
        int MAX = 5;
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