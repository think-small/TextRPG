public abstract class Items {
    protected String name;
    protected String description;
    protected int value;

    public Items(String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    abstract String use();

    protected String getName() {
        return this.name;
    }
    protected String getDescription() {
        return this.description;
    }
    protected int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else if ( !(this.getClass() == o.getClass()) ) return false;
        else {
            Items obj = (Items) o;
            return ( (obj.toString() == this.toString()) && (obj.getValue() == this.getValue()) );
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.getClass().getName().hashCode();
        result = 31 * result + this.getName().hashCode();
        result = 31 * result + this.getValue();
        return result;
    }
}