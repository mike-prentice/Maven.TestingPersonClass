package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String email;
    private String address;
    private String nickName;
    private Boolean isStudent;
    private Integer pets;


    public Person() {
        this("", Integer.MAX_VALUE, "", "", "", true, Integer.MAX_VALUE);
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String email, String address, String nickName, Boolean isStudent, int pets) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.nickName = nickName;
        this.isStudent = isStudent;
        this.pets = pets;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setnickName(String nickName) {
        this.nickName = nickName;
    }

    public void setIsStudent(Boolean isStudent) {
        this.isStudent = isStudent;
    }

    public void setPets(int pets) {
        this.pets = pets;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }
    public String getnickName() {
        return this.nickName;
    }
    public Boolean getIsStudent() {
        return this.isStudent;
    }
    public Integer getPets() {
        return this.pets;
    }



}
