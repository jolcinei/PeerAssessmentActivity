/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer.assessment.activity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author operador
 */
public class Staff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManagementEmployee employee1 = new ManagementEmployee("Bill", 9);
        System.out.println("1 -" + employee1.toString());
        EngineeringEmployee employee2 = new EngineeringEmployee("Anna", 9);
        System.out.println("2 -" + employee2.toString());
        EngineeringEmployee employee3 = new EngineeringEmployee("John", 5);
        System.out.println("2 -" + employee3.toString());
        EngineeringEmployee employee4 = new EngineeringEmployee("Elizabeth", 3);
        System.out.println("2 -" + employee4.toString());
        EngineeringEmployee employee5 = new EngineeringEmployee("Michael", 2);
        System.out.println("2 -" + employee5.toString());
        AdministrationEmployee employee6 = new AdministrationEmployee("Albert");
        System.out.println("2 -" + employee6.toString());

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        double mSalary = 0.0;
        double eSalary = 0.0;
        double aSalary = 0.0;
        double total = 0.0;
        for (Employee e : employees) {
            if (e.getDepartament().equals("Management")) {
                mSalary += e.getSalary();
            }
            if (e.getDepartament().equals("Engineering")) {
                eSalary += e.getSalary();
            }
            if (e.getDepartament().equals("Administration")) {
                aSalary += e.getSalary();
            }
            total += e.getSalary();
        }
        System.out.println("MANAGEMENT TOTAL SALARY: " + mSalary + " bitcoins");
        System.out.println("ENGINEERING TOTAL SALARY: " + eSalary + " bitcoins");
        System.out.println("ADMINISTRATION TOTAL SALARY: " + aSalary + " bitcoins");
        System.out.println("ACME TOTAL SALARY: " + total + " bitcoins");
    }

}
