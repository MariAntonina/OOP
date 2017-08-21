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
@Test
    public void bookSetPriceTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Book book = new Book("LotR", author, 23.99);
        book.setPrice(765.98);
        Assert.assertEquals(765.98, book.getPrice(), 0.01);
    }
    @Test
    public void bookGetQtyTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Book book = new Book("LotR", author, 23.99);

        Assert.assertEquals(0, book.getQty());
    }
    @Test
    public void bookSetQtyTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Book book = new Book("LotR", author, 23.99);
        book.setQty(67);
        Assert.assertEquals(67, book.getQty());
    }
    @Test
    public void bookToStringTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Book book = new Book("LotR", author, 23.99);
        Assert.assertEquals("Book[ name = LotR, Author[name =Tolkien, email =email, gender =m], price = 23,990000, qty = 0]", book.toString());
    }
}
