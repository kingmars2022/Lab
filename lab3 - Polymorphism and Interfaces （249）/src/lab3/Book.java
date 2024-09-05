package lab3;

public class Book extends LibraryItem implements Borrowable {

    private boolean isCheckedOut;

    public Book(String title, String author) {
        super(title, author);
        this.isCheckedOut = false;
    }

    @Override
    public void checkOut() {
        isCheckedOut = true;
        System.out.println(getTitle() + " has been checked out.");
    }

    @Override
    public void returnItem() {
        isCheckedOut = false;
        System.out.println(getTitle() + " has been returned.");
    }

    @Override
    public String getDetails() {
        return "Book: " + super.toString();
    }

    @Override
    public String toString() {
        return "Book {Checked out: " + isCheckedOut + "} " + super.toString();
    }

}
