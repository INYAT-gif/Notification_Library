package se.inyat.dao;


import java.util.List;

public interface NotificationDao<T> {//generic interface needs <T>

    T save(T t);//now we can use this as paramerter and return type
    void update(T t);

        T find(String id);

        List<T> findAll();

        // add more methods as needed
    }


