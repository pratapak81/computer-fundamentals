package com.nsc.designpattern.creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Design Pattern in Java");
        System.out.println(movie.getTitle());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");
        System.out.println(anotherMovie.getTitle());

        if (movie == anotherMovie) {
            System.out.println("same instance");
        } else {
            System.out.println("difference instance");
        }

        Book book = (Book) registry.createItem("Book");
        book.setTitle("3 Monkey's");
        System.out.println(book.getPagesCount());
        System.out.println(book.getTitle());
    }
}
