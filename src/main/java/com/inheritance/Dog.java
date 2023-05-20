package com.inheritance;

public class Dog extends Animal {
    @Override
    String eat() {
        return "Dog eat";
    }

    @Override
    String sleep() {
        return "Dog sleep";
    }
}
