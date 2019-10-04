public enum ItemNamesEnum {
    UBIQUITOUS(new String[]{ "StoneItem" }),
    LEVEL_ONE(new String[]{ "PaperSwordWeaponItem" });

    private String[] itemNames;

    ItemNamesEnum(String[] itemNames) {
        this.itemNames = itemNames;
    }

    public String[] getItemNames() {
        return this.itemNames;
    }

}
