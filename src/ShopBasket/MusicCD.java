package ShopBasket;

/**
 * Created by admin on 23.08.2017.
 */
public abstract class MusicCD implements IProduct {
    protected int price;
    protected String name;
    protected String title;
    protected String performer;

    public MusicCD(int price, String name, String title, String performer){
        this.price = price;
        this.name = name;
        this.title = title;
        this.performer = performer;
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

    public String getPerformer(){
        return performer;
    }

    public void setPerformer(String performer){
        this.performer = performer;
    }
}
