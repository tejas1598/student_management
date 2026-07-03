package com.student.util;

import com.student.entity.Course;
import com.student.entity.Enrollment;
import com.student.entity.Phone;
import com.student.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
    private static final Configuration config = new Configuration();
    private static SessionFactory sessionFactory;
    static
    {
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClasses(Student.class, Phone.class, Enrollment.class, Course.class);
        sessionFactory = config.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
