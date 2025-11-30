package mockdata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import enumeration.Gender;

public class MockData {

    private static final String[] NAMES = {
        "Alice","Bob","Charlie","Diana","Eve","Frank","Grace","Henry","Ivy","Jack",
        "Karen","Leo","Mona","Nina","Oscar","Paul","Quinn","Rose","Steve","Tracy",
        "Uma","Victor","Wendy","Xander","Yara","Zane","Amy","Brian","Clara","David",
        "Ella","Fiona","George","Hannah","Ian","Julia","Kevin","Laura","Mike","Nora",
        "Oliver","Patty","Quincy","Rachel","Sam","Tina","Ulysses","Vera","Will","Xenia"
    };

    private static final String[] CLASSES = {"CSE1","CSE2","CSE3","CSE4","CSE5"};

    private static final String[] COURSES = {
        "Math","Physics","Chemistry","English","History","Programming",
        "Databases","AI","Networking","Statistics","Economics","Philosophy"
    };

    private static final String[] SEMESTERS = {"2025A","2025B"};

    private Random rand;

    public MockData(Long seed) {
        this.rand = new Random(seed);
    }

    public List<Student> students() {
        List<Student> list = new ArrayList<>();
        for (long i = 1; i <= 50; i++) {
            String name = NAMES[(int)(i-1)];
            int age = 18 + this.rand.nextInt(8);; // Mỗi Sinh Viên 18-25 tuổi
            Gender gender = this.rand.nextInt(2) == 0 ? Gender.MALE : Gender.FEMALE;
            String className = CLASSES[this.rand.nextInt(CLASSES.length)];
            list.add(new Student(i,name,age,gender,className));
        }
        return list;
    }

    public List<Course> courses() {
        List<Course> list = new ArrayList<>();
        for (long i=1;i<=COURSES.length;i++) {
            String name = COURSES[(int)(i-1)];
            int credit = 2 + this.rand.nextInt(3); // Mỗi Khoá Học 2-4 tín chỉ
            list.add(new Course(i,name,credit));
        }
        return list;
    }

    public List<Enrollment> enrollments(List<Student> students, List<Course> courses) {
        List<Enrollment> list = new ArrayList<>();
        long enrollmentId = 1;

        for (Student s : students) {
            int numCourses = 5 + this.rand.nextInt(3); // Mỗi Sinh Viên học 5-7 môn
            Set<Integer> chosen = new HashSet<>();
            while(chosen.size()<numCourses){
                chosen.add(this.rand.nextInt(courses.size()));
            }
            for (int idx : chosen) {
                Course c = courses.get(idx);
                double score = 4.0 + this.rand.nextDouble() * 6.0; // Mỗi Khoá Học mà Sinh Viên tham gia 4.0-10.0 điểm
                String semester = SEMESTERS[this.rand.nextInt(SEMESTERS.length)];
                list.add(new Enrollment(enrollmentId++, s.getId(), c.getId(), Math.round(score*10)/10.0, semester));
            }
        }
        return list;
    }

}
