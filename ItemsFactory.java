public class ItemsFactory {
    public Items createItem(String itemName) {
        switch(itemName) {
            case "StoneItem":
                return new StoneItem();
            case "PaperSwordWeaponItem":
                return new PaperSwordWeaponItem();
        }
        return null;
    }
}
