import java.util.ArrayList;

public class SpellContainer {
    ArrayList<Spells> spellList = new ArrayList<>();

    public void addSpell(Spells newSpell) {
        this.spellList.add(newSpell);
    }

    //  TODO figure out how to use streams to find if spell is in spellList by passing in its name
    public void removeSpell(String spellName) {
        Spells spellToRemove = this.spellList.stream()
                .filter(e -> spellName.equals(e.toString()))
                .findFirst()
                .orElse(null);
        this.spellList.remove(spellToRemove);
    }
}
