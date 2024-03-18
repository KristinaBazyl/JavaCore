package org.example.lesson3;

import java.awt.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

import static org.example.lesson3.Level.*;

public class Main {
    public static void main(String[] args) {



        Manager manager1= new Manager("Петров", "Петр", "89003332211",200, LocalDate.of(1980, 12,23), "Руководитель");
        Employee [] employees = {
                new Manager("Сидоров", "Виталий","89992223311",150,LocalDate.of(1990,12,31),"Руководитель отдела 1"),
                new Manager("Васечкин", "Василий","89993345621",250,LocalDate.of(1980,2,12),"Руководитель отдела 2"),
                new Worker("Иванов","Иван", "89034445566",150, LocalDate.of(1986,12,5),"Менеджер"),
                new Worker("Иванов","Кирилл", "89035555566",150, LocalDate.of(1989,4,12),"Менеджер по работе с клиентами"),
                new Worker("Кислов","Кирилл", "89033355566",160, LocalDate.of(1991,4,12),"Менеджер по работе с клиентами"),
        };




//        Arrays.sort(employees);
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println();
//        Arrays.asList(employees).forEach(System.out::println);
//        System.out.println();

//        Manager.increaseSalary(employees,30,50);
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

        Manager.assign(employees,"Иванов", "Кирилл","Сделай работу");
        Arrays.asList(employees).forEach(System.out::println);
        System.out.println();

        Task.assign(employees,"Иванов", "Иван",Medium, "Сдай отчет");
        Arrays.asList(employees).forEach(System.out::println);

    }
}
