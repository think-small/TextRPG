public abstract class Abilities {
    abstract void perform();

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}