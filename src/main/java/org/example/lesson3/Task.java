package org.example.lesson3;

import java.util.Objects;

public class Task {
    protected String name;
    protected String level ;

    public static void assign(Employee[] employees, String lastName, String firstName, Level level,String task){
        boolean res=true;

        for (Employee employee:employees) {
            if (employee instanceof Worker && Objects.equals(((Worker) employee).getLevel(), String.valueOf(level))) {
                if (Objects.equals(employee.getLastName(), lastName) && Objects.equals(employee.getFirstname(), firstName)) {
                    ((Worker) employee).setTask(task);
                    res=true;

                }
            }
        }
        if (!res) {
            for (Employee employee : employees) {
                if (employee instanceof Manager) {
                    ((Manager) employee).setTask(task); //
                    break;
                }
            }
        }

//            if (employee instanceof Manager && Objects.equals(((Manager) employee).getLevel(), String.valueOf(level))) {
//                ((Manager) employee).setTask(task);
//            }
        }

    }

