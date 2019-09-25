class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.addSpell(new SpitFireSpell());
        player.addSpell(new FrostbiteSpell());
        player.addSpell(new StaticDischargeSpell());

        Enemy baddie = new ShadyDudeEnemy();
        Enemy salesman = new PersistentSalesmanEnemy();

        player.getSpell("SpitFireSpell").cast(player, baddie);
        player.getSpell("FrostbiteSpell").cast(player, baddie);
        System.out.println(baddie.getName() + "'s HP is at: " + baddie.getHp());
        System.out.println("You have " + player.getMana() + " mana left");

        player.getSpell("StaticDischargeSpell").cast(player, salesman);
        player.getSpell("SpitFireSpell").cast(player, salesman);
        System.out.println(salesman.getName() + "'s HP is at " + salesman.getHp());
        System.out.println("You have " + player.getMana() + " mana left");

        System.out.println(salesman.toString());
        System.out.println(baddie.toString());
    }
}