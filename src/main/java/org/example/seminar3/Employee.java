package org.example.seminar3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

public class Employee  {
    private String firstname;
    private String name;
    private String post;
    private String phone;

    private int salary;
    private LocalDate birthDate;

    public Employee(String firstname, String name, String post,
                    String phone,  int salary, LocalDate birthDate) {
        this.firstname = firstname;
        this.name = name;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.setBirthDate(birthDate);
    }

    public Employee(String firstname, String name, LocalDate birthDate) {
        this.firstname = firstname;
        this.name = name;
        this.setBirthDate(birthDate);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.birthDate == null ? -1:(int) this.birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public void setBirthDate(LocalDate birthDate) {
        if(birthDate==null || birthDate.isAfter(LocalDate.now().minusYears(14))){
            System.out.println("Дата рождения не подходит");
        }
        else this.birthDate = birthDate;
    }

    public static void increaseSalary (Employee [] employees, int bonus){

        for (Employee employee:employees) {
            if (employee.getAge() > 45) {
                employee.setSalary(employee.getSalary() + bonus);
                }
//            System.out.println(employee);
        }

    }

    @Override
    public String toString() {
        return  "Employee{" +
                "firstname='" + firstname + '\'' +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + this.getAge()  +
                '}' +'\n';
    }


//    @Override
//    public int compareTo(Employee o) {
//        return this.getAge()-o.getAge();
//    }
}
