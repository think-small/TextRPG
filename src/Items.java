public abstract class Items {
    protected String name;
    protected String description;
    protected int value;

    public Items(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    abstract void use();

    protected String getName() {
        return this.name;
    }
    protected String getDescription() {
        return this.description;
    }
    protected int getValue() {
        return this.value;
    }
}