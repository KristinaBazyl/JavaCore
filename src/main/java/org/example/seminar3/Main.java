package org.example.seminar3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("иванов", "иван", LocalDate.of(1999,12,10));

        Employee[]employees = {
                new Employee("путров", "петр", "менеджер", "89179995566", 100, LocalDate.of(1970, 8, 8)),

                new Employee("беглов", "витя", "дворник", "89163334455", 150, LocalDate.of(1993, 8, 11)),

                new Employee("ветров", "гена", "заместитель", "89123334456", 200, LocalDate.of(1990, 5, 4)),
                new Employee("васин", "артем", "менеджер", "89144556666", 130, LocalDate.of(1969, 4, 6)),
                new Employee("рязанов", "филипп", "секретарь", "89666666666", 100, LocalDate.of(1992, 11, 3))
        };

//        List<Employee> employeeList = Arrays.asList(employees);
//        employeeList.sort((o1, o2) -> o1.getSalary() - o2.getSalary());
//        System.out.println(employeeList);
//
//        employeeList.sort((o1, o2) -> o1.getAge() - o2.getAge());
//        System.out.println(employeeList);

//        System.out.println(employees[1]);
//        System.out.println(employees[2]);

//
//
//        System.out.println("Средний возраст" + averageAge(employees));
//        System.out.println(" Средняя зарплата"+ averageSalary(employees));


//        for (Employee employe :employees) {
//            System.out.println(employe);
//            employe.increaseSalary(50);
//            System.out.println(employe);
//        }

//        Employee.increaseSalary(employees,700);
//
//        System.out.println(Arrays.toString(employees));

    }
    public static double averageAge(Employee[] arr){
        int sumAge =0;
        int counter =0;
        for (Employee employee:arr) {
            sumAge += employee.getAge();
            counter++;
        }
        return (double) sumAge /counter;
    }

    public static double averageSalary(Employee[] arr){
        int sumSalary =0;
        for (Employee employee:arr) {
            sumSalary += employee.getSalary();
        }
        return (double) sumSalary /arr.length;
    }




}
