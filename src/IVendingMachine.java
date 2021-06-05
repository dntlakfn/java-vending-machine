public interface IVendingMachine {


    /**
     * 금액 입력
     * @param money 사용자가 입력한금액
     */
    public void input(int money);

    /**
     * 아이템 반환
     * @return 아이템을 리턴
     * @param i 선택한 아이템
     */
    public int getItem(int i);

    /**
     * 잔돈 반환
     * @return 남은 돈 리턴
     */
    public int getMoney();
}
