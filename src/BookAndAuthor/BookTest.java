package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 21.08.2017.
 */
public class BookTest {
    @Test
    public void bookGetNameTest(){
        Author tolkien = new Author("Tolkien", "email", 'm');
        Book book = new Book("LotR", tolkien, 23.99);
        Assert.assertEquals("LotR", book.getName());
    }

    @Test
    public void bookGetAuthorTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Book book = new Book("LotR", author, 23.99);
        Assert.assertEquals("Tolkien", author.getName());
    }
    @Test
    public void bookGetPriceTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Book book = new Book("LotR", author, 23.99);
        Assert.assertEquals(23.99, book.getPrice(), 0.01);
    }

    public void bookSetPriceTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Book book = new Book("LotR", author, 23.99);
        Assert.assertEquals(23.99, book.getPrice(), 0.01);
    }
    @Test
    public void autorToStringTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Assert.assertEquals("Author[name =Tolkien, email =email, gender =m]", author.toString());
    }
}
