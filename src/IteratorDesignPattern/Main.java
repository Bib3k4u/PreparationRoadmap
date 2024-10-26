package IteratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection(5);
        bookCollection.addBook("Java");
        bookCollection.addBook("Python");
        bookCollection.addBook("C#");
        bookCollection.addBook("GoLang");
        bookCollection.addBook("Javascript");

        Iterator iterator = bookCollection.createIterator();

        System.out.println("Books in Collections:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
