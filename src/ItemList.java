import java.util.ArrayList;

public class ItemList {
    public static ArrayList<IItem> getBeverages (){
        ArrayList<IItem> beverages = new ArrayList<>();
        beverages.add(new Beverage(1000, "포카리"));
        beverages.add(new Beverage(1500, "마운틴듀"));
        beverages.add(new Beverage(1300, "펩시"));
        beverages.add(new Beverage(1000, "코카콜라"));
        return beverages;
    }
    public static ArrayList<IItem> getCandies() {
        ArrayList<IItem> candies = new ArrayList<>();
        candies.add(new Candy("츄파츕스", 500));
        candies.add(new Candy("맥주사탕", 200));
        candies.add(new Candy("새콤달콤", 400));
        candies.add(new Candy("마이쮸", 700));
        return candies;
    }

    public static ArrayList<IItem> getNoodles() {
        ArrayList<IItem> Noodles = new ArrayList<>();
        Noodles.add(new Noodle("신라면", 500));
        Noodles.add(new Noodle("안성탕면", 600));
        Noodles.add(new Noodle("삼양라면", 700));
        Noodles.add(new Noodle("진라면", 300));
        return Noodles;
    }
}
