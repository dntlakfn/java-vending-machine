import java.util.ArrayList;

public class NoodleVM extends VendingMachine{
    NoodleVM(String name, ArrayList<IItem> itemList) {
        super(name, itemList);
    }

    @Override
    public int getItem(int i) {
        IItem item = super.getItemList().get(i);
        System.out.println(item.getName() + "을/를 선택했습니다");
        if (item.getPrice() > this.money){
            System.out.println(item.getName() + "제품의 가격이 큽니다");
            return this.money;
        }
        System.out.println("조리중 ...");
        System.out.println("맛있게 드세요.");
        return this.money - item.getPrice();
    }
}
