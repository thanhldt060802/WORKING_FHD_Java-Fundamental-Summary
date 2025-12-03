import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import entity.Course;
import entity.Enrollment;
import entity.Student;

public class Task {

    private List<Student> students; // Danh sách sinh viên
    private List<Course> courses; // Danh sách khoá học
    private List<Enrollment> enrollments; // Danh sách môn học ghi nhận

    public Task(List<Student> students, List<Course> courses, List<Enrollment> enrollments) {
        this.students = students;
        this.courses = courses;
        this.enrollments = enrollments;
    }

    public void showData() {
        System.out.println("Mock data - Student:");
        this.students.forEach(
            (student) -> System.out.println(student));
        System.out.println();
        System.out.println("Mock data - Course:");
        this.courses.forEach(
            (course) -> System.out.println(course));
        System.out.println();
        System.out.println("Mock data - Enrollment:");
        this.enrollments.forEach(
            (enrollment) -> System.out.println(enrollment));
        System.out.println();
    }

    /*
     * Câu A1 - Dễ:
     * - Mô tả: Lọc sinh viên có giới tính nữ.
     * - Trả về: List sinh viên.
     */
    public List<Student> A1() {
        List<Student> result = this.students.stream()
            .filter(
                    (student) -> student.getGender().equals(enumeration.Gender.MALE))
            .collect(Collectors
                    .toList());

        return result;
    }

    /*
     * Câu A2 - Dễ:
     * - Mô tả: Lọc sinh viên có tuổi lớn hơn 21.
     * - Trả về: List sinh viên.
     */
    public List<Student> A2() {
        List<Student> result = this.students.stream()
            .filter(
                    (student) -> student.getAge() > 21)
            .collect(Collectors
                    .toList());

        return result;
    }

    /*
     * Câu A3 - Trung bình:
     * - Mô tả: Lọc sinh viên có điểm trung bình trên các môn học ghi nhận lớn hơn hoặc bằng 8.0.
     * - Trả về: Map với key là mã số sinh viên, value là điểm trung bình tính được của sinh viên đó.
     */
    public Map<Long, Double> A3() {
        // Map<Long, Double> result = this.enrollments.stream()
        //     .collect(Collectors
        //         .groupingBy(
        //             (enrollment) -> enrollment.getStudentId()))
        //     .entrySet()
        //     .stream()
        //     .collect(Collectors
        //         .toMap(
        //             (entry) -> entry.getKey(),
        //             (entry) -> entry.getValue().stream()
        //                 .mapToDouble(
        //                     (enrollment) -> enrollment.getScore())
        //                 .average()
        //                 .getAsDouble()));

        Map<Long, Double> result = this.enrollments.stream()
            .collect(Collectors
                .groupingBy(
                    (enrollment) -> enrollment.getStudentId(),
                    Collectors
                        .averagingDouble(
                            (enrollment) -> enrollment.getScore())));

        return result;
    }

}
