package driver;

import java.io.IOException;
import java.util.Scanner;

import lab4.InvalidGradeException;
import lab4.BadParseException;
import lab4.InvalidIdException;
import lab4.Student;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The name of an input file");
        String in = scanner.next();

        try {
	        for(Student s : Student.load(in)) {
	        	System.out.println(s);
	        }
        } catch(InvalidGradeException e) {
        	System.out.println("InvalidGradeException: " + e);
        	return;
        } catch(BadParseException e) {
        	System.out.println("BadParseException: " + e.getMessage());
        	return;
        } catch(InvalidIdException e) {
        	System.out.println("InvalidIdException: " + e);
        	return;
        } catch(IOException e) {
        	System.out.println("IOException: " + e.getMessage());
        	return;
        }
        System.out.println("Give a 0-based index of an entry to remove, we will then print out all other students");
        try {
        Student.print(in, scanner.nextInt());
		} catch(InvalidGradeException e) {
			System.out.println("InvalidGradeException: " + e);
		} catch(BadParseException e) {
			System.out.println("BadParseException: " + e.getMessage());
		} catch(InvalidIdException e) {
			System.out.println("InvalidIdException: " + e);
		} catch(IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}


        scanner.close();
    }
}
