package com.student;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Enrollment
{
    @Id
    @SequenceGenerator(
            name = "enrollmentSeqGen",
            sequenceName = "enrollmentSeq",
            allocationSize = 1
    )
    @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "enrollmentSeqGen"
    )
    private int enrollmentId;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
    List<Enrollment> enrollments;

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
}
