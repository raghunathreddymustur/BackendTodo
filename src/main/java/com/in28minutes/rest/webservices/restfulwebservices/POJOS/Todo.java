package com.in28minutes.rest.webservices.restfulwebservices.POJOS;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Integer id;
    private String Username;
    private String Description;
    private Date targetDate;
    private boolean isDone;
    public Todo()
    {
        
    }
    public Todo(int id, String username, String description, Date targetDate, boolean isDone) {
        this.id = id;
        Username = username;
        Description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return "Todo [Description=" + Description + ", Username=" + Username + ", id=" + id + ", isDone=" + isDone
                + ", targetDate=" + targetDate + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Todo other = (Todo) obj;
        if (id != other.id)
            return false;
        return true;
    }
    


}
