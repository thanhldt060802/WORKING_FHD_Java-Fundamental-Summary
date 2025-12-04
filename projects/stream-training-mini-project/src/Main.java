import java.util.List;
import java.util.Map;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import mockdata.MockData;

public class Main {

    public enum TaskName {
        A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12,
        B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12,
        C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12,
    }

    private static final TaskName TASK_CHOOSEN = TaskName.B1;

    public static void main(String[] args) {

        MockData mockData = new MockData(2025L);
        List<Student> students = mockData.students();
        List<Course> courses = mockData.courses();
        List<Enrollment> enrollments = mockData.enrollments(students, courses);
        Task task = new Task(students, courses, enrollments);
        task.showData();

        switch (TASK_CHOOSEN) {
            case TaskName.A1: {
                List<Student> result = task.A1();
                if (result != null) {
                    result.forEach(
                        (student) -> System.out.println(student));
                }
                break;
            }
            case TaskName.A2: {
                List<Student> result = task.A2();
                if (result != null) {
                    result.forEach(
                        (student) -> System.out.println(student));
                }
                break;
            }
            case TaskName.B1: {
                Map<Student, Double> result = task.B1();
                if (result != null) {
                    result.forEach(
                        (student, studentGpa) -> System.out.println(String.format("Student=%s, GPA=%f", student, studentGpa)));
                }
                break;
            }
            default: {
                System.out.println("Invalid task choosen!");
                break;
            }
        }

    }

}
