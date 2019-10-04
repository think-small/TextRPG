import java.util.*;

public class Player {

    private int gold, mana, attack;
    private SpellContainer spellContainer;
    private ArrayList<Abilities> abilities;
    private ItemsContainer itemsContainer;
    private ArrayList<Equippable> equipment;

    public Player(int gold, int mana, int attack, SpellContainer spellContainer, ArrayList<Abilities> abilities, ItemsContainer itemsContainer, ArrayList<Equippable> equipment) {
        this.gold = gold;
        this.mana = mana;
        this.attack = attack;
        this.spellContainer = spellContainer;
        this.abilities = abilities;
        this.itemsContainer = itemsContainer;
        this.equipment = equipment;
    }

    public Player() {
        this(0, 15, 5, new SpellContainer(), new ArrayList<Abilities>(), new ItemsContainer(), new ArrayList<Equippable>());
    }

    public int getGold() {
        return this.gold;
    }

    public int getMana() {
        return this.mana;
    }

    public int getAttack() { return this.attack; }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public SpellContainer getSpellContainer() {
        return this.spellContainer;
    }

    public ItemsContainer getItemsContainer() {
        return this.itemsContainer;
    }

}