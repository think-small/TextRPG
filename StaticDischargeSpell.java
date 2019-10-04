public class StaticDischargeSpell implements Spells {

    private final int MANA_COST = 6;

    @Override
    public boolean cast(Player player, Enemy target) {
    /*
      Single target electricity spell
      return type: boolean, true if player has enough mana and damage is done, false if player lacks sufficient mana.
    */
        int damage;

        if (checkMana(player, this.MANA_COST)) {
            damage = calculateDamage();
            target.setHp(target.getHp() - damage);
            depleteMana(player, this.MANA_COST);
            System.out.println("You furiously shuffle your sock-covered feet along a rug to build up static electricity.");
            System.out.println("You discharge the built up electricity and shock " + target.getName() + " and do " + damage + " damage.");
            return true;
        }
        else {
            System.out.println("You tried casting " + this.getSpellName() + " but didn't have enough mana!");
            return false;
        }
    }

    @Override
    public int calculateDamage() {
        int MIN = 3;
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