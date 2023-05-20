package com.encapsulation;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount(1150120, 50.00, "Bansi Dhaduk");
        BankAccount bankAccount2 = new BankAccount(1000480, 100.00, "Flora Patel");
        System.out.println("Account Number : " + bankAccount1.getAccountNumber() + "\nBalance : " + bankAccount1.getBalance() + "\nCustomer Name : " + bankAccount1.getCustomerName());
        System.out.println("Account Number : " + bankAccount2.getAccountNumber() + "\nBalance : " + bankAccount2.getBalance() + "\nCustomer Name : " + bankAccount2.getCustomerName());


        Person person1 = new Person("Bansi", 28, "Nowland dr");
        System.out.println("Name : " + person1.getName() + "\nAge : " + person1.getAge() + "\nAddress : " + person1.getAddress());
        person1.setAge(130);
        //System.out.println("Name : " + person1.getName() + "\nAge : " + person1.getAge() + "\nAddress : " + person1.getAddress());

        Employee employee1 = new Employee("Bansi",10000,"05/12/2022");
        System.out.println("Name : " + employee1.getName() +"\nSalary : " +employee1.getSalary() + "\nHire Date : " + employee1.getHireDate());
        employee1.setSalary(-1);
        System.out.println("Name : " + employee1.getName() +"\nSalary : " +employee1.getSalary() + "\nHire Date : " + employee1.getHireDate());

        Book book1 = new Book("Abc","A",12654548,100.50);
        System.out.println("Book name : " + book1.getTitle() + "\nAuthor : " + book1.getAuthor() + "\nISBN : " + book1.getIsbn() + "\nPrice : " + book1.getPrice());
        book1.setPrice(0);
        System.out.println("Book name : " + book1.getTitle() + "\nAuthor : " + book1.getAuthor() + "\nISBN : " + book1.getIsbn() + "\nPrice : " + book1.getPrice());

        House house1 = new House("Nowland dr",2200,3);
        System.out.println("House Details \nAddress : " + house1.getAddress() + "\nSquare Footage : " + house1.getSquareFootage() + "\nNumber of rooms : " + house1.getNumRooms());
        house1.setSquareFootage(-1200);
        house1.setNumRooms(-6);
        System.out.println("House Details \nAddress : " + house1.getAddress() + "\nSquare Footage : " + house1.getSquareFootage() + "\nNumber of rooms : " + house1.getNumRooms());

    }

}
