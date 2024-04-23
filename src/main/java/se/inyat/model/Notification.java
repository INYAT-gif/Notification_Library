package se.inyat.model;

public class Notification {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id='" + id + '\'' +
                '}';
    }
}
