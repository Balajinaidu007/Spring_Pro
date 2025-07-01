package com.example;

public class Student {

    private int id;
    private String subjectName;
    // private StudentAddress address;
    private String address;
  
    public Student(int id, String subjectName, String address) {
        this.id = id;
        this.subjectName = subjectName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", subjectName=" + subjectName + ", address=" + address + "]";
    }

    public Student() {
       
    }

    public String getSubjectName() {
        return subjectName;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
