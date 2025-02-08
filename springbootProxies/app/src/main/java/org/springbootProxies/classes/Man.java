package org.springbootProxies.classes;

public class Man implements Person {

    private String name;
    private int age;
    private String city;
    private String country;

    public Man(String name, int age, String city, String country){
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getCity(){
        return this.city;
    }

    public String getCountry(){
        return this.country;
    }

    @Override
    public void introduce(String name) {
        System.out.println("Hello, my name is " + this.name);
    }

    @Override
    public void sayAge(int age) {
        System.out.println("I am " + this.age + " years old");
    }

    @Override
    public void sayWhereFrom(String city, String country) {
        System.out.println("I am from " + this.city + ", " + this.country);
    }
    
}
