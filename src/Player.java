import java.io.Serializable;
import java.util.*;

public class Player {

    private int gold;
    private int mana;
    private ArrayList<Spells> spells;
    private ArrayList<Abilities> abilities;
    private HashMap<String, int[]> inventory;
    private ArrayList<Equipable> equipment;

    public Player(int gold, int mana, ArrayList<Spells> spells, ArrayList<Abilities> abilities, HashMap<String, int[]> inventory, ArrayList<Equipable> equipment) {
        this.gold = gold;
        this.mana = mana;
        this.spells = spells;
        this.abilities = abilities;
        this.inventory = inventory;
        this.equipment = equipment;
    }

    public Player() {
        this(0, 15, new ArrayList<Spells>(), new ArrayList<Abilities>(), new HashMap<String, int[]>(), new ArrayList<Equipable>());
    }

    public void addSpell(Spells spell) {
        this.spells.add(spell);
    }

    public void removeSpell(Spells spell) {
        this.spells.remove(spell);
    }

    public Spells getSpell(String str) {
        for (Spells spell : this.getSpells()) {
            if (spell.toString() == str) {
                return spell;
            }
        }
        return null;
    }

    public int getGold() {
        return this.gold;
    }

    public int getMana() {
        return this.mana;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public ArrayList<Spells> getSpells() {
        return this.spells;
    }

}