import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<VendingMachine> VMlist = new ArrayList<>();

        // 아이템 생성
        ArrayList<IItem> beverages = ItemList.getBeverages();
        ArrayList<IItem> candies = ItemList.getCandies();
        ArrayList<IItem> noodles = ItemList.getNoodles();

        // 자판기 생성
        BeverageVM BVM = new BeverageVM(beverages, "음료 자판기");
        CandyVM CVM = new CandyVM("사탕 자판기", candies);
        NoodleVM NVM = new NoodleVM("라면 자판기", noodles);

        // 자판기 리스트에 자판기추가
        VMlist.add(BVM);
        VMlist.add(CVM);
        VMlist.add(NVM);

        // 실행
        while (true) {
            System.out.println("\n어떤 자판기를 사용하시겠습니까? ");
            // 자판기 리스트 출력
            for (int i = 0; i < VMlist.size(); i++) System.out.println(i + "번 " + VMlist.get(i).getName());
            System.out.println();
            System.out.print("자판기 선택(-1은 종료) -> ");
            int selectNum = s.nextInt();
            if (selectNum == -1) {
                break;
            }
            VendingMachine vm = VMlist.get(selectNum);
            for (int i = 0; i<vm.getItemList().size(); i++) {
                IItem item = vm.getItemList().get(i);
                System.out.println(i + "번 " + item.getName() + item.getPrice());
            }

            // 돈 입력
            System.out.print("돈 넣어 -> ");
            int money = s.nextInt();
            vm.input(money);
            System.out.print("재품 골라 -> ");
            int selectItem = s.nextInt();
            int changes = vm.getItem(selectItem);
            System.out.println("남은 돈을 반환 합니다" + changes);


        }

    }
}
