package prototypePattern.prototypes;

public class Book extends Item {

    private String title;

    public Book(String title){
        type = "Book";
        this.title = title;
    }

    public void makeSth(){
        System.out.println("Hello im a Book");
    }

}
