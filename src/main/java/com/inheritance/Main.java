package com.inheritance;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());

        Dog dog = new Dog();
        System.out.println(dog.eat());
        System.out.println(dog.sleep());

        Cat cat = new Cat();
        System.out.println(cat.eat());
        System.out.println(cat.sleep());

        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println(savingsAccount.withdraw());

        Car car = new Car();
        System.out.println(car.drive());

        Truck truck = new Truck();
        System.out.println(truck.drive());

        Employee employee = new Employee();
        System.out.println(employee.getSalary());
    }
}
