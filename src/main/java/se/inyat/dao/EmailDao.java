package se.inyat.dao;

import se.inyat.model.Email;

import java.util.List;

public interface EmailDao extends NotificationDao<Email> {
    List<Email> findBySubject(String subject);
}