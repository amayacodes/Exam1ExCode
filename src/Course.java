public class Course {
    private String courseName;
    private String instructor;
    private int creditHours;

    public Course() {
        setCourseName(null);
        setInstructor(null);
        setCreditHours(0);

    }
    public Course(String courseName, String instructor, int creditHours) {
        this.setCourseName(courseName);
        this.setInstructor(instructor);
        this.setCreditHours(creditHours);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }
    public String toString(){
        return courseName + ", " + instructor + ", " + creditHours;
    }
}
