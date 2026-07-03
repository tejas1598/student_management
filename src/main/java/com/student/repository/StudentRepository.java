package com.student.repository;

import com.student.Main;
import com.student.entity.Student;
import com.student.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentRepository
{
    HibernateUtil hu = new HibernateUtil();

    public void save(Session session, Student student)
    {
        session.persist(student);
    }

    public Student findById(Session session, int id)
    {
        Student student = session.find(Student.class, id);
        return student;
    }

    public List<Student> findAll(Session session)
    {
        return session.createQuery("FROM Student", Student.class).getResultList();
    }
}
