public class PersistentSalesmanEnemy extends Enemy {

    public PersistentSalesmanEnemy(String name, int hp, int attack, int defense, int magicResist, int speed) {
        super(name, hp, attack, defense, magicResist, speed);
    }

    public PersistentSalesmanEnemy() {
        this(EnemyNames.PERSISTENT_SALESMAN.getNames()[ random.nextInt( EnemyNames.PERSISTENT_SALESMAN.getNames().length ) ], 15, 3, 0, 0, 1);
    }
}