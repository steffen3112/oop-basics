package prototypePattern;

import prototypePattern.prototypes.Book;
import prototypePattern.prototypes.Dvd;
import prototypePattern.prototypes.Item;

public class Client {

    public static void main(String[] args){

        //Setting up "sample Data"====================
        Book book = new Book("Design Patterns");
        book.setPrice(39);
        Dvd dvd =  new Dvd("Sin City");
        dvd.setPrice(55);
        dvd.setId("1297128492zdahflkshf");
        Dvd dvd2 =  new Dvd("Avatar");
        dvd2.setPrice(33);
        dvd.setId("sdfsr2");

        //Setting up new ItemRegistry================
        ItemRegistry itemRegistry = new ItemRegistry();
        itemRegistry.addItem("1", book);
        itemRegistry.addItem("2", dvd);
        itemRegistry.addItem("3", dvd2);

        //Retrieving cloned Items====================
        Item clonedItems = (Item) itemRegistry.getItems("1");
        System.out.println("Here is the Prototype of " + clonedItems.getType());
        Item clonedItems2 = (Item) itemRegistry.getItems("2");
        System.out.println("Here is the Prototype of " + clonedItems2.getType() + " " + clonedItems2.getPrice() + "  " + clonedItems2.getId()+  " "+ clonedItems2.getClass());
        Item clonedItems3 = (Item) itemRegistry.getItems("3");
        System.out.println("Here is the Prototype of " + clonedItems3.getType() + " " + clonedItems3.getPrice() + clonedItems3.getType() );



    }
}
