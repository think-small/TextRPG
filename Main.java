import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.getSpellContainer().addSpell("SpitFireSpell");
        player.getSpellContainer().addSpell("FrostbiteSpell");
        player.getSpellContainer().addSpell("StaticDischargeSpell");

        Enemy baddie = new ShadyDudeEnemy();
        Enemy salesman = new PersistentSalesmanEnemy();

        player.getSpellContainer().findSpell("SpitFireSpell").cast(player, baddie);
        player.getSpellContainer().findSpell("FrostbiteSpell").cast(player, baddie);
        System.out.println(baddie.getName() + "'s HP is at: " + baddie.getHp());
        System.out.println("You have " + player.getMana() + " mana left");

        player.getSpellContainer().findSpell("StaticDischargeSpell").cast(player, salesman);
        player.getSpellContainer().findSpell("SpitFireSpell").cast(player, salesman);
        System.out.println(salesman.getName() + "'s HP is at " + salesman.getHp());
        System.out.println("You have " + player.getMana() + " mana left");

        System.out.printf("You are fighting a %s%n", salesman.toString());
        System.out.printf("You are fighting a %s%n", baddie.toString());

        System.out.printf("You are forgetting %s!%n", player.getSpellContainer().findSpell("FrostbiteSpell").getSpellName());
        player.getSpellContainer().removeSpell("FrostbiteSpell");
        System.out.printf("Learned Spells (%d): ", player.getSpellContainer().getSpells().size());
        player.getSpellContainer().getSpells().stream()
                .forEach(spell -> System.out.printf("%s ", spell.getSpellName()));
        System.out.println();

        player.getItemsContainer().addItems("StoneItem", "UBIQUITOUS");
        player.getItemsContainer().addItems("PaperSwordWeaponItem", "LEVEL_ONE");
        player.getItemsContainer().addItems("StoneItem", "UBIQUITOUS");
        System.out.printf("Number of items in inventory: %d%n", player.getItemsContainer().getItemsMap().keySet().size());
    }
}