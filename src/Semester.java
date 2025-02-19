import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Semester {
    private ArrayList<Course> courses;
    private String semester;
    private int totalCredits;

    public Semester() {
        courses = new ArrayList<>();
        semester = "Spring 2019";
        totalCredits = 0;
    }
    public void readSchedule(String filename){
        try {
            Scanner scnr = new Scanner(new File(filename));
            this.semester = scnr.nextLine();
            scnr.nextLine();
            while (scnr.hasNext()) {
                String[] line = scnr.nextLine().split("\\|");
                String name = line[0];
                String instructor = line[1];
                int credits = Integer.parseInt(line[2]);
                Course course = new Course(name, instructor, credits);
                courses.add(course);
                this.totalCredits += credits;
            }
        }
            catch (FileNotFoundException f) {
                System.out.println(f);
            }


    }
    public String toString() {
        String returnString = "Semester: " + semester + ", Total Credits: " + totalCredits + "\n";
        for (Course c:courses) {
            returnString += c + "\n";
        }
        return returnString;
    }


}
