package com.endava.collections;

public class Execute {
    public static void main(String[] args) {
        String s = "acb123123";
        CharList line = new CharList();
        line.charList(s);

        char contQ = 'q';
        char contA = 'a';

        System.out.println("Initial CharList: " + line.toString());
        System.out.println("Initial CharList length: " + line.length());
        System.out.println("A char under index 1: " + line.charAt(1));
        System.out.println("Index of char c is: " + line.indexOfChar('c'));
        System.out.println("Substring(from 3 to 5) of CharList: " + line.subString(3, 5));
        System.out.println("CharList without duplicate symbols: " + line.removeDuplicates());
        System.out.println("CharList without removed first occurance: " + line.removeFirstOccur('1'));
        System.out.println("CharList without removed all occurance: " + line.removeAll('1'));
        System.out.println("The CharList is empty: " + line.isEmpty());
        System.out.println("The CharList contains character " + contQ + " :" + line.contains(contQ));
        System.out.println("The CharList contains character " + contA + " :" + line.contains(contA));
        System.out.println("CharList is sorted in ascending order: " + line.sortAsc());
        System.out.println("CharList is sorted in descending order: " + line.sortDesc());
        System.out.println("CharList is shuffle: " + line.shuffle());
        System.out.println("CharList is reverse: " + line.reverse());
        System.out.println("CharList is cleared " + line.clearList());

    }
}
