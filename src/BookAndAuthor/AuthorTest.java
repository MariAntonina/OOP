package BookAndAuthor;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 21.08.2017.
 */
public class AuthorTest {
    @Test
    public void autorGetNameTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Assert.assertEquals("Tolkien", author.getName());
    }

    @Test
    public void autorGetEmailTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Assert.assertEquals("email", author.getEmail());
    }
    @Test
    public void autorSetEmailTest(){
        Author author = new Author("Tolkien", "email", 'm');
        author.set_email("isjdhaoh");
        Assert.assertEquals("isjdhaoh", author.getEmail());
    }
    @Test
    public void autorGetGenderTest(){
        Author tolkien = new Author("Tolkien", "email", 'm');
        Assert.assertEquals(new Character('m'), tolkien.getGender());
    }
    @Test
    public void autorToStringTest(){
        Author author = new Author("Tolkien", "email", 'm');
        Assert.assertEquals("Author[name =Tolkien, email =email, gender =m]", author.toString());
    }
}
