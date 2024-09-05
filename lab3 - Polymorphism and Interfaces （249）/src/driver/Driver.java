package driver;

import java.util.Scanner;
import lab3.*;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int numBooks = scanner.nextInt();
        System.out.print("Enter number of magazines: ");
        int numMagazines = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Borrowable[] items = new Borrowable[numBooks + numMagazines];

        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter title of book " + (i + 1) + ": ");
            String title = scanner.nextLine();
            System.out.print("Enter author of book " + (i + 1) + ": ");
            String author = scanner.nextLine();
            items[i] = new Book(title, author);
        }

        for (int i = 0; i < numMagazines; i++) {
            System.out.print("Enter title of magazine " + (i + 1) + ": ");
            String title = scanner.nextLine();
            System.out.print("Enter author of magazine " + (i + 1) + ": ");
            String author = scanner.nextLine();
            items[numBooks + i] = new Magazine(title, author);
        }

        for (Borrowable item : items) {
            item.checkOut();
            if (item instanceof LibraryItem li) {
                System.out.println("This is a LibraryItem: " + li.getDetails());
            }
            System.out.println(item.toString());
        }

        for (Borrowable item : items) {
            item.returnItem();
            System.out.println(item.toString());
        }

        scanner.close();
    }
}
