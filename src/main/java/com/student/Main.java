package com.student;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    static void main()
    {
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        config.addAnnotatedClasses(Student.class, Phone.class, Enrollment.class, Course.class);

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();


//        Phone phone1 = new Phone();
//        phone1.setPhone_id(101);
//        phone1.setPhone_no(123456);
//
//        Phone phone2 = new Phone();
//        phone2.setPhone_id(102);
//        phone2.setPhone_no(654321);
//
//        Student student = new Student();
//        student.setStudent_name("Tejas");
//        student.setStudent_age(21);
//        student.getPhone().add(phone1);

//        session.persist(student);
//        session.persist(phone1);
//        session.persist(phone2);



        tx.commit();
    }
}
