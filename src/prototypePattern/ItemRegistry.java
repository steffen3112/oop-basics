package prototypePattern;

import prototypePattern.prototypes.Book;
import prototypePattern.prototypes.Dvd;
import prototypePattern.prototypes.Item;

import java.util.HashMap;
import java.util.Hashtable;

public class ItemRegistry {

    private Hashtable<String, Item> itemMap =  new Hashtable<String, Item>();

    public void addItem(String id, Item item){
        itemMap.put(id, item);
    }

    public Item getItems(String id){
        Item cachedItem =  itemMap.get(id);
        return (Item) cachedItem.clone();
    }


}
