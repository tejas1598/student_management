package com.student;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student
{
    @Id
    @SequenceGenerator(
            name = "studentSeqGen",
            sequenceName = "studentSeq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "studentSeqGen"
    )
    private int studentId;
    private String studentName;
    private int studentAge;
    @OneToMany
    private List<Phone> phones = new ArrayList<>();
    @OneToMany
    private List<Enrollment> enrollments = new ArrayList<>();

    public Student()
    {}

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudent_name() {
        return studentName;
    }

    public void setStudent_name(String student_name) {
        this.studentName = student_name;
    }

    public int getStudent_age() {
        return studentAge;
    }

    public void setStudent_age(int student_age) {
        this.studentAge = student_age;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", student_name='" + studentName + '\'' +
                ", student_age=" + studentAge +
                ", phones=" + phones +
                ", enrollments=" + enrollments +
                '}';
    }
}
