package Assignmet01;

import java.util.ArrayList;
import java.util.List;

public class Task2Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(
                new Developer("Hajra Parveen", 100000, 120000)
        );

        employees.add(
                new SalesManager("Qandil Parveen", 90000, 400000, 0.05)
        );

        for (Employee employee : employees) {

            System.out.println(
                    employee.getName()
                    + " Final Pay: "
                    + employee.calculatePay()
            );
        }
    }
}