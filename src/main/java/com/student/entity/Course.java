package com.student.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @Id
    @SequenceGenerator(
            name = "courseSeqGen",
            sequenceName = "courseSeq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "courseSeqGen"
    )
    private int courseId;

    private String courseName;

    private int duration;

    @OneToMany(mappedBy = "course",cascade = CascadeType.PERSIST)
    private List<Enrollment> enrollments = new ArrayList<>();

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public void addEnrollment(Enrollment enrollment)
    {
        getEnrollments().add(enrollment);
        enrollment.setCourse(this);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", duration=" + duration +
                '}';
    }
}