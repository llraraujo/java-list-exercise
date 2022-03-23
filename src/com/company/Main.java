package com.company;


import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employee = new ArrayList<Employee>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for(int i = 1; i < n+1; i++){
            Employee person;
            System.out.println();
            System.out.println("Employee #"+ i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            person = new Employee(id, name, salary);
            employee.add(person);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        List<Employee> result = employee.stream().filter(el -> el.getId() == id).toList();
        //Employee emp = employee.stream().filter(el -> el.getId() == id).findFirst().orElse(null);
        //System.out.println(emp);
        System.out.println();
        if(result.size() > 0){
            sc.nextLine();
            for(Employee list: result){
                System.out.print("Enter the percentage: ");
                double raise = sc.nextDouble();
                list.increaseSalary(raise);
            }
        }else{

            System.out.println("This id does not exist!");
        }
        System.out.println();
        System.out.println("List of employees: ");
        for(Employee obj: employee){
            System.out.println(obj);
        }

        sc.close();


    }
}
