package se.inyat.model;

public class Email extends Notification {

    //Email is now a subclass of Notification.

    private String recipient;

    private String subject;

    private String content;

//    private byte[] files; can later on add files to email by using a file path.

    public Email (String recipient, String subject, String content) {
        super();
        //this.recipient = recipient;
        setRecipient(recipient);
        this.subject = subject;
        this.content = content;

    }

    public String getRecipient() {

        return recipient;
    }

    public void setRecipient(String recipient) {
        //is mandatory
        if (recipient == null) throw new IllegalArgumentException("Recipient cannot be null.");
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
