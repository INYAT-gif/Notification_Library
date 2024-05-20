package se.inyat.util;

import se.inyat.exception.EmailException;


import javax.mail.MessagingException;
import java.util.Properties;

public class EmailSender {
    private static final String USERNAME = "inayatnathani@hotmail.com";
    private static final String PASSWORD = "#####";//add later

    public static void sendEmail(String recipient, String subject, String message) throws EmailException {
        //can se smtp link later

        //Step 1: Set up email server properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");


        //Step 2: Get the Session object
        //Session represents

        try {

        } catch (Exception e) {
        throw  new EmailException("Email address is not valid" + e.getMessage());

    }

    } //end of sendEmail
}

