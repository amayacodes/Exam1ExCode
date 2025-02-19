public class Main {
    public static void main(String[] args) {

        Course course = new Course("COMP163","Faltyn",3);
        System.out.println(course.toString());

        Course [] courses = new Course[100];

        for (int i = 0;i < courses.length; i++) {
            courses[i] = new Course("COMP167","Bryant",3);
        }

        for (int i = 0;i < courses.length; i++) {
            System.out.println(courses[i].toString());
        }
        Semester semester = new Semester();
        semester.readSchedule("course and semester.txt");
        System.out.println(semester.toString());

    }
}
