package org.example.lesson3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Employee implements Comparable<Employee> {
    protected String lastName;
    protected String firstname;
    protected String phone;

    protected int salary;
    protected LocalDate birthDate;

    public Employee(String lastName, String firstname, String phone, int salary, LocalDate birthDate) {
        this.lastName = lastName;
        this.firstname = firstname;
        this.phone = phone;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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
        this.birthDate = birthDate;
    }

//    public static void increaseSalary (Employee[] employees,int age, int bonus){
//
//        for (Employee employee:employees) {
//            if(employee instanceof Worker){
//                if (employee.getAge() > age) employee.setSalary(employee.getSalary() + bonus);
//            }
//        }
//    }

    @Override
    public int compareTo(Employee o) {
        return lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstname='" + firstname + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birthDate=" + this.getAge() +
                '}';
    }
}
