package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper() {
    }

    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println(getName()+" Jr Developer starts to working");
    }
}
