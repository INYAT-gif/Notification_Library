package se.inyat.dao;

public interface NotificationDao<T> {//generic interface needs <T>

    T save(T t);//now we can use this as paramerter and return type
    void update(T t);

    T find (T t);



}
