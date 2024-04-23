package se.inyat.dao;

import se.inyat.DataNotFoundException.DataNotFoundException;
import se.inyat.model.Email;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class EmailDaoTest {

    @BeforeEach
    public void setup() {
        testObject = new EmailDaoImpl.getInstance();
        //data
        Email email = new Email("recipient@example.se", "Test Subject", "Test Content");

        Email savedEmail = testObject.save(email);

        assertNotNull(savedEmail);

        Email foundEmail = testObject.find(savedEmail.getId());
        assertEquals(savedEmail, foundEmail);//expected email, actual email

    }
    @Test
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
