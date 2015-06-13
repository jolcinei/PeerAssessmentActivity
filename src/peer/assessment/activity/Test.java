/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer.assessment.activity;

/**
 *
 * @author Jolcinei
 */
public class Test {

    public static void main(String[] args) {

        // total salary
        double total = 0.0;

        // ManagementEmployee test
        ManagementEmployee me = new ManagementEmployee("Bill", 9);
        System.out.println(me.toString());
        System.out.println("My name is " + me.getName() + " and my salary is " + me.getSalary() + " bitcoins");
        total += me.getSalary();

        // total salary calculation
        System.out.println("The total salary is " + total + " bitcoins.");
    }
}
