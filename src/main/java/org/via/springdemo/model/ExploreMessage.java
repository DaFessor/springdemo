package org.via.springdemo.model;

public class ExploreMessage {
    public long id;
    public String message;

    public ExploreMessage(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ExploreMessage {" +
                "id= " + id +
                ", message= '" + message + '\'' +
                '}';
    }
}
