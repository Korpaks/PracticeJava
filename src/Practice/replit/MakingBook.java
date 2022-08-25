package Practice.replit;

public class MakingBook {
    public static void main(String[] args) {

        Book book1 = new Book(1345, "Igor Korpak", "Euro Trip", 120);
        Book book2 = new Book(2345, "Ducko Milic", "USA trip", 234 );

        Shelf.addBook(book1);
        Shelf.addBook(book2);
        System.out.println(Shelf.getTheBooks());


    }
}
