package com.workintech.developers;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private  MidDeveloper[] midDevelopers;
    private  SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);

    }
    public void addEmployee(int index, JuniorDeveloper juniorDevelopers){
        if(this.juniorDevelopers[index] == null){
            this.juniorDevelopers[index] = juniorDevelopers;
        } else {
            System.out.println("Employee has been created ");
        }
    }
    public void addEmployee(int index, MidDeveloper midDeveloper){
        if(this.midDevelopers[index] == null){
            this.midDevelopers[index] = midDeveloper;
        } else {
            System.out.println("Employee has been created ");
        }

    }
    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){
        if(this.seniorDevelopers[index] == null){
            this.seniorDevelopers[index] = seniorDeveloper;
        } else {
            System.out.println("Employee has been created ");
        }

    }


    @Override
    public void work(){
        System.out.println(getName()+" HR Manager starts to working");
    }
    @Override
    public void setSalary(double salary){
        super.setSalary(salary);
    }

    @Override
    public String toString() {
        return getId() +", "+", "+ getName()+", "+getSalary() ;
    }
}
