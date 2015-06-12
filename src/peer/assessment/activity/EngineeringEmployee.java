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
public class EngineeringEmployee extends Employee implements Employed {

    private static final double SALARY = 25000;

    public EngineeringEmployee(String name, int contract, int years, String departament) {
        super(name, contract, years, departament);
    }

    @Override
    public double getSalary() {
        return SALARY + (super.getYears() * 2500);
    }

}
