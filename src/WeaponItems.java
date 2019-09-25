public abstract class WeaponItems extends Items {

    int attackModifier;

    public WeaponItems(String name, String description, int value, int attackModifier) {
        super(name, description, value);
        this.attackModifier = attackModifier;
    }

    public abstract void use();
}
