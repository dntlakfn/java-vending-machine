import java.util.ArrayList;

public abstract class VendingMachine implements IVendingMachine{
    protected int money = 0;
   private String name;
   private ArrayList<IItem> itemList;

    VendingMachine(String name, ArrayList<IItem> itemList) {
        this.name = name;
        this.itemList = itemList;
    }

    @Override
    public void input(int money) {
        System.out.println(money+"원을 넣었습니다");

        this.money = money;
    }

    @Override
    public int getItem(int i) {
        IItem item = itemList.get(i);
        System.out.println(itemList.get(i).getName() + "을/를 선택했습니다");
        if (item.getPrice() > this.money){
            System.out.println(item.getName() + "제품의 가격이 큽니다");
            return this.money;
        }
        System.out.println("맛있게 드세요.");
        return this.money - item.getPrice();
    }

    @Override
    public int getMoney() {
        System.out.println("잔돈을 반환합니다");
        return this.money;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<IItem> getItemList() {
        return this.itemList;
    }
}
