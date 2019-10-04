import java.util.*;

public class SpellContainer {
    private Set<Spells> spellSet = new HashSet<>();

    public void addSpell(String spellName) {
        switch (spellName) {
            case "FrostbiteSpell":
                this.spellSet.add(new FrostbiteSpell());
                System.out.println("FrostbiteSpell learned!");
                break;
            case "SpitFireSpell":
                this.spellSet.add(new SpitFireSpell());
                System.out.println("SpitFireSpell learned!");
                break;
            case "StaticDischargeSpell":
                this.spellSet.add(new StaticDischargeSpell());
                System.out.println("StaticDischargeSpell learned!");
                break;
            default:
                System.out.println("Invalid spell name given");
        }
    }

    public void removeSpell(String nameOfSpell) {
        this.spellSet.remove(this.findSpell(nameOfSpell));
    }

    public Set<Spells> getSpells() {
        return this.spellSet;
    }

    public Spells findSpell(String spellName) {
        return this.spellSet.stream()
                .filter(e -> spellName.equals(e.toString()))
                .findFirst()
                .orElse(null);
    }
}
