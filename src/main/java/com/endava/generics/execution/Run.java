package com.endava.generics.execution;

import com.endava.generics.audio.Audio;
import com.endava.generics.audio.AudioBook;
import com.endava.generics.audio.Song;
import com.endava.generics.printer.Book;
import com.endava.generics.printer.Magazine;
import com.endava.generics.printer.Printer;
import com.endava.generics.video.Movie;
import com.endava.generics.video.TvShow;
import com.endava.generics.video.Video;

public class Run {
    public static void main(String[] args) {
        Library<Printer, Audio, Video> library = new Library<>();

        Magazine magazine1 = new Magazine(1, 10, 99.0, "Vip Magazine", "Business");
        Magazine magazine2 = new Magazine(2, 20, 69.0, "OK Magazine", "Gossip");
        Book book1 = new Book(3,"Game of Thrones", 15000, 169.99, "George R. R. Martin", "Fantasy");
        Book book2 = new Book(4,"Lord of the Rings", 12000, 129.99, "J. R. R. Tolkien", "Fantasy");
        AudioBook audioBook1 = new AudioBook(5, "Moby Dick", 256894, "Novel", 99.99, "ENG", "Andrew Johnson");
        AudioBook audioBook2 = new AudioBook(6, "The Great Gatsby", 856972, "Tragedy", 149.99, "ENG", "Michael Winn");
        Song song1 = new Song(7,"Imagime", 589647, "Rock&Roll", 9.99, "John Lennon", "John Lennon");
        Song song2 = new Song(8,"Who wants to live forever", 589634, "Classic Rock", 14.99, "Queen", "Freddie Mercury");
        Movie movie1 = new Movie(9,"The Godfather", "FHD", 29.99, "Crime", 178);
        Movie movie2 = new Movie(10,"The Avengers", "Blue-Ray", 49.99, "Action", 170);
        TvShow tvShow1 = new TvShow(11,"Satuday Night Live", "Comedy", 12.99, "NBC", 2.6);
        TvShow tvShow2 = new TvShow(12,"American Ninja Warrior", "Sport", 19.99, "NBC", 2.4);

        //additional items
        Magazine magazine3 = new Magazine(13,30, 59.0, "Week News", "News");

        //add items
        library.addOneItem(magazine1);
        library.addOneItem(magazine2);
        library.addOneItem(book1);
        library.addOneItem(book2);
        library.addOneItem(audioBook1);
        library.addOneItem(audioBook2);
        library.addOneItem(song1);
        library.addOneItem(song2);
        library.addOneItem(movie1);
        library.addOneItem(movie2);
        library.addOneItem(tvShow1);
        library.addOneItem(tvShow2);

        //additional methods
        library.addOneItem(magazine3);
        library.removeOneItem(magazine2);
        library.removeAllVideoItems();
        library.getVideoById(10);
        library.infoPrinted();
        library.infoAudio();
        library.infoVideo();
        library.totalInfo();

    }
}
