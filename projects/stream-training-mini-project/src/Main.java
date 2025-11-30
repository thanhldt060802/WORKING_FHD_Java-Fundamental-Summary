import java.util.List;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import mockdata.MockData;

public class Main {

    public static void main(String[] args) {

        MockData mockData = new MockData(2025L);

        List<Student> students = mockData.students();
        List<Course> courses = mockData.courses();
        List<Enrollment> enrollments = mockData.enrollments(students, courses);

        System.out.println("Mock data - Student:");
        printListEntities(students);
        System.out.println();
        System.out.println("Mock data - Course:");
        printListEntities(courses);
        System.out.println();
        System.out.println("Mock data - Enrollment:");
        printListEntities(enrollments);
        System.out.println();

        // Triển khai các bài toán trong Task.java và kiểm thử bên dưới

        // ...
        
    }

    public static <T> void printEntity(T entity) {
        System.out.println(entity);
    }

    public static <T> void printListEntities(List<T> entities) {
        for (T entity : entities) {
            printEntity(entity);
        }
    }

}
