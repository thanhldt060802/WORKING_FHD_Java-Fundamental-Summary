package entity;

public class Enrollment {

    private Long id;
    private Long studentId;
    private Long courseId;
    private double score;
    private String semester;

    public Enrollment(Long id, Long studentId, Long courseId, double score, String semester) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.score = score;
        this.semester = semester;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Enrollment [id=" + id + ", studentId=" + studentId + ", courseId=" + courseId + ", score=" + score
                + ", semester=" + semester + "]";
    }
}
