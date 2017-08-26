package ShopBasket;

/**
 * Created by admin on 23.08.2017.
 */
public abstract class Book implements IProduct {

    protected int price;
    protected String name;
    protected String title;
    protected String Author;

    public Book(int price, String name, String title, String Author){
        this.price = price;
        this.name = name;
        this.title = title;
        this.Author = Author;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setProductName(String name) {
        this.name= name;
    }

    @Override
    public String getProductName() {
        return name;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return Author;
    }

    public void setAuthor(String author){
        this.Author = author;
    }
}
