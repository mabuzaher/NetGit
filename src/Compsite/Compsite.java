/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compsite;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author DELL
 */
public class Compsite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Employee> Employees = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Employees.add(new Employee("Employee "+i, "department " + i, "job " + i ));
            Random r = new Random();
            for (int j = 0; j < r.nextInt(9); j++) {
                Employees.getLast().AddGroupMembers(new Employee("Employee "+j, "department " + i, "job " + j ));
            }
        }
        
        for (Employee Employee : Employees) {
            System.out.println("\n"+Employee.toString());
            System.out.println("\tHis Group : ");
            for (Employee GroupMember : Employee.getGroupMembers()) {
                System.out.println("\t\t"+GroupMember.toString());
            }
        }
    }
    
}
