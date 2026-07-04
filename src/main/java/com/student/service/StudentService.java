package com.student.service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentService
{
    StudentRepository studentRepository = new StudentRepository();

    HibernateUtil hibernateUtil = new HibernateUtil();

    public void save(Student student)
    {
        Session session = null;
        Transaction tx = null;

        try
        {
            session = hibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            studentRepository.save(session, student);
            tx.commit();
        }
        catch(Exception e)
        {
            System.out.println("Error saving message : "+e);

            if(tx !=null)
            {
                tx.rollback();
                System.out.println("Transaction rolled back");
            }
        }
        finally
        {
            if(session !=null)
            {
                session.close();
                System.out.println("Session closed");
            }
        }
    }

//    public List<Student> findById(Student student)
//    {
//
//    }

    //Rest all the other services**

}
