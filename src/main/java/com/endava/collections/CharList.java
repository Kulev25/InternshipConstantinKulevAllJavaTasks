package com.endava.collections;

import java.util.*;
import java.util.stream.Collectors;

public class CharList {
    private final ArrayList<Character> list;

    public CharList() {
        this.list = new ArrayList<>();
    }

    public void charList(String s) {
        for (int i = 0; i < s.length(); i++) {
            this.list.add(s.charAt(i));
        }
    }

    public String toString() {
        return list.toString();
    }

    public int length() {
        return list.size();
    }

    public char charAt(int index) {
        return list.get(index);
    }

    public int indexOfChar(char ch) {
        return list.indexOf(ch);
    }

    public List<Character> subString(int from, int to) {
        return list.subList(from, to);
    }

    public List<Character> removeDuplicates() {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public CharList removeFirstOccur(Character c) {
        list.remove(c);
        return this;
    }

    public CharList removeAll(Character c) {
        boolean go = true;
        while (go) {
            go = list.remove(c);
        }
        return this;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(Character c) {
        return list.contains(c);
    }

    public CharList sortAsc() {
        list.sort(Comparator.naturalOrder());
        return this;
    }

    public CharList sortDesc() {
        list.sort(Comparator.reverseOrder());
        return this;
    }

    public CharList reverse() {
        Collections.reverse(list);
        return this;
    }

    public CharList shuffle() {
        Collections.shuffle(list);
        return this;
    }

    public CharList clearList() {
        list.clear();
        return this;
    }

}
