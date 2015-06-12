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
public class Employee implements Employed {

    private String name;

    private int contract;

    private final String[] integers = new String[]{"TEMPORARY", "TRAINING", "INDEFINITE"};

    private int years;

    private String departament;

    public Employee(String name, int contract, int years, String departament) {
        this.name = name;
        this.contract = contract;
        this.years = years;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return name + ": " + departament + " departament, " + integers[contract] + " contract, " + years + " years in the company, salary of " + getSalary() + " bitcoins";
        //<name>: <department> department, <type of contract> contract, <years> years in the company, salary of <salary> bitcoins
    }

    @Override
    public double getSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
