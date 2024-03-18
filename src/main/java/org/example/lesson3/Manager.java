package org.example.lesson3;

import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Employee{

   protected String post;

   protected String task;
    protected String level= String.valueOf(Level.Hard);

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

    public Manager(String lastName, String firstname, String phone, int salary, LocalDate birthDate, String post) {
        super(lastName, firstname, phone, salary, birthDate);
        this.post = post;
    }

    public static void increaseSalary (Employee[] employees,int age, int bonus){

        for (Employee employee:employees) {
            if(employee instanceof Worker){
                if (employee.getAge() > age) employee.setSalary(employee.getSalary() + bonus);
            }
        }
    }

    public static void assign(Employee[] employees, String lastName, String firstName, String task){
        for (Employee employee:employees) {
            if(employee instanceof Worker)
                if (Objects.equals(employee.getLastName(), lastName) && Objects.equals(employee.getFirstname(), firstName)) {
                    ((Worker) employee).setTask(task);
                }
        }
    }


    @Override
    public String toString() {
        return "Manager{" +
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
