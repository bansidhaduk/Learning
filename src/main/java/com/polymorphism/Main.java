package com.polymorphism;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Animal> animal = new ArrayList<Animal>();
//        animal.add(new Dog());
//        animal.add(new Cat());
//
//        for(Animal a : animal) {
//            System.out.println(a.makeSound());
//        }

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        System.out.println("Sound of dog is : " + animals[0].makeSound());
        System.out.println("Sound of cat is : " + animals[1].makeSound());

        Shape[] shape = new Shape[2];
        shape[0] = new Rectangle();
        shape[1] = new Circle();
        System.out.println("Area of rectangle is : " + shape[0].calculateArea());
        System.out.println("Area of circle is : " + shape[1].calculateArea());

        Person[] person = new Person[2];
        person[0] = new Student();
        person[1] = new Teacher();
        System.out.println("Area of rectangle is : " + person[0].greet());
        System.out.println("Area of circle is : " + person[1].greet());

        Vehicle[] Vehicle = new Vehicle[2];
        Vehicle[0] = new Car();
        Vehicle[1] = new Motorcycle();
        System.out.println("Area of rectangle is : " + Vehicle[0].drive());
        System.out.println("Area of circle is : " + Vehicle[1].drive());

    }
}
