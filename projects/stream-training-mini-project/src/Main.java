import java.util.List;
import java.util.Map;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import mockdata.MockData;

public class Main {

    public enum TaskName {
        A1, A2, A3, A4, A5, A6,
        B1, B2, B3, B4, B5, B6,
        C1, C2, C3, C4, C5, C6,
        D1, D2, D3, D4, D5, D6,
        E1, E2, E3, E4, E5, E6,
        F1, F2, F3, F4, F5, F6
    }

    private static final TaskName TASK_CHOOSEN = TaskName.A3;

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
            case TaskName.A3: {
                Map<Long, Double> result = task.A3();
                if (result != null) {
                    result.forEach(
                        (studentId, studentGpa) -> System.out.println(String.format("Id=%d, GPA=%f", studentId, studentGpa)));
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
