// Exercise 1: WeakHashMap
//Write a program that demonstrates the usage of WeakHashMap to store and retrieve objects. Implement the following steps:
//Create a WeakHashMap object.
//Create a few objects and associate them with some data in the WeakHashMap.
//Print the size of the WeakHashMap.
//Set the strong references to the objects to null.
//Run the garbage collector and wait for a short time.
//Print the size of the WeakHashMap again and verify if the objects were garbage collected.

package com.collection;

import java.util.WeakHashMap;

public class WeakHapMapExample {
    public static void main(String[] args) {
        WeakHashMap<Key, Value> map = new WeakHashMap<>();

        // Create some keys and values
        Key key1 = new Key("key1");
        Value value1 = new Value("value1");
        Key key2 = new Key("key2");
        Value value2 = new Value("value2");

        // Put the key-value pairs in the map
        map.put(key1, value1);
        map.put(key2, value2);

        // Check the map's contents
        System.out.println("Map size: " + map.size());  // Output: Map size: 2
        System.out.println("Value for key1: " + map.get(key1));  // Output: Value for key1: value1

        // Let's make key1 eligible for garbage collection
        key1 = null;

        // Run garbage collection to remove the entry with key1
        System.gc();

        // Wait for a short time to allow garbage collection to complete
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Check the map's contents again
        System.out.println("Map size: " + map.size());  // Output: Map size: 1
        System.out.println("Value for key1: " + map.get(key1));  // Output: Value for key1: null
    }
}

class Key {
    private String id;

    public Key(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Key{" +
                "id='" + id + '\'' +
                '}';
    }
}
class Value {
    private String data;

    public Value(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Value{" +
                "data='" + data + '\'' +
                '}';
    }
}