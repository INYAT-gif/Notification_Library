package se.inyat.dao;

import se.inyat.model.Email;

import java.util.List;

public interface EmailDao {
    List<Email> findBySubject(String subject);
}
