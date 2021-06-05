import java.util.SplittableRandom;

public class Candy implements IItem{
    private String name;
    private int price;

    Candy(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(int price) {
    this.price = price;
    }
}
