package com.custom;

public class Student {
    private int id;
    private String name;
    private StuAddress address;
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
    public StuAddress getAddress() {
        return address;
    }
    public void setAddress(StuAddress address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
    public Student() {
    }

    
}
