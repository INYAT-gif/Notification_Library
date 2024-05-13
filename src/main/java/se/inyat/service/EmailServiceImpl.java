package se.inyat.service;

import se.inyat.dao.EmailDaoImpl;
import se.inyat.exception.EmailException;
import se.inyat.dao.EmailDao;
import se.inyat.model.Email;
import se.inyat.util.EmailSender;

import java.util.List;

public class EmailServiceImpl implements EmailService {

    private EmailDao emailDao;//we want to reuse functaions from EmailDao class

    public EmailServiceImpl() {
        emailDao = EmailDaoImpl.getInstance();
    }
    @Override
    public Email createAndSend(String recipient, String subject, String message) throws EmailException {
        if (recipient == null) throw new IllegalArgumentException("Recipient is null.");
        Email savedEmail = emailDao.save(new Email(recipient, subject, message));
        EmailSender.sendEmail(savedEmail.getRecipient(), savedEmail.getSubject(), savedEmail.getContent());
        savedEmail.setStatus(true);
        emailDao.update(savedEmail);
        return savedEmail;
    }

    @Override
    public List<Email> findAll() {
        return emailDao.findAll();
    }


}