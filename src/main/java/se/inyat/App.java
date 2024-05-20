package se.inyat;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.inyat.dao.EmailDao;
import se.inyat.dao.EmailDaoImpl;
import se.inyat.model.Email;
import se.inyat.util.EmailSender;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);

        //if we want to make this project as a library we can use this code as below

        EmailDao dao = EmailDaoImpl.getInstance(); //singleton pattern for EmailDao //emaillist is empty

        try {
            Email email1 = new Email("test", "test", "test");
            Email savedEmail = dao.save(email1);

            EmailSender.sendEmail(savedEmail.getRecipient(), savedEmail.getSubject(), savedEmail.getMessage());

            dao.save(new Email("test", "test", "test"));
            System.out.println(email1.summary());

            // EmailDao dao2 = new EmailDaoImpl(); we are not allowed to initialize EmailDaoImpl again as it is a singleton class

            Email foundEmail1 = dao.find(email1.getId());
            System.out.println(foundEmail1.summary());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//tutorialspoint Design Patterns in Java called Singleton Pattern use to check if class is initialized only once and
// only one instance can be created at a time.
 //look for Data access object pattern. DAO pattern is used to access data from database.
        // Why we separated all the data access from the business logic?
        //Best practices are DAO pattern and Builder design pattern, look at real world scenario example.




        }
}
