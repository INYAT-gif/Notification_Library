package se.inyat.dao;

import  se.inyat.dao.NotificationDao;
import se.inyat.model.Email;

import java.util.ArrayList;
import java.util.List;

//public class EmailDaoImpl implements <Email> //email is parameter type
public class EmailDaoImpl implements EmailDao {

    private List<Email> emailList = new ArrayList<>();

    
    @Override
    public List<Email> findBySubject(String subject) {
        return null;
    }



}
