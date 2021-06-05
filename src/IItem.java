public interface IItem {
    /**
     * 아이템 이름 반환
     * @return 아이템 이름 리턴
     */
    public String getName();

    /**
     * 이름 설정
     * @param name 아이템 이름
     */
    public void setName(String name);

    /**
     * 아이템 가격 반환
     * @return 아이템의 가격을 리턴
     */
    public int getPrice();


    /**
     * 아이템 가격 설정
     * @param price 아이템의 가격
     */
    public void setPrice(int price);
}
