package com.student;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {

    public static void main(String[] args) {

        HibernateUtil hu = new HibernateUtil();

//        Student s1 = new Student();
//        s1.setStudentName("Tejas");
//        s1.setStudentAge(20);
//
//        Phone p1 = new Phone();
//        Phone p2 = new Phone();
//        p1.setPhoneNumber("1234567890");
//        p2.setPhoneNumber("0987654321");
//
//        Course c1 = new Course();
//        Course c2 = new Course();
//        c1.setCourseName("Hibernate");
//        c1.setDuration(3);
//        c2.setCourseName("SpringBoot");
//        c2.setDuration(4);
//
//        s1.addPhone(p1);
//        s1.addPhone(p2);
//
//        Enrollment e1 = new Enrollment();
//        e1.setCoursePeriod(3);
//        Enrollment e2 = new Enrollment();
//        e2.setCoursePeriod(4);
//
//        c1.addEnrollment(e1);
//        c2.addEnrollment(e2);
//
//        s1.addEnrollment(e1);
//        s1.addEnrollment(e2);
//
//        session.persist(s1);
//        session.persist(c1);
//        session.persist(c2);
//
//        tx.commit();

//        Student student1 = session.find(Student.class, 1);
//        System.out.println();
//        System.out.println(student1);

        StudentRepository studentRepository = new StudentRepository();

        Session session = hu.getSessionFactory().openSession();

        Student student = studentRepository.findById(session,1);
        System.out.println(studentRepository.findAll(session));
//        System.out.println(student);
    }
}