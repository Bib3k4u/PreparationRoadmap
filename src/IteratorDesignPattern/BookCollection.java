package IteratorDesignPattern;

public class BookCollection implements Collection{
    String books[];
    int size = 0;
    public BookCollection(int maxSize){
        books = new String[maxSize];
    }
    public void addBook(String book){
        if(size < books.length){
            books[size++] = book;
        }
    }
    public String getBookAt(int index){
        return books[index];
    }
    public int getLength(){
        return size;
    }
    @Override
    public Iterator createIterator(){
        return new BookIterator(this);
    }
}
