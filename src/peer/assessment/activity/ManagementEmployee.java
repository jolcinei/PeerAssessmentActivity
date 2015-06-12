/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peer.assessment.activity;

/**
 *
 * @author operador
 */
public class ManagementEmployee extends Employee implements Employed {

    private static final double SALARY = 40000;

    public ManagementEmployee(String name, int contract, int years, String departament) {
        super(name, contract, years, departament);
    }

    @Override
    public double getSalary() {
        return SALARY + (super.getYears() * 6000);
    }

}
