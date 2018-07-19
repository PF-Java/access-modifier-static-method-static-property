package BuildClassCourse;

import static BuildClassCourse.Course.dropStudents;

public class Application {
    public static void main(String[] args) {
        Course course = new Course("Java");

        course.addStudent("Anh");

        course.addStudent("Minh");

        course.addStudent("Ha");

        dropStudents("Minh");

        course.printStudents();



    }
}
