package com.example.BelajarOOP;

public class AppPerson {
    public static void main(String[] args) {
        var person1 = new Person("Amin", "yogya");
        // Person person2 = new Person();

        // Person person3;
        // person3 = new Person();

        person1.name = "Amin";
        person1.address = "Yogya";
        // person1.country = "Tidak bisa diubah";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Print tulisan");

    }
}