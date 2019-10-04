import java.util.ArrayList;

public enum EnemyNames {
    SHADY_DUDE_NAMES(new String[]{"Shady Joe", "Shady Johnny", "Shady Slim", "Shady Sam", "Shady Susie", "Shady Geoffrey", "Shady Cersi"}),
    PERSISTENT_SALESMAN(new String[]{"Big Al", "Trusty Steve", "Rudy Russ", "Joey Bucks", "Big Jay", "Trusty Tim", "Dealin' Dennis"});

    private String[] names;

    EnemyNames(String[] names) {
        this.names = names;
    }

    public String[] getNames() {
        return this.names;
    }
}
