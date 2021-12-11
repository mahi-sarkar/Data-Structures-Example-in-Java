package com.company;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args)
    {
        LinkedList<String> planetList = new LinkedList<>();
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        planetList.add("Mars");
        planetList.add("Jupiter");
        planetList.add("Saturn");
        planetList.add("Neptune");

        System.out.println("Printing all elements of the linked list");
        System.out.println(planetList);

        // Bangla Comment to be added
        System.out.println("Polling the last element of the linked list");
        System.out.println(planetList.pollLast());

        // Bangla Comment to be added
        System.out.println("Polling the first element of the linked list");
        System.out.println(planetList.pollFirst());

        // Bangla Comment to be added
        System.out.println("Take a look at the new last element of the linked list");
        System.out.println(planetList.peekLast());

        // Bangla Comment to be added
        System.out.println("Add a new element to te linked list in the front");
        System.out.println(planetList.offerFirst("Planet X"));

        // Bangla Comment to be added
        System.out.println("Add a new element to te linked list in the last");
        System.out.println(planetList.offerLast("Pluto"));

        // Bangla Comment to be added
        System.out.println("Print the modified Linked list");
        System.out.println(planetList);
    }
}