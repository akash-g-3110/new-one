package com.encapsulation;

public class Encapsulation {
    private int id;
    private   String name;
    protected float salary;

    public Encapsulation(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    void display(){
        System.out.println(id+"   "+name+"   "+salary);
    }

}
