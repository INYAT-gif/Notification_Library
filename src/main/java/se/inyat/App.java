package se.inyat;


import se.inyat.dao.EmailDao;
import se.inyat.dao.EmailDaoImpl;
import se.inyat.model.Email;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) {
        EmailDao dao = EmailDaoImpl.getInstance(); //singleton pattern for EmailDao //emaillist is empty

        dao.save(new Email("test", "test", "test"));
        System.out.println(email1.summary());

       // EmailDao dao2 = new EmailDaoImpl(); we are not allowed to initialize EmailDaoImpl again as it is a singleton class

        Email foundEmail1 = dao.find(email1.getId());
        System.out.println(foundEmail1.summary());

//tutorialspoint Design Patterns in Java called Singleton Pattern use to check if class is initialized only once and
// only one instance can be created at a time.
 //look for Data access object pattern. DAO pattern is used to access data from database.
        // Why we separated all the data access from the business logic?
        //Best practices are DAO pattern and Builder design pattern, look at real world scenario example.




        }
}
