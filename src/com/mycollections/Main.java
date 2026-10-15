/**
 *  Java program to create, update, read and delete a sequence of unique numbers.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create a HashSet instance.
        Set<Integer> mySet = new HashSet<>();

        // Add.
        mySet.add(123);
        mySet.add(789);
        mySet.add(3);
        mySet.add(5);
        mySet.add(7);
        mySet.add(6);
        mySet.add(9);

        // Print.
        mySet.stream().forEach(System.out::println);
        System.out.println("===================");

        // Delete.
        mySet.remove(789);

        // Print.
        mySet.stream().forEach(System.out::println);
        System.out.println("===================");

        // Add another value.
        mySet.add(11);

        // Print.
        mySet.stream().forEach(System.out::println);
        System.out.println("===================");

        // Clear.
        mySet.clear();

    }
}