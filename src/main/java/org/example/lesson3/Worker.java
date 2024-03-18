package org.example.lesson3;

import java.time.LocalDate;

public class Worker extends Employee{
    protected String post;

    protected String task;
    protected String level= String.valueOf(Level.Medium);

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Worker(String lastName, String firstname, String phone, int salary, LocalDate birthDate, String post) {
        super(lastName, firstname, phone, salary, birthDate);
        this.post= post;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "post='" + post + '\'' +
                ", task='" + task + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstname='" + firstname + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
