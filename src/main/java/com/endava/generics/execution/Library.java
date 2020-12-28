package com.endava.generics.execution;

import com.endava.generics.audio.Audio;
import com.endava.generics.exeptions.ItemNotFoundById;
import com.endava.generics.exeptions.NotExistingItem;
import com.endava.generics.printer.Printer;
import com.endava.generics.video.Video;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Printer, E extends Audio, S extends Video> {
    private List<T> commonPrinted = new ArrayList<>();
    private List<E> commonAudio = new ArrayList<>();
    private List<S> commonVideo = new ArrayList<>();

    //add items in collection,if collection already contains this item -> print a message
    // about this and do not add it to collection (a method for each collection);
    public void addOneItem(T t) {
        if (commonPrinted.contains(t)) {
            System.out.println("Sorry, dude, but we have this item in the library");
        } else {
            commonPrinted.add(t);
        }
    }

    public void addOneItem(E e) {
        if (commonAudio.contains(e)) {
            System.out.println("Sorry, dude, but we have this item in the library");
        } else {
            commonAudio.add(e);
        }
    }

    public void addOneItem(S s) {
        if (commonVideo.contains(s)) {
            System.out.println("Sorry, dude, but we have this item in the library");
        } else {
            commonVideo.add(s);
        }
    }

    //remove an item from a collection,in case item doesn't exists –
    // throw a custom exception (a method for each collection);

    public void removeOneItem(T t) {
        if (!commonPrinted.contains(t)) {
            throw new NotExistingItem("Sorry, dude, but you're trying to delete an item, that we don't even have");
        } else {
            commonPrinted.remove(t);
        }
    }

    public void removeOneItem(E e) {
        if (!commonAudio.contains(e)) {
            throw new NotExistingItem("Sorry, dude, but you're trying to delete an item, that we don't even have");
        } else {
            commonAudio.remove(e);
        }
    }

    public void removeOneItem(S s) {
        if (!commonVideo.contains(s)) {
            throw new NotExistingItem("Sorry, dude, but you're trying to delete an item, that we don't even have");
        } else {
            commonVideo.remove(s);
        }
    }

    //to remove all items from a collection (a method for each collection);
    public void removeAllPrintedItems() {
        commonPrinted.removeAll(commonPrinted);
    }

    public void removeAllAudioItems() {
        commonPrinted.removeAll(commonAudio);
    }

    public void removeAllVideoItems() {
        commonPrinted.removeAll(commonVideo);
    }

    //get an item from a collection by provided id (a method for each type).
    //In case of invalid id, throw a custom exception for each type (a method for each collection);

    public T getPrintedById(int id) {
        for (T t : commonPrinted) {
            if (t.getId() == id) {
                return t;
            }
        }
        throw new ItemNotFoundById(id);
    }

    public E getAudioById(int id) {
        for (E e : commonAudio) {
            if (e.getId() == id) {
                return e;
            }
        }
        throw new ItemNotFoundById(id);
    }

    public S getVideoById(int id) {
        for (S s : commonVideo) {
            if (s.getId() == id) {
                return s;
            }
        }
        throw new ItemNotFoundById(id);
    }

    //Library should have the ability to print the information
    // about a specific collection(a method for each collection).
    // Example of an expected message for printed collection:
    // Printed collection contains: x items, where:
    // 1. Details of first item from list
    //2. Details of second item from list (use .toString() to print details about a item);
    public void infoPrinted() {
        System.out.println("Printed collection contains:  " + commonPrinted.size() + " items where:");
        for (Printer item : commonPrinted) {
            System.out.println((item.getName() + " - " + item.getPrice()).toString());
        }
    }

    public void infoAudio() {
        System.out.println("Audio collection contains:  " + commonAudio.size() + " items where:");
        for (Audio item : commonAudio) {
            System.out.println((item.getName() + " - " + item.getPrice()).toString());
        }
    }

    public void infoVideo() {
        System.out.println("Video collection contains:  " + commonVideo.size() + " items where:");
        for (Video item : commonVideo) {
            System.out.println((item.getName() + " - " + item.getPrice()).toString());
        }
    }

    //    print the information about its com.endava.collections:
    //    for example Library [library name] contains x printed, y audio and z video materials.
    public void totalInfo() {
        System.out.println("Our Library contains: " + commonPrinted.size() + " Printed Items " +
                commonAudio.size() + " Audio Items " + commonVideo.size() + " Video Items");
    }

}
