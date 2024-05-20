package se.inyat.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import se.inyat.exception.DataNotFoundException;
import se.inyat.model.Email;

import static org.junit.jupiter.api.Assertions.*;

public class EmailDaoTest {
    private EmailDaoImpl testObject;

    private Email savedEmail;

    @BeforeEach
    public void setup() {
        testObject = EmailDaoImpl.getInstance();

        Email email = new Email("recipient@example.com", "Test Subject", "Test Message");
        savedEmail = testObject.save(email);

        assertNotNull(savedEmail);

    }

    @Test
    @DisplayName("test save email")
    public void testSave() {
        // data
        Email email = new Email("recipient@example.se", "Test Subject", "Test Message");
        Email savedEmail = testObject.save(email);

        assertNotNull(savedEmail);

        Email foundEmail = testObject.find(savedEmail.getId());
        assertEquals(savedEmail, foundEmail);

    }

    @Test
    public void testFindExistingId() {
        Email foundEmail = testObject.find(savedEmail.getId());
        assertNotNull(foundEmail);
        assertEquals(savedEmail, foundEmail);
    }

    @Test
    public void testFindNonExistingId() {
        assertThrows(DataNotFoundException.class, ()-> testObject.find("non-existing-id") );
    }

    // add more tests as needed.


}
/**    @Test
    @DisplayName("Test save email")
    public void testSave(){

    }
    @Test
    public void testFind(){
        //how to test Find method, how to write test case for Find method?

        //save a email because there is no data in the storage but there is a Best practice @BeforeEach

        testObject


    }
    @Test
    public void testNonExistingId(){

        testObject.find("non-existing-id");
        assertThrows(DataNotFoundException.class, () -> testObject.find("non-existing-id"));
        //                                      , method that has no name so ()
        //if Find method throws DataNotFoundException, then assertThrows will throw an exception


    }
}
