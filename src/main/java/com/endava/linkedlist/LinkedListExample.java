package com.endava.linkedlist;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("New York");
        list.add("Washington");
        list.add("Los Angeles");

        //Adding an element to the first position
        list.addFirst("Miami");

        //Adding an element to the last position
        list.addLast("Tampa");

        //Adding an element to the 3rd position
        list.add(2, "San Francisco");

        //Iterating LinkedList
        System.out.print("\nAfter adding all elements: ");
        //Iterating LinkedList again
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Removing First element
        list.removeFirst();

        //Removing Last element
        list.removeLast();

        //Display Linked List Content
        System.out.println("Linked List Content: " +list);

        //returns the item of the specified index from the list.
        Object var = list.get(2);
        System.out.println("Third element is :" + var);

        //Set Values
        list.set(0, "Honolulu");
        Object firstcity = list.get(0);
        System.out.println("First element : " + firstcity);

        // Add to a specified position and remove from a specified position
        list.add(1, "Orlando");
        System.out.println("Added Orlando as second element: " +list);
        list.remove(2);
        System.out.println("Removed third element: " +list);

        //Removes all the elements of a list.
        list.clear();
        System.out.println("Linked List Content is empty: " +list);

    }
}