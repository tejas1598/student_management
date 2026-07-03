package com.student.entity;

import jakarta.persistence.*;

@Entity
public class Phone {

    @Id
    @SequenceGenerator(
            name = "phoneSeqGen",
            sequenceName = "phoneSeq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "phoneSeqGen"
    )
    private int phoneId;

    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneId=" + phoneId +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}