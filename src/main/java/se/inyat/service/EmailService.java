package se.inyat.service;

import se.inyat.model.Email;

public interface EmailService {
    //can add group of abstract methods but just now I want to keep it simple

    Email createAndSend(String recipient, String subject, String content);
    //we want to implement business logic in service package in EmailServiceImpl class

    Email findAll();

}
