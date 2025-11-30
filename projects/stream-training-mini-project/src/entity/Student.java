package entity;

import enumeration.Gender;

public class Student {

    private Long id;
    private String name;
    private int age;
    private Gender gender;
    private String className; // Ví dụ: "CSE1", "CSE2"

    public Student(Long id, String name, int age, Gender gender, String className) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.className = className;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", className="
                + className + "]";
    }
}
