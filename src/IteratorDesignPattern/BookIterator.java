package IteratorDesignPattern;

public class BookIterator implements Iterator{
    private BookCollection bookCollection;
    private int currPos = 0;

    public BookIterator(BookCollection bookCollection){
        this.bookCollection = bookCollection;
    }
    @Override
    public boolean hasNext(){
        return currPos < bookCollection.size;
    }
    @Override
    public Object next(){
        return hasNext() ? bookCollection.getBookAt(currPos++) : null;
    }
}
