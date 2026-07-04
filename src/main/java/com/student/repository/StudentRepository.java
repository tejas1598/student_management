package com.student.repository;

import com.student.entity.Student;
import com.student.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

public class StudentRepository
{
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

    public List<Student> findByName(Session session, String n1)
    {
        return  session.createQuery("FROM Student  WHERE studentName = :name", Student.class)
                .setParameter("name",n1).getResultList();
    }

    public List<Student> findByAgeGreaterThan(Session session, int age)
    {
        return session.createQuery("FROM Student WHERE studentAge > :age",Student.class)
                .setParameter("age",age).getResultList();
    }

    public List<Student> findByAgeBetween(Session session, int min, int max)
    {
        return session.createQuery("FROM Student WHERE studentAge BETWEEN :min and :max", Student.class)
                .setParameter("min",min).setParameter("max",max).getResultList();
    }

    public int updateStudentAge(Session session, int id, int age)
    {
        return session.createQuery("UPDATE Student SET studentAge = :age WHERE studentId = :id")
                .setParameter("age",age).setParameter("id",id).executeUpdate();
    }

    public void delete(Session session, int id)
    {
        Student student = findById(session, id);
        session.remove(student);
    }
}
