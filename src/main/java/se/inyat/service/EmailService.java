package se.inyat.service;

import se.inyat.exception.EmailException;
import se.inyat.model.Email;

import java.util.List;

public interface EmailService {
    //can add group of abstract methods but just now I want to keep it simple

    Email createAndSend(String recipient, String subject, String content) throws EmailException;
    //we want to implement business logic in service package in EmailServiceImpl class

    List<Email> findAll();

}
