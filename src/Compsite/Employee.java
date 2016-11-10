/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compsite;

import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class Employee {
    private String name , department,job;
    private LinkedList<Employee> groupMembers; 
    
    public Employee(String name, String department, String job) {
        this.name = name;
        this.department = department;
        this.job = job;
        this.groupMembers = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public LinkedList<Employee> getGroupMembers() {
        return groupMembers;
    }

    public void AddGroupMembers(Employee groupMember) {
        this.groupMembers.add(groupMember);
    }
    
    public void AddRemoveMembers(Employee groupMember) {
        this.groupMembers.remove(groupMember);
    }

    @Override
    public String toString() {
        return "Name: "+ name+" "+ "Department: "+department+" "+ "Job: "+job+".";
    }

}
