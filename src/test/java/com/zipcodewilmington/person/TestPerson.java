package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedEmail = "";
        String expectedAddress = "";
        String expectednickName = "";
        Boolean expectedStudent = true;
        Integer expectedPets = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        String actualEmail = person.getEmail();
        String actualAddress = person.getAddress();
        String actualnickName = person.getnickName();
        Boolean actualStudent = person.getIsStudent();
        Integer actualPets = person.getPets();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedEmail, actualEmail);
        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectednickName, actualnickName);
        Assert.assertEquals(expectedStudent, actualStudent);
        Assert.assertEquals(expectedPets, actualPets);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

//    @Test
//    public void testConstructorWithEmail() {
//        // Given
//        String expected = "Leon@xyz.com";
//
//        // When
//        Person person = new Person(expected);
//
//        // Then
//        String actual = person.getEmail();
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testConstructorWithAddress() {
//        // Given
//        String expected = "123 Blah Drive";
//
//        // When
//        Person person = new Person(expected);
//
//        // Then
//        String actual = person.getAddress();
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testConstructorWithnickName() {
//        // Given
//        String expected = "Donut";
//
//        // When
//        Person person = new Person(expected);
//
//        // Then
//        String actual = person.getnickName();
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//   public void testConstructorWithStudent() {
//       // Given
//        Boolean expected = true;
//
//       // When
//        Person person = new Person(expected);
//
//        // Then
//        Boolean actual = person.getIsStudent();
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testConstructorWithPets() {
//        // Given
//        Integer expected = 0;
//
//        // When
//        Person person = new Person(expected);
//
//        // Then
//        Integer actual = person.getPets();
//        Assert.assertEquals(expected, actual);
//    }


    //Set and Get Tests Below
    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail() {
        // Given
        Person person = new Person();
        String expected = "Leon@xyz.com";

        // When
        person.setEmail(expected);
        String actual = person.getEmail();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress() {
        // Given
        Person person = new Person();
        String expected = "123 Blah Drive";

        // When
        person.setAddress(expected);
        String actual = person.getAddress();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetnickName() {
        // Given
        Person person = new Person();
        String expected = "Donut";

        // When
        person.setnickName(expected);
        String actual = person.getnickName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetStudent() {
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setIsStudent(expected);
        Boolean actual = person.getIsStudent();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetPets() {
        // Given
        Person person = new Person();
        Integer expected = 0;

        // When
        person.setPets(expected);
        Integer actual = person.getPets();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
