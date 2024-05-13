package se.inyat.dao;


import java.util.List;

public interface NotificationDao<T> {//generic interface needs <T>

    T save(T t);//now we can use this as paramerter and return type
    void update(T t);

        T find(String id);

        List<T> findAll();

        // List<T> findBySubject(String subject);
    // List<T> findByRecipient(String recipient);
    // List<T> findByRecipientAndSubject(String recipient, String subject);
    // List<T> findByRecipientOrSubject(String recipient, String subject);
    }


