import java.util.*;
import java.util.stream.Stream;

public class ItemsContainer {
    private Map<Items, Integer> itemsMap = new HashMap<>();

    public void addItems(String itemToFind, String areaFound) {
        // TODO: Improve hashing of items
        /*
            Check if itemToFind already exists in itemsContainer.  If it does, increment its value by 1. If not,
            ensure the item exists by searching through ItemsFactory values. If it exists, put it in itemsContainer
            with a value of 1.
            itemToFind type: String, name of the item to be added
            areaFound type: String, corresponds to value from ItemNamesEnum.java
         */
        for (Items item : this.getItemsMap().keySet()) {
            if (item.toString().equals(itemToFind)) {
                this.itemsMap.put(item, this.itemsMap.get(item) + 1);
                return;
            }
        }
        switch (areaFound.toUpperCase()) {
            case "UBIQUITOUS":
            case "LEVEL_ONE":
            case "LEVEL_TWO":
                String foundUbiquitousItem = searchItemsList(itemToFind, areaFound);
                add(foundUbiquitousItem);
                System.out.println("Successfully got: " + foundUbiquitousItem.toString());
                break;
        }
    }

    public Map<Items, Integer> getItemsMap() {
        return this.itemsMap;
    }

    private String searchItemsList(String itemToFind, String areaName) {

        for (ItemNamesEnum value : ItemNamesEnum.values()) {
            if (value.toString().equals(areaName)) {
                return Stream.of(value.getItemNames())
                        .filter(knownItem -> knownItem.equals(itemToFind))
                        .findFirst()
                        .orElse(null);
            }
        }
        return null;
    }

    private void add(String itemName) {
        if (itemName != null) {
            ItemsFactory factory = new ItemsFactory();
            this.itemsMap.put(factory.createItem(itemName), 1);
        }
        else {
            System.out.println("Unable to add item");
        }
    }
}
