public class ShadyDudeEnemy extends Enemy {

    public ShadyDudeEnemy(String name, int hp, int attack, int defense, int magicResist, int speed) {
        super(name, hp, attack, defense, magicResist, speed);
    }

    public ShadyDudeEnemy() {
        this(EnemyNames.SHADY_DUDE_NAMES.getNames()[ random.nextInt(EnemyNames.SHADY_DUDE_NAMES.getNames().length ) ], 10, 2, 0, 0, 1);
    }

}