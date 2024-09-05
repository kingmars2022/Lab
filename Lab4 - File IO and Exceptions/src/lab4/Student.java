package lab4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private double grade;
    private String name;

    public Student(String studentID, double grade, String name) {
        this.studentID = studentID;
        this.grade = grade;
        this.name = name;
    }

    public static List<Student> load(String filename) throws IOException, BadParseException, InvalidIdException, InvalidGradeException {
        List<Student> students = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length != 3) {
                throw new BadParseException("Invalid line format: " + line);
            }

            String studentID = parts[0];
            if (studentID.length() != 8) {
                throw new InvalidIdException("ID is out of valid range.");
            }

            try {
                Integer.parseInt(studentID);
            } catch (NumberFormatException e) {
                throw new InvalidIdException("ID is out of valid range.");
            }

            double grade;
            try {
                grade = Double.parseDouble(parts[1]);
            } catch (NumberFormatException e) {
                throw new InvalidGradeException("Grade is not a valid number: " + parts[1]);
            }

            String name = parts[2].trim();
            students.add(new Student(studentID, grade, name));
        }
        reader.close();
        return students;
    }

    public static void print(String filename, int indexToDelete) throws IOException, BadParseException, InvalidIdException, InvalidGradeException {
        List<Student> students = load(filename);
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        for (int i = 0; i < students.size(); i++) {
            if (i != indexToDelete) {
                writer.write(students.get(i).toString());
                writer.newLine();
                System.out.println(students.get(i));
            }
        }
        writer.close();
    }

    @Override
    public String toString() {
        return studentID + "," + grade + "," + name;
    }
}
