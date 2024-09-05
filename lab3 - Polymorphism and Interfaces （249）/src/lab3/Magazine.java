package lab3;

public class Magazine extends LibraryItem implements Borrowable {

    private boolean isCheckedOut;

    public Magazine(String title, String author) {
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
        return "Magazine: " + super.toString();
    }

    @Override
    public String toString() {
        return "Magazine {Checked out: " + isCheckedOut + "} " + super.toString();
    }

}
