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
public class PeerAssessmentActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManagementEmployee employee1 = new ManagementEmployee("Bill", 2, 9, "manager");
        System.out.println("1 -" + employee1.toString());
        EngineeringEmployee employee2 = new EngineeringEmployee("Anna", 2, 9, "manager");
        System.out.println("2 -" + employee2.toString());
        EngineeringEmployee employee3 = new EngineeringEmployee("John", 2, 5, "manager");
        System.out.println("2 -" + employee3.toString());
        EngineeringEmployee employee4 = new EngineeringEmployee("Elizabeth", 1, 3, "manager");
        System.out.println("2 -" + employee4.toString());
        EngineeringEmployee employee5 = new EngineeringEmployee("Michael", 1, 2, "manager");
        System.out.println("2 -" + employee5.toString());
        AdministrationEmployee employee6 = new AdministrationEmployee("Albert", 0, 0, "manager");
        System.out.println("2 -" + employee6.toString());
    }

}
