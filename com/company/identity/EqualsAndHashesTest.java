package com.company.identity;

public class EqualsAndHashesTest {
    public static void main(String[] args) {
        
        Person person1 = new Person("mohan" ,4,6);

        Person person2 = new Person("mohan" ,4,6);

        System.out.println(person1.equals(person2));
        System.out.println(person1 == person2);
        System.out.println(person1 instanceof Person);

        System.out.println(person1.getClass().equals( person2.getClass()));

        
        
    }

}
